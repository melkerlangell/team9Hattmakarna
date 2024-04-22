/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rebec
 */
public class MomsHanterare implements Serializable {
    
    private static double utgaendeMoms12Procent;
    
    private static double ingaendeMoms25Procent;
    private static double utgaendeMoms25Procent;
    
    private static double timMoms = 0.12;
    private static double materialMoms = 0.25;
    private static double accessoarMoms = 0.25;
    private static double expressMoms = 0.25;
    
    public MomsHanterare(){
        ArrayList<Double> varden = FilHanterare.laddaInMomsFil();
        utgaendeMoms12Procent = varden.get(0);
        utgaendeMoms25Procent = varden.get(1);
        ingaendeMoms25Procent = varden.get(2);
    }
    
    public static void adderaTillMoms12Procent(double summa){
        utgaendeMoms12Procent += summa;
    }
            
    public static void adderaTillMoms25Procent(boolean ingaende, double summa){
        if(ingaende){
            ingaendeMoms25Procent += summa;
        }
        else{
            utgaendeMoms25Procent += summa;
        }
    }
    
    public static double getIngaendeMoms25Procent(){
        return ingaendeMoms25Procent;
    }
    
    public static double getUtgaendeMoms12Procent(){
        return utgaendeMoms12Procent;
    }
    
    public static double getUtgaendeMoms25Procent(){
        return utgaendeMoms25Procent;
    }
    
    public static double getTotalaUtgaendeMoms(){
        return utgaendeMoms12Procent + utgaendeMoms25Procent;
    }
    
    public static double getMomsForRedovisning(){
        double ingaendeMoms = ingaendeMoms25Procent;
        double utgaendeMoms = utgaendeMoms12Procent + utgaendeMoms25Procent;
        
        double moms = utgaendeMoms - ingaendeMoms;
        
        return moms;
    }
    
    public void resetMoms(){
        utgaendeMoms12Procent = 0;
        
        ingaendeMoms25Procent = 0;
        utgaendeMoms25Procent = 0;
        
        FilHanterare.sparaMomsFil();
    }
    
    public static void skickaMoms(Hatt enHatt){
        Material ettMaterial = null;
        for(Material mat : Material.getAllaMaterial()){
            if(mat.getBenamning().equals(enHatt.getMaterial())){
                ettMaterial = mat;
                break;
            }
        }
        if(ettMaterial != null){
            double prisPerMeter = ettMaterial.getPrisPerMeter();
            
            double materialPris = prisPerMeter * enHatt.getAntalMeter();
            adderaTillMoms25Procent(false, materialPris * materialMoms);
        }
        
        for(Accessoar enAccessoar : Accessoar.getAllaAccessoar()){
            if(enAccessoar.getBenamning().equals(enHatt.getAccessoar())){
                adderaTillMoms25Procent(false, enAccessoar.getPris() * accessoarMoms);
            }
        }
        
        PrisBeraknare PB = new PrisBeraknare();
        double pris = PB.raknaUtPris(enHatt);
        if(enHatt.getOmExpress()){
            adderaTillMoms25Procent(false, (pris * (PB.getExpressKostnad() - 1)) * expressMoms);
        }
        
        adderaTillMoms12Procent((enHatt.getAntalTimmar() * PB.getPrisPerTimme()) * timMoms);
        
        FilHanterare.sparaMomsFil();
    }
}

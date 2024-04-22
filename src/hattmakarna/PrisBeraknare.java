/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author rebec
 */
public class PrisBeraknare {
    
    //Man skulle vilja kunna sätta dessa någonstans i programmet kanske?
    private static double prisPerTimme;
    private static double expressKostnad;
    private static double vinstMarginal = 1;
    
    public PrisBeraknare(){
        prisPerTimme = 400.0;
        expressKostnad = 1.20;
    }
    
    public PrisBeraknare(double prisPerTimme, double expressKostnad){
        this.prisPerTimme = prisPerTimme;
        this.expressKostnad = expressKostnad;
    }
    
    public static double raknaUtPris(Hatt enHatt){
        double pris = 0.00;
        
        //Räknar ut priser per meter av materialet
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
            pris += materialPris;
        }
        
        for(Accessoar enAccessoar : Accessoar.getAllaAccessoar()){
            if(enAccessoar.getBenamning().equals(enHatt.getAccessoar())){
                pris += enAccessoar.getPris();
            }
        }
        
        double arbetsPris = prisPerTimme * enHatt.getAntalTimmar();
        pris += arbetsPris;
        
        if(enHatt.getOmExpress()){
            pris *= expressKostnad;
        }
        
        pris *= vinstMarginal;
        
        return pris;
    }
    
    public double getPrisPerTimme(){
        return prisPerTimme;
    }
    
    public double getExpressKostnad(){
        return expressKostnad;
    }
}

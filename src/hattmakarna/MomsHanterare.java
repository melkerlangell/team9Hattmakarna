/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author rebec
 */
public class MomsHanterare {
    
    private static double utgaendeMoms12Procent;
    
    private static double ingaendeMoms25Procent;
    private static double utgaendeMoms25Procent;
    
    public void adderaTillMoms12Procent(double summa){
        utgaendeMoms12Procent += summa;
    }
            
    public void adderaTillMoms25Procent(boolean ingaende, double summa){
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
    
    public static void resetMoms(){
        utgaendeMoms12Procent = 0;
        
        ingaendeMoms25Procent = 0;
        utgaendeMoms25Procent = 0;
    }
}
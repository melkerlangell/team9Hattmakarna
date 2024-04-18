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
    
    private double utgaendeMoms12Procent;
    
    private double ingaendeMoms25Procent;
    private double utgaendeMoms25Procent;
    
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
    
    public double getIngaendeMoms25Procent(){
        return ingaendeMoms25Procent;
    }
    
    public double getUtgaendeMoms12Procent(){
        return utgaendeMoms12Procent;
    }
    
    public double getUtgaendeMoms25Procent(){
        return utgaendeMoms25Procent;
    }
    
    public double getMomsForRedovisning(){
        double ingaendeMoms = ingaendeMoms25Procent;
        double utgaendeMoms = utgaendeMoms12Procent + utgaendeMoms25Procent;
        
        double moms = utgaendeMoms - ingaendeMoms;
        
        return moms;
    }
    
    public void resetMoms(){
        utgaendeMoms12Procent = 0;
        
        ingaendeMoms25Procent = 0;
        utgaendeMoms25Procent = 0;
    }
}

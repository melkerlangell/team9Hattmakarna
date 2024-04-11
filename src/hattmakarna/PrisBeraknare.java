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
    private double prisPerTimme;
    private double expressKostnad;
    private double vinstMarginal = 1;
    
    public PrisBeraknare(){
        prisPerTimme = 400.0;
        expressKostnad = 200.0;
    }
    
    public PrisBeraknare(double prisPerTimme, double expressKostnad){
        this.prisPerTimme = prisPerTimme;
        this.expressKostnad = expressKostnad;
    }
    
    public double raknaUtPris(String ettMaterialNamn, double antalMeter, String ettAccessoarNamn, double antalTimmar, boolean arExpress){
        double pris = 0.00;
        
        //Räknar ut priser per meter av materialet
        Material ettMaterial = null;
        for(Material mat : Material.getAllaMaterial()){
            if(mat.getBenamning().equals(ettMaterialNamn)){
                ettMaterial = mat;
                break;
            }
        }
        if(ettMaterial != null){
            double prisPerMeter = ettMaterial.getPrisPerMeter();
            pris += prisPerMeter * antalMeter;
        }
        
        for(Accessoar enAccessoar : Accessoar.getAllaAccessoar()){
            if(enAccessoar.getBenamning().equals(ettAccessoarNamn)){
                pris += enAccessoar.getPris();
            }
        }
        
        pris += prisPerTimme * antalTimmar;
        
        if(arExpress){
            pris += expressKostnad;
        }
        
        pris *= vinstMarginal;
        
        return pris;
    }
}

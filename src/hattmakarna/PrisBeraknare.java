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
    private MomsHanterare momsHanterare;
    
    //Man skulle vilja kunna sätta dessa någonstans i programmet kanske?
    private double prisPerTimme;
    private double expressKostnad;
    private double vinstMarginal = 1;
    
    private double timMoms = 0.12;
    private double materialMoms = 0.25;
    private double accessoarMoms = 0.25;
    private double expressMoms = 0.25;
    
    public PrisBeraknare(){
        momsHanterare = new MomsHanterare();
        
        prisPerTimme = 400.0;
        expressKostnad = 1.20;
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
            double materialPris = prisPerMeter * antalMeter;
            pris += materialPris;
        }
        
        for(Accessoar enAccessoar : Accessoar.getAllaAccessoar()){
            if(enAccessoar.getBenamning().equals(ettAccessoarNamn)){
                pris += enAccessoar.getPris();
            }
        }
        
        double arbetsPris = prisPerTimme * antalTimmar;
        pris += arbetsPris;
        
        if(arExpress){
            pris *= expressKostnad;
        }
        
        pris *= vinstMarginal;
        
        return pris;
    }
    
    public void skickaMoms(Hatt enHatt, int antalTimmar){
        Material ettMaterial = null;
        for(Material mat : Material.getAllaMaterial()){
            if(mat.getBenamning().equals(enHatt.getMaterial())){
                ettMaterial = mat;
                break;
            }
        }
        if(ettMaterial != null){
            double prisPerMeter = ettMaterial.getPrisPerMeter();
            
            //TA BORT DENNA
            int antalMeter = 1;
            
            double materialPris = prisPerMeter * antalMeter;
            momsHanterare.adderaTillMoms25Procent(false, materialPris * materialMoms);
        }
        
        for(Accessoar enAccessoar : Accessoar.getAllaAccessoar()){
            if(enAccessoar.getBenamning().equals(enHatt.getAccessoar())){
                momsHanterare.adderaTillMoms25Procent(false, enAccessoar.getPris() * accessoarMoms);
            }
        }
        
        if(enHatt.getOmExpress()){
            momsHanterare.adderaTillMoms25Procent(false, enHatt.getExpressTillagg() * expressMoms);
        }
        
        momsHanterare.adderaTillMoms12Procent((enHatt.getAntalTimmar() * prisPerTimme) * timMoms);
    }
}

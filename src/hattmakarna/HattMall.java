/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author noaha
 */
public class HattMall {
    private String benamning;
    private String storlek;
    private String farg;
    private String accessoar;
    private String material;
    private int id;

    public HattMall(String benamning, String storlek,String farg, String accessoar, String material, int id ){
        this.benamning = benamning;
        this.storlek = storlek;
        this.farg = farg;
        this.accessoar = accessoar;
        this.material = material;
        this.id = id;
        
    }
    
    public String getBenamning(){
        return benamning;
    }
    
    public void setBenamning(String benamning) {
        this.benamning = benamning;
    }
    
    public String getStorlek(){
        return storlek;
    }
    
     public void setStorlek(String storlek) {
        this.storlek = storlek;
    }
    
    public String getFarg(){
        return farg;
    }
    
     public void setFarg(String farg) {
        this.farg = farg;
    }
    
    public String getAccessoar(){
        return accessoar;
    }
    
    public void setAccessoar(String accessoar) {
        this.accessoar = accessoar;
    }
    
    public String getMaterial(){
        return material;
    }
    
     public void setMaterial(String material) {
        this.material = material;
    }
    
     public int getID(){
         return id;
     }
     public void setID(int id){
         this.id = id;
     }
     
    public String getInformation() {
        return benamning + ", " + storlek + ", " + farg + ", " + accessoar + ", " + material;
    }
    

    
}

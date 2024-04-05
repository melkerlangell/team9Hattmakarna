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

    public HattMall(String benamning, String storlek,String farg, String accessoar, String material ){
        this.benamning = benamning;
        this.storlek = storlek;
        this.farg = farg;
        this.accessoar = accessoar;
        this.material = material;
        
    }
    
    public String getBenamning(){
        return benamning;
    }
    
    public String getStorlek(){
        return storlek;
    }
    
    public String getFarg(){
        return farg;
    }
    
    public String getAccessoar(){
        return accessoar;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public String getInformation() {
        return benamning + ", " + storlek + ", " + farg + ", " + accessoar + ", " + material;
    }
    

    
}

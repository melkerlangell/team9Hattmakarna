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
    private String storlek;
    private String farg;
    private String accessoar;
    private String material;

    public HattMall(String storlek,String farg, String accessoar, String material ){
        this.storlek = storlek;
        this.farg = farg;
        this.accessoar = accessoar;
        this.material = material;
    }
    
    public String getInformation() {
        return storlek + ", " + farg + ", " + accessoar + ", " + material;
    }  
}

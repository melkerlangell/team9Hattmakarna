/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;
import java.io.Serializable;

/**
 *
 * @author rebec
 */
public class Hatt extends HattMall implements Serializable {
    private String beskrivning;
    private boolean arExpress;
    private boolean arSpecial;
    private double expressTillagg;
    private int antalTimmarAttSkapa;
    
    public Hatt(String benamning, String storlek, String farg, String accessoar, String material, String beskrivning){
        super(benamning, storlek, farg, accessoar, material);
        this.beskrivning = beskrivning;
    }
    
    public boolean getOmExpress(){
        return arExpress;
    }
    
    public boolean getOmSpecial(){
        return arSpecial;
    }
    
    public double getExpressTillagg(){
        return expressTillagg;
    }
    
    public int getAntalTimmar(){
        return antalTimmarAttSkapa;
    }
}

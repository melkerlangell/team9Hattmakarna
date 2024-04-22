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
    private double antalMeter;
    private int antalTimmarAttSkapa;
    
    public Hatt(String benamning, String storlek, String farg, String accessoar, String material, String beskrivning, boolean arExpress, double antalMeter, int antalTimmar){
        super(benamning, storlek, farg, accessoar, material);
        this.beskrivning = beskrivning;
        this.arExpress = arExpress;
        this.antalMeter = antalMeter;
        antalTimmarAttSkapa = antalTimmar;
    }
    
    public String getBeskrivning(){
        return beskrivning;
    }
    
    public boolean getOmExpress(){
        return arExpress;
    }
    
    public boolean getOmSpecial(){
        return arSpecial;
    }
    
    public double getAntalMeter(){
        return antalMeter;
    }
    
    public int getAntalTimmar(){
        return antalTimmarAttSkapa;
    }
}

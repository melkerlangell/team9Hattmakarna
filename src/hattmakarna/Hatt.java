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
    
    public Hatt(String benamning, String storlek, String farg, String accessoar, String material, String beskrivning){
        super(benamning, storlek, farg, accessoar, material);
        this.beskrivning = beskrivning;
    }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author rebec
 */
public class Hatt extends HattMall {
    private int hattID;
    private String beskrivning;
    
    public Hatt(String benamning, String storlek, String farg, String accessoar, String material, int id, String beskrivning){
        super(benamning, storlek, farg, accessoar, material);
        hattID = id;
        this.beskrivning = beskrivning;
    }  
}

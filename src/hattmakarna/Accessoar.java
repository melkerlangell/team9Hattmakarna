/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Melker
 */
public class Accessoar {
    private String benamning;
    private Material material;
    private double pris;
    
    private static ArrayList<Accessoar> allaAccessoarer = new ArrayList<Accessoar>();
    
    public Accessoar() {
        laggTillAccessoar();
    }
    
    public Accessoar(String benamning, String material, double pris) {
        this.benamning = benamning;
        for(Material ettMaterial : Material.getAllaMaterial()){
            if(ettMaterial.getBenamning().equals(material)){
                this.material = ettMaterial;
            }
        }
        this.pris = pris;
        allaAccessoarer.add(this);
    }
    
    public String getBenamning() {
        return benamning;
    }
    
    public Material getMaterial() {
        return material;
    }
    
    public double getPris(){
        return pris;
    }
    
    public static ArrayList<Accessoar> getAllaAccessoar() {
        return allaAccessoarer;
    }
    
    private static void laggTillAccessoar(){
        new Accessoar("Fjäder", "Annat", 5.00);
        new Accessoar("Knapp", "Trä", 2.00);
        new Accessoar("Ingen", "Annat", 0.00);
    } 
}
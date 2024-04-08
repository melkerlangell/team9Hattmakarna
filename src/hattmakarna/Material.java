/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;

/**
 *
 * @author rebec
 */
public class Material {
    private String benamning;
    private double prisPerMeter;
    
    private static ArrayList<Material> allaMaterial = new ArrayList<Material>();
    
    public Material(){ laggTillMaterial(); };
    
    public Material(String benamning, double prisPerMeter){
        this.benamning = benamning;
        this.prisPerMeter = prisPerMeter;
        allaMaterial.add(this);
    }
    
    public String getBenamning(){
        return benamning;
    }
    
    public double getPrisPerMeter(){
        return prisPerMeter;
    }
    
    public static ArrayList<Material> getAllaMaterial(){
        return allaMaterial;
    }
    
    //Tillfällig lösning
    public static void laggTillMaterial(){
        new Material("Läder", 60.0);
        new Material("Bomull", 20.0);
        new Material("Jeans", 40.0);
    }
}

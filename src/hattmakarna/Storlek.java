/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rebec
 */
public class Storlek {
    private static HashMap<String, String> hattMatt = new HashMap<String, String>();
    
    public Storlek(){
        hattMatt = new HashMap<String, String>(){{
            put("XS", "52-53");
            put("S", "54-55");
            put("M", "56-57");
            put("L", "58-59");
            put("XL", "60-61");
            put("XXL", "62-63");
        }};
    }
    
    public static ArrayList<String> getStorlekStrings(){
        ArrayList<String> storlekIStrings = new ArrayList<String>();
        for(String storlek : hattMatt.keySet()){
            storlekIStrings.add(storlek + "(" + hattMatt.get(storlek) + " cm)");
        }
        return storlekIStrings;
    }
    
    public static String translateStorlek(String hattString){
        String[] string = hattString.split(" ");
        String storlek = string[0];
        return storlek;
    }
}

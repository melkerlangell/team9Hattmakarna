/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rebec
 */
public class Storlek {
    private static ArrayList<String> storlekar;
    
    public Storlek(){
        String[] storleksArray = new String[]{  "XS",
                                                "S",
                                                "M",
                                                "L",
                                                "XL",
                                                "XXL"   };
        storlekar = new ArrayList<String>(Arrays.asList(storleksArray));
    }
    
    public static ArrayList<String> getStorlekar(){
        return storlekar;
    }
}

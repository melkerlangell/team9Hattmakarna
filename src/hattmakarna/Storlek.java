/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rebec
 */
public class Storlek {
    private static HashMap<String, String> hattMatt = new HashMap<String, String>();
    
    public Storlek(){
        HashMap<String, String> matt = new HashMap<String, String>(){{
            put("XS", "52-53");
            put("S", "54-55");
            put("M", "56-57");
        }};
    }
}

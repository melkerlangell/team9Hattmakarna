/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rebec
 */

public class Farg {
    private static ArrayList<String> fargLista = new ArrayList<String>();
    
    public Farg(){
        String[] fargArray = new String[]{  "Svart",
                                            "Brun",
                                            "Grå",
                                            "Vit",
                                            "Grön",
                                            "Lila",
                                            "Blå",
                                            "Orange",
                                            "Rosa",
                                            "Ljusblå",
                                            "Gul",
                                            "Röd"   };
        fargLista = new ArrayList<String>(Arrays.asList(fargArray));
    }
    
    public static ArrayList<String> getFarger(){
        return fargLista;
    }
}

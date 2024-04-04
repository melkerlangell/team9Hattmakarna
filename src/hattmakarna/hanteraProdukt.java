package hattmakarna;

import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noaha
 */ 





public class hanteraProdukt {
    
    // ArrayList to store car names
    private ArrayList<String> produktLista;

    // Constructor to initialize the ArrayList
    public hanteraProdukt() {
        produktLista = new ArrayList<>();
    }

    // Method to add a car to the list
    public void addHatt(String hattnamn) {
        produktLista.add(hattnamn);
    }
    
}

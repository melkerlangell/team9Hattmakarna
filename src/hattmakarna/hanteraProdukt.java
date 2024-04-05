package hattmakarna;

import java.util.ArrayList;

public class hanteraProdukt {
    
    // ArrayList to store hatt names
    private ArrayList<Hatt> produktLista;

    // Constructor to initialize the ArrayList
    public hanteraProdukt() {
        produktLista = new ArrayList<>();
        
        Hatt hatt1 = new Hatt("M", "Blå", "Ingen", "Läder");
        Hatt hatt2 = new Hatt("S","Grå","Fjäder","bomull");
        addHatt(hatt1);
        addHatt(hatt2);
        
    }

    // Method to add a hatt to the list
    public void addHatt(Hatt hattObjekt) {
        produktLista.add(hattObjekt);
    }
    
    public void TaBortHatt(Hatt hattIndex){
        produktLista.remove(hattIndex);

    }
    
    public void visaHattar(){
        
        for (Hatt enHatt : produktLista){
            System.out.println(enHatt.getInformation());
        }
}
    
    
}

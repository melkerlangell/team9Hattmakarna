package hattmakarna;

import java.util.ArrayList;

public class ProduktHanterare {
    
    // ArrayList to store hatt names
    private ArrayList<HattMall> produktLista;

    // Constructor to initialize the ArrayList
    public ProduktHanterare() {
        produktLista = new ArrayList<>();
        
        HattMall hatt1 = new HattMall("M", "Blå", "Ingen", "Läder");
        HattMall hatt2 = new HattMall("S","Grå","Fjäder","bomull");
        addHatt(hatt1);
        addHatt(hatt2);
        
        HattMall updatedHatt = new HattMall("L", "Röd", "Band", "Silke");

        // Update the element at index 1 in the ArrayList
        produktLista.set(1, updatedHatt);
        System.out.println("Uppdaterad produktlista:"+updatedHatt.getInformation());
        
    }

    // Method to add a hatt to the list
    public void addHatt(HattMall hattObjekt) {
        produktLista.add(hattObjekt);
    }
    
    public void TaBortHatt(HattMall enHatt){
        for (int i = 0; i < produktLista.size(); i++){
            HattMall hattObjekt = produktLista.get(i);
            if (enHatt == hattObjekt){
                produktLista.remove(i);
                break;
            }
        }

    }
    
    public void visaHattar(){
        
        for (HattMall enHatt : produktLista){
            System.out.println(enHatt.getInformation());
        }
}
    
    
}

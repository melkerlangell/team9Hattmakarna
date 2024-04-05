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
        produktLista.set(1, updatedHatt);
        System.out.println("Uppdaterat hattObjekt: " + updatedHatt.getInformation());
    }

    // Method to add a hatt to the list
    public void addHatt(HattMall hattObjekt) {
        produktLista.add(hattObjekt);
    }
    
    public void taBortHatt(HattMall enHatt){
        for (int i=0; i<produktLista.size(); i++){
            HattMall enHattIListan = produktLista.get(i);
            if(enHatt == enHattIListan){
                produktLista.remove(enHattIListan);
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

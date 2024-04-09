package hattmakarna;

import java.util.ArrayList;

public class ProduktHanterare {
    
    // ArrayList to store hatt names
    private static ArrayList<HattMall> produktLista;

    // Constructor to initialize the ArrayList
    public ProduktHanterare() {
        produktLista = new ArrayList<>();        
        produktLista = FilHanterare.laddaInProduktFil();
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
    
    
    public static ArrayList<HattMall> getProduktLista(){
        return produktLista;
    }
}

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
    public static void addHatt(HattMall hattObjekt) {
        produktLista.add(hattObjekt);
        FilHanterare.sparaProduktFil(produktLista);
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
    
    public static void uppdateraHattmall(HattMall enHatt){
        for(int i = 0; i < produktLista.size(); i++){
            if(produktLista.get(i).getID().equals(enHatt.getID())){
                produktLista.set(i, enHatt);
                FilHanterare.sparaProduktFil(produktLista);
                for(HattMall enHattMall : produktLista){
                    System.out.println(enHattMall.getBenamning());
                }
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
    
    public void resettaProduktLista(){
        produktLista.clear();
        addHatt(new HattMall("Höghatt", "S", "Svart", "Fjäder", "Siden"));
        addHatt(new HattMall("Keps", "M", "Blå", "Ingen", "Denim"));
        addHatt(new HattMall("Plommonstop", "L", "Lila", "Knapp", "Bomull"));      
        FilHanterare.sparaProduktFil(produktLista);
    }
}

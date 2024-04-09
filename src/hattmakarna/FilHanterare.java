/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author rebec
 */
public class FilHanterare { 
    
    public static void sparaProduktFil(ArrayList<HattMall> hattLista) {        
        try (FileOutputStream fos = new FileOutputStream("HattMallsRegister.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        // Skriv ArrayList till filen
        oos.writeObject(hattLista);
        System.out.println("Produkter sparade till filen.");

    } catch (IOException e) {
            System.out.println(e);
        }
    }
        
    public static ArrayList<HattMall> laddaInProduktFil(){
        ArrayList<HattMall> enHattMallLista = new ArrayList<HattMall>(); 
        try (FileInputStream fis = new FileInputStream("HattMallsRegister.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Läs ArrayList från filen
            enHattMallLista = (ArrayList<HattMall>) ois.readObject();
            System.out.println("Produker inlästa från filen.");
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("HERE");
        }
        return enHattMallLista;
    }
    
    //Eftersom vi kör serialized objects, så fort det blir en ändring i klassen går sparfilen out of style
    //NOT GOOD. Men det är som det är! Här är en funktion för att resetta den till det som finns i vår excel
    public static void resettaSparadeProdukter(){
        ArrayList<HattMall> mallLista = new ArrayList<HattMall>();
        mallLista.add(new HattMall("Höghatt", "S", "Svart", "Fjäder", "Siden"));
        mallLista.add(new HattMall("Keps", "M", "Blå", "Ingen", "Denim"));
        mallLista.add(new HattMall("Plommonstop", "L", "Lila", "Knapp", "Bomull"));
        sparaProduktFil(mallLista);
    }
}  


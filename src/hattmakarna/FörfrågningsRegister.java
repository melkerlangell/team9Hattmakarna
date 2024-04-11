/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class FörfrågningsRegister {

    private static ArrayList<Förfrågning> förfrågningar = new ArrayList();
    //Quickfix för att kunna sätta ett id utan manuell input, funkar inte i längden /Rebecka
    private static int antalForfragningar;
    
    public FörfrågningsRegister(){
        laddaInFil();
    }

    public static void sparaFil() {       
        try (FileOutputStream fos = new FileOutputStream("ForfrogningsRegister.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Skriv ArrayList till filen
            oos.writeObject(förfrågningar);
            System.out.println("Förfrågninar sparade till filen.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void laddaInFil(){
        förfrågningar = null;
        try (FileInputStream fis = new FileInputStream("ForfrogningsRegister.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Läs ArrayList från filen
            förfrågningar = (ArrayList<Förfrågning>) ois.readObject();
            System.out.println("Förfrågningar inlästa från filen.");
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    
    /*
    public void test(){
        System.out.println("hej!");
        for (Förfrågning enFörfrågning: förfrågningar){
            System.out.println(enFörfrågning.getDate());
            System.out.println(enFörfrågning.getId());
            System.out.println("hej?");
            System.out.println(enFörfrågning.getKundId());
        }
    }
    */

    //Gjorde om lite
    public static void laggTillForfragan(String datum, Kund enKund, Hatt enHatt) {
        //Quickfix /Rebecka
        int tempID = antalForfragningar;
        antalForfragningar++;
        
        Förfrågning nyForfragan = new Förfrågning(tempID, datum, enHatt, enKund);
        förfrågningar.add(nyForfragan);
        sparaFil();
        
        /*
        //Ett sätt att automatisera idet kanske skulle vara bra
        Förfrågning F1 = new Förfrågning(1, "2000-01-01");
        F1.laggInKund();

        förfrågningar.add(F1);
        Förfrågning F2 = new Förfrågning(2, "1999-01-01");
        F2.laggInKund();
        förfrågningar.add(F2);
        */
    }

    public void taBort(int id) {
        for (Förfrågning enFörfrågning : förfrågningar) {
            if (enFörfrågning.getId() == id) {
                förfrågningar.remove(enFörfrågning);
                break;
            }
        }
    }
    
    public static void skrivUtRegister(){
        for(Förfrågning enForfragan : förfrågningar){
            System.out.println(enForfragan.getInformation());
        }
    }
    
    private static void resettaRegister(){
        förfrågningar.clear();
        sparaFil();
    }
}
    


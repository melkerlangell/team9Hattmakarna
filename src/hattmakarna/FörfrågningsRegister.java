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

    public static void sparaFil() {

        try (FileOutputStream fos = new FileOutputStream("ForfrogningsRegister.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Skriv ArrayList till filen
            oos.writeObject(förfrågningar);
            System.out.println("Förfrågningar sparade till filen.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static ArrayList<Förfrågning> getForfragningar(){
        return förfrågningar;
    } 

    public static void laddaInFil() {
        förfrågningar = null;
        try (FileInputStream fis = new FileInputStream("ForfrogningsRegister.dat"); ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Läs ArrayList från filen
            förfrågningar = (ArrayList<Förfrågning>) ois.readObject();
            System.out.println("Objekt inlästa från filen.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void test() {
                
        {
            System.out.println("---------");
            for (Förfrågning enFörfrågning : förfrågningar) {
                System.out.println(enFörfrågning.getDate());
                Kund kund = enFörfrågning.getKund();
                Hatt hatt = enFörfrågning.getHatt();
                if (kund != null) {
                    System.out.println("Namn: " + kund.getNamn());
                    System.out.println("Mail: " + kund.getEpost());
                    if (hatt != null) {
                        System.out.println("Typ: " + hatt.getBenamning());
                        System.out.println("Material: " + hatt.getMaterial());
                    } else {
                        System.out.println("Kunden har ingen hatt.");
                    }
                } else {
                    System.out.println("Kund is null");
                }
            }
           System.out.println("---------"); 
        }
    }
    
    public static  ArrayList<String> getComboBoxData() {                
        ArrayList<String> comboBoxData = new ArrayList<>();
        
        if(förfrågningar.size() <= 0){
            comboBoxData.add("Det saknas förfrågningar.");
        }

        for (Förfrågning enFörfrågning : förfrågningar) {
            Kund kund = enFörfrågning.getKund();
            Hatt hatt = enFörfrågning.getHatt();
            if (kund != null && hatt != null) {
                comboBoxData.add(enFörfrågning.getDate() + ": " + kund.getNamn() + ", " + hatt.getBenamning());
            }
        }
        return comboBoxData;
    }
    
       //Inte hållbart, man borde skicka in idet istället
    public static String getForfragningsInfo(int forfragningsIndex){
        if(förfrågningar.size() <= 0){
            return "";
        }
        
        String information = "";
        
        Förfrågning forfragan = förfrågningar.get(forfragningsIndex);
        Kund kund = forfragan.getKund();
        Hatt hatt = forfragan.getHatt();
        
        information += "Datum lagd: " + forfragan.getDate() + "\n";
        information += "-----Om kunden-----" + "\n";
        information += "Namn: " + kund.getNamn() + "\n";
        information += "Adress: " + kund.getAdress() + "\n";
        information += "Telefon: " + kund.getTelefon() + "\n";
        information += "Epost: " + kund.getEpost() + "\n";
        information += "-----Om hatten-----" + "\n";
        information += "Mall: " + hatt.getBenamning() + "\n";
        information += "Storlek: " + hatt.getStorlek() + "\n";
        information += "Färg: " + hatt.getFarg() + "\n";
        information += "Material: " + hatt.getMaterial() + "\n";
        information += "Accessoar: " + hatt.getAccessoar() + "\n";
        information += "Special: " + hatt.getBeskrivning() + "\n";
        
        return information;
    }
    
    public static Förfrågning getForfragning(int index){
        return förfrågningar.get(index);
    }
    
    public static int getAntalForfragningar(){
        return förfrågningar.size();
    }

    public void läggTill() {
//        //Ett sätt att automatisera idet kanske skulle vara bra
//        Förfrågning F1 = new Förfrågning(1, "2000-01-01");
//        F1.laggInKund();
//
//        förfrågningar.add(F1);
//        Förfrågning F2 = new Förfrågning(2, "1999-01-01");
//        F2.laggInKund();
//        förfrågningar.add(F2);
    }

    public static void laggTillForfragan(String datum, Kund enKund, Hatt enHatt) {
        Förfrågning nyForfragan = new Förfrågning(datum, enKund, enHatt);
        förfrågningar.add(nyForfragan);
        sparaFil();
    }

    public void taBort(String id) {
        if(förfrågningar.size() <= 0){
            return;
        }
        
        for (Förfrågning enFörfrågning : förfrågningar) {
            if (enFörfrågning.getId() == id) {
                förfrågningar.remove(enFörfrågning);
                break;
            }
        }
    }
    
    public static void taBort(int index){
        förfrågningar.remove(index);
        sparaFil();
    }
    
    public static void resettaForfragninar(){
        förfrågningar.clear();
        sparaFil();
    }
}

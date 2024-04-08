/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author emil-
 */
public class KundRegister {

    ArrayList<Kund> kunder = new ArrayList();

    public void fil() {
        try {
            FileWriter fileWriter = new FileWriter("kunder.txt", true);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                for (Kund enKund : kunder) {
                    bufferedWriter.write("Namn: " + enKund.getNamn() + " ");
                    bufferedWriter.write("Adress: " + enKund.getAdress() + " ");
                    bufferedWriter.write("Telefonnummer: " + enKund.getTelefon() + " ");
                    bufferedWriter.write("Epost: " + enKund.getEpost() + " ");
                    bufferedWriter.newLine();

                }
                bufferedWriter.close();
//                bufferedWriter.write("Hej");
//                bufferedWriter.close();
            }

        } catch (IOException e) {

        }
        try (FileOutputStream fos = new FileOutputStream("KundRegister.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Skriv ArrayList till filen
            oos.writeObject(kunder);
            System.out.println("Objekt sparade till filen.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void laddaInFil() {
        kunder = null;
        try (FileInputStream fis = new FileInputStream("KundRegister.dat"); ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Läs ArrayList från filen
            kunder = (ArrayList<Kund>) ois.readObject();
            System.out.println("Objekt inlästa från filen.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }


//    public void läggTill() {
//        //Ett sätt att automatisera idet kanske skulle vara bra
//        Kund F1 = new Kund(1, "2000-01-01");
//        F1.laggInKund();
//
//        kunder.add(F1);
//         F2 = new (2, "1999-01-01");
//        F2.laggInKund();
//        kunder.add(F2);
//    }
//    public void taBort(int id) {
//        for (Kund enKund : kunder) {
//            if (enKund.getId() == id) {
//
//                kunder.remove(enKund);
//                break;
//            }

}
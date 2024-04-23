/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        }
        return enHattMallLista;
    }
    
    public static void sparaMomsFil(){ 
        ArrayList<Double> varden = new ArrayList<Double>();
        varden.add(MomsHanterare.getUtgaendeMoms12Procent());
        varden.add(MomsHanterare.getUtgaendeMoms25Procent());
        varden.add(MomsHanterare.getIngaendeMoms25Procent());
        
        try (FileOutputStream fos = new FileOutputStream("MomsRegister.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        // Skriv ArrayList till filen
        oos.writeObject(varden);
        System.out.println("Moms sparat till filen.");

    } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static ArrayList<Double> laddaInMomsFil(){
        ArrayList<Double> varden = new ArrayList<Double>();
        try (FileInputStream fis = new FileInputStream("MomsRegister.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Läs ArrayList från filen
            varden = (ArrayList<Double>) ois.readObject();
            System.out.println("Moms inläst från filen.");
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return varden;
    }
    
    public static void skapaMomsRedovisning(String ettArtal){
        try{
            File enFil = new File("Momsredovisning" + ettArtal + ".txt");
            if(enFil.createNewFile()){
            System.out.println("Fil har skapats");
            }
            else{
                System.out.println("Fil existerar redan");
            }
        }
        catch(IOException e){
            System.out.println("Något gick fel i skapandet av filen");
        }
    }
    
    public static void sparaMomsRedovising(String text, String ettArtal) {     
        try{
            FileWriter writer = new FileWriter("Momsredovisning" + ettArtal + ".txt");
            writer.write(text);
            writer.close();
            System.out.println("Momsredovisning sparat till textfil.");
            JOptionPane.showMessageDialog(null, "Momsredovisning har sparats till txt-fil!");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Något gick fel med att spara textfilen. Prova igen.");
        }    
    }
}  


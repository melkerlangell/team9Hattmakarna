package hattmakarna;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTextField;

public class KundRegister {

    static ArrayList<Kund> kunder = new ArrayList();

    public static void laddaInFil() {
        kunder = null;
        try (FileInputStream fis = new FileInputStream("KundRegister.dat"); ObjectInputStream ois = new ObjectInputStream(fis)) {

            kunder = (ArrayList<Kund>) ois.readObject();
            System.out.println("Kunder inlästa från filen.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void sparaFil() {

        try (FileOutputStream fos = new FileOutputStream("KundRegister.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(kunder);
            System.out.println("Objekt sparade till filen.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void addNyKundIRegister(Kund enKund) {
        kunder.add(enKund);
        sparaFil();
    }

    public static void taBortKundUrRegister(String epost) {
        for (Kund enKund : kunder) {
            if (enKund.getEpost().equalsIgnoreCase(epost)) {

                kunder.remove(enKund);
                sparaFil();
                break;
            }
        }
    }
    
    public static void taBortKundUrRegister(int index){
        kunder.remove(index);
        sparaFil();
    }
    
    private static void uppdateraKundRegister(Kund enKund) {
        for(int i = 0; i < kunder.size(); i++) {
            if(kunder.get(i).getEpost().equals(enKund.getEpost())) {
                kunder.set(i, enKund);
                sparaFil();
                break;
                for(Kund enKund1 : kunder) {
                    System.out.println(enKund1.getNamn());
                }
            }
        }
    }

    public static Kund hittaKundFranEpost(String epost) {
        Kund hittadKund = null;

        for (Kund enKund : kunder) {
            if(enKund == null){
                continue;
            }
            
            if (enKund.getEpost().equals(epost)) {
                hittadKund = enKund;
                break;
            }
        }
        return hittadKund;
    }
    
    public static Kund hittaEpost2(String epost){
        Kund nyKund = null;
        for (Kund enKund :kunder) {
        if (enKund.getEpost().equals(epost)) {
            nyKund = enKund;
            break;
        }
    }
    return nyKund;
    }
    
    public static ArrayList<Kund> getKundRegister () {
        return kunder; 
    }
    
    public static void test() {
        if (kunder != null)
        {
        for (Kund enKund : kunder) {
            if (enKund != null){
            System.out.println(enKund.getNamn()+" "+enKund.getEpost());
        } else {
            System.out.println("kuken");
        }
    }}

}}

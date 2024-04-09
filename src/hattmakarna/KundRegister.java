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
            System.out.println("Objekt inlästa från filen.");

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

    public static void taBort(String epost) {
        for (Kund enKund : kunder) {
            if (enKund.getEpost().equalsIgnoreCase(epost)) {

                kunder.remove(enKund);
                break;
            }
        }
    }

    public static boolean hittaEpost(JTextField textToCheck, Kund kund) {
        boolean epostHittad = false;
        String epost = textToCheck.getText();

        for (Kund enKund : kunder) {
            if (enKund.getEpost().equals(epost)) {
                epostHittad = true;
                kund = enKund;
                break;
            }
        }
        return epostHittad;
    }

}

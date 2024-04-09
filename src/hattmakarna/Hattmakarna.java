/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Melker
 */
public class Hattmakarna extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            JFrame startSida = new Inloggningssida();
            startSida.setVisible(true);
        
            ProduktHanterare PH = new ProduktHanterare();
            FörfrågningsRegister register = new FörfrågningsRegister();
            
            //FilHanterare.sparaProduktFil(ProduktHanterare.getProduktLista());
            
            //Bör flyttas till något sorts register
            new Storlek();
            new Farg();
            new Material();        
    }
    //KoalaKevin
    //Koala

}

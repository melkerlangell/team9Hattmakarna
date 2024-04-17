/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author adams
 */
public class MailBekraftelse {

    private static String meddelande = "Din order har nu skickats";
    private static String amne = "Order Skickats";
    private static String epost = "";
    private Förfrågning enFörfrågning;

    public static void skicka() {

        EpostHanterare.skickaEpost(epost, amne, meddelande);
    }

    public void taBortFörfrågning() {
        int id = enFörfrågning.getId();
        FörfrågningsRegister.taBort(id);
    }

    public  void test() {

        {
            

            
            Kund kund = enFörfrågning.getKund();
            Hatt hatt = enFörfrågning.getHatt();
           
            if (kund != null) {
                String namn = kund.getNamn();
                String epost = kund.getEpost();
                String material = hatt.getMaterial()
                if (hatt != null) {
                    System.out.println("Typ: " + hatt.getBenamning());
                    System.out.println("Material: " + hatt.getMaterial());
                } else {
                    System.out.println("Kunden har ingen hatt.");
                }
            } else {
                System.out.println("Kund is null");
            }

            System.out.println("---------");
        }
    }
}

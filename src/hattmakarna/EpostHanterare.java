/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;


import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;


/**
 *
 * @author adams
 */
public class EpostHanterare {

    public static void skickaEpost(String till, String ämne, String meddelande) {
        System.out.println("1");
        // Konfigurera e-postinställningar
        String värd = "smtp.gmail.com";
        String användarnamn = "ottohattmakaresson@gmail.com";
        String lösenord = "zxpi mjyl zdge ztcf";

        // Skapa egenskaper
        Properties egenskaper = new Properties();
        egenskaper.put("mail.smtp.auth", "true");
        egenskaper.put("mail.smtp.starttls.enable", "true");
        egenskaper.put("mail.smtp.host", värd);
        egenskaper.put("mail.smtp.port", "587");
        egenskaper.put("mail.smtp.ssl.protocols", "TLSv1.2");
System.out.println("2");
        // Skapa ett autentiseringsobjekt
        Authenticator autentisering = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(användarnamn, lösenord);
            }
        };
        System.out.println("3");

        // Skapa en session
        Session session = Session.getInstance(egenskaper, autentisering);

        try {
            // Skapa ett nytt meddelande
            Message meddeland1 = new MimeMessage(session);
            meddeland1.setFrom(new InternetAddress(användarnamn));
            meddeland1.setRecipients(Message.RecipientType.TO, InternetAddress.parse(till));
            meddeland1.setSubject(ämne);
            meddeland1.setText(meddelande);
            System.out.println("4");
            // Skicka e-postmeddelandet
            Transport.send(meddeland1);
            System.out.println("5");
            System.out.println("E-post skickad framgångsrikt.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
            
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class EpostLogik {
    public static void skickaEpost(String till, String ämne, String meddelande) {
        // Konfigurera e-postinställningar
        String värd = "smtp.exempel.com";
        String användarnamn = "ditt_användarnamn";
        String lösenord = "ditt_lösenord";

        // Skapa egenskaper
        Properties egenskaper = new Properties();
        egenskaper.put("mail.smtp.auth", "true");
        egenskaper.put("mail.smtp.starttls.enable", "true");
        egenskaper.put("mail.smtp.host", värd);
        egenskaper.put("mail.smtp.port", "587");

        // Skapa ett autentiseringsobjekt
        Authenticator autentisering = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(användarnamn, lösenord);
            }
        };

        // Skapa en session
        Session session = Session.getInstance(egenskaper, autentisering);

        try {
            // Skapa ett nytt meddelande
            Message meddelande = new MimeMessage(session);
            meddelande.setFrom(new InternetAddress(användarnamn));
            meddelande.setRecipients(Message.RecipientType.TO, InternetAddress.parse(till));
            meddelande.setSubject(ämne);
            meddelande.setText(meddelande);

            // Skicka e-postmeddelandet
            Transport.send(meddelande);
            System.out.println("E-post skickad framgångsrikt.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.UUID;

/**
 *
 * @author Melker
 */
public class OffertHanterare {
    private String avsandare;
    
    public OffertHanterare() {
        String avsandare = "Otto Judith AB";
    }
    
    public String getKundNamn(Förfrågning enForfragan) {
        Kund enKund = enForfragan.getKund();
        return enKund.getNamn();
    }
    
    public static String genereraOffertID() {
        UUID uuid = UUID.randomUUID();
        String fraktId = uuid.toString();
        return fraktId;
    }
}



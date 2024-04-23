/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author Melker
 */
public class Offert {
    public String offertID;
    public String avsandare;
    public String kundNamn;
    public double totalKostnad;
    
    
    public Offert(Förfrågning forfragan) {
        this.offertID = OffertHanterare.genereraOffertID();
        this.avsandare = "Otto Judith AB";
        this.kundNamn = forfragan.getKund().getNamn();
        this.totalKostnad = forfragan.getTotalPris();
    }
    
    public String formateraOffert() {
        String offert = "Offert\n";
        offert += "Offert ID: " + offertID + "\n";
        offert += "Avsändare: " + avsandare + "\n";
        offert += "Kundens namn: " + kundNamn + "\n";
        offert += "Total kostnad: " + totalKostnad + " SEK\n";
        return offert;
    }
    
    public String getOffertID() {
        return offertID;
    }
    
    public void setOffertID(String offertID) {
        this.offertID = offertID;
    }
    
    public String getAvsandare() {
        return avsandare;
    }
    
    public void setAvsandare() { 
        this.avsandare = avsandare;
    }
    
    public String getKundNamn() {
        return kundNamn;
    }
    
    public void setKundNamn(String kundNamn) {
        this.kundNamn = kundNamn;
    }
    
    public double getTotalKostnad() {
        return totalKostnad;
    }
}

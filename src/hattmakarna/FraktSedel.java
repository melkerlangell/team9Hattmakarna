/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author clara
 */
public class FraktSedel {
      private String fraktId;
      private String avsändare;
      private String kundNamn;
      private String kundAdress;
      private double fraktKostnad;
      
      
      public FraktSedel(Förfrågning förfrågan){
          this.fraktId = FraktHanterare.genereraFraktId();
          this.avsändare = "Otto Judith AB";
          this.kundNamn = förfrågan.getKund().getNamn();
          this.kundAdress = förfrågan.getKund().getAdress();
          this.fraktKostnad = 25.00;
         }
         
       public String FormateraFraktSedel(){
        String fraktsedel = "Fraktsedel\n";
        fraktsedel += "Frakt ID: " + fraktId + "\n";
        fraktsedel += "Avsändare: " + avsändare + "\n";
        fraktsedel += "Kundens namn: " + kundNamn + "\n";
        fraktsedel += "Kundens adress: " + kundAdress + "\n";
        fraktsedel += "Fraktkostnad: " + fraktKostnad + "\n";
        return fraktsedel;
    } 
       public String getFraktId() {
        return fraktId;
    }

    public void setFraktId(String fraktId) {
        this.fraktId = fraktId;
    }

    public String getAvsändare() {
        return avsändare;
    }

    public void setAvsändare(String avsändare) {
        this.avsändare = avsändare;
    }

    public String getKundNamn() {
        return kundNamn;
    }

    public void setKundNamn(String kundNamn) {
        this.kundNamn = kundNamn;
    }

    public String getKundAdress() {
        return kundAdress;
    }

    public void setKundAdress(String kundAdress) {
        this.kundAdress = kundAdress;
    }

    public double getFraktKostnad() {
        return fraktKostnad;
    }

    public void setFraktKostnad(double fraktKostnad) {
        this.fraktKostnad = fraktKostnad;
      }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;
import java.io.Serializable;

/**
 *
 * @author adams
 */
public class Förfrågning implements Serializable {


    private int id;
    private String datum;
    private Hatt hatt;
    private Kund kund;

    public Förfrågning(int id, String datum, Hatt hatt, Kund kund) {
        this.id = id;
        this.datum = datum;
        this.hatt = hatt;
        this.kund = kund;    
    }
    
    public int getId() {
        return id;
    }

    public String getDate() {
        return datum;
    }

    public String getKundId() {
        return kund.getId();
    }
    
    public void setId ( int id) {
        this.id = id;
    }
    
    public void setDate (String datum){
        this.datum = datum;
    }
    
    //Borde inte göras här
    //Och kund-id och kund är inte samma sak!
    public void setKundId (Kund kundId) {
        this.kund = kundId;
    }
    
    public String getInformation(){
        return id + ": " + hatt.getFarg() + " " + hatt.getBenamning() + " för " + kund.getNamn() + ", datum lagt: " + datum;
    }
}

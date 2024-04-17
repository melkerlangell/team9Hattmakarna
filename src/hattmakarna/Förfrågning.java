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
    private static final long serialVersionUID = 4975052993073197909L;
    //fulfix för att tvinga fram kompatibilitet med registerfilen


    private int id;
    private String datum;
    private Kund enKund;
    private Hatt enHatt;

    public Förfrågning(int id, String datum) {
        this.id = id;
        this.datum = datum;
        this.enKund = enKund;
        this.enHatt = enHatt;

    }

    public void laggInKund(){
        enKund = new Kund("Lasse", "Storgatan 1", "073-1112233", "lasse@mail.com");
    }

    public Kund getKund () {
        return enKund;
    }
    public int getId() {
        return id;
    }
    
    public Hatt getHatt(){
    return enHatt;
    }

    public String getDate() {
        return datum;
    }

    public String getKundId() {
        return enKund.getId();

    }

    public void setId ( int id) {
        this.id = id;
    }

    public void setDate (String datum){
        this.datum = datum;
    }

    public void setKundId (Kund kundId) {
        this.enKund = kundId;
    }



}

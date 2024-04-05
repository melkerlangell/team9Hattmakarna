/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author adams
 */
public class Förfrågning {


    private int id;
    private String datum;
    //private Hatt enHatt
    private Kund enKund;

    public Förfrågning(int id, String datum) {
        this.id = id;
        this.datum = datum;
        
    }

    public void laggInKund(){
        enKund = new Kund("Lasse", "Storgatan 1", "073-1112233", "lasse@mail.com", 1);
    }
    public int getId() {
        return id;
    }

    public String getDate() {
        return datum;
    }

    public int getKundId() {
        return enKund.getId();

    }

}

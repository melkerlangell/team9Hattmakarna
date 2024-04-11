/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author adamhanssondylen
 */
public class Frakt {
    private String avsändare;
    private String mottagare;
    private String kundAdress;
    private String leveransAdress;
    
    public Frakt(String kundNamn, String kundAdress, String leveransAdress){
        String avsändare = "OttoJudithAB";
        this.mottagare = mottagare;
        this.kundAdress = kundAdress;
        this.leveransAdress = leveransAdress;
    }
    
    public String getKundNamn(){
        return kundNamn;
    }
    
    public void setKundNamn(String kundNamn){
        this.kundNamn = kundNamn;
    }
    
    public String getKundAdress(){
        return kundAdress;
    }
    
    public void setKundAdress(String kundAdress){
        this.kundAdress = kundAdress;
    }
    
    public String getLeveransAdress(){
        return leveransAdress;
    }
    
    public void setLeveransAdress(String leveransAdress){
        this.leveransAdress = leveransAdress;
    }
    
}

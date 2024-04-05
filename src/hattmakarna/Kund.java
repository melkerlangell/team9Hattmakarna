package hattmakarna;

public class Kund {

    private String namn;
    private String adress;
    private String telefon;
    private String epost;
    private int id;

    public Kund(String namn, String adress,String telefon,String epost, int id) {
     this.namn = namn;
     this.namn = adress;
     this.namn = telefon;
     this.namn = epost;
     this.id = id;
    }
    public String getNamn(){
        return namn;
    }
    public String getAdress(){
        return adress;
    }
    public String getTelefon(){
        return telefon;
    }
    public String getEpost(){
        return epost;
    }
    public int getId(){
        return id;
    }
    
    
    
    
    
    
}

package hattmakarna;
import java.util.UUID;
import java.io.Serializable;

public class Kund implements Serializable {

    private static final long serialVersionUID = 1843565969513825091L;
    private String namn;
    private String adress;
    private String telefon;
    private String epost;
    private String id;

    public Kund(String namn, String adress,String telefon,String epost) {
     this.namn = namn;
     this.adress = adress;
     this.telefon = telefon;
     this.epost = epost;
     this.id = this.id = UUID.randomUUID().toString();
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
    public String getId(){
        return id;
    }
    
    public void setNamn(String namn) {
        this.namn = namn;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    public void setEpost(String epost) {
        this.epost = epost;
    }
    
    
}

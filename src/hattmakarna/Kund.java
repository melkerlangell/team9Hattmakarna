package hattmakarna;
import java.util.UUID;
import java.io.Serializable;

public class Kund implements Serializable {

    private String namn;
    private String adress;
    private String telefon;
    private String epost;
    private String id;

    public Kund(String namn, String adress,String telefon,String epost) {
     this.namn = namn;
     this.namn = adress;
     this.namn = telefon;
     this.namn = epost;
     this.id = UUID.randomUUID().toString();
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
    
    
    
    
    
    
}

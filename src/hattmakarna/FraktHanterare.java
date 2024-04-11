
package hattmakarna;
import java.util.UUID;

/**
 *
 * @author adamhanssondylen
 */
public class FraktHanterare {
    private String avsändare;
    private double kostnad;
    
    public FraktHanterare(){
        String avsändare = "Otto Judith AB";
        kostnad = 25.00;
    }
    
    public String getKundNamn(Förfrågning enForfragan){
        Kund enKund = enForfragan.getKund();
        return enKund.getNamn();
    }
    
    public double getFraktKostnad(){
        return kostnad;
    }
    
    public String getKundAdress(Förfrågning enForfragan){
        Kund enKund = enForfragan.getKund();
        return enKund.getAdress();
    }
    
    public static String genereraFraktId() {
        UUID uuid = UUID.randomUUID();
        String fraktId = uuid.toString();
        return fraktId;
    }
}

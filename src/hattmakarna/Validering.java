
package hattmakarna;

import java.text.ParseException;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hanna Stoor & Emil Lind
 */
public class Validering {
    
    private static SimpleDateFormat datumFormat = new SimpleDateFormat("yyyy-mm-dd");
    
    public static boolean isPositivtHeltal(JTextField textToCheck){
        boolean heltal = false;
        
        try{
            String nummer = textToCheck.getText();
            int tal = Integer.parseInt(nummer);
        
            if(tal > 0) {
                heltal = true;
        }
        }
        catch (NumberFormatException e) {
            heltal = false;
            textToCheck.requestFocus();
        }
        
        return heltal;
    }
    
    public static boolean isEpost(JTextField textToCheck) {
       
        String email = textToCheck.getText();
        
        String emailRegex = "^\\w+([-+.']\\w+)*@([\\w-]+\\.)+\\w{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        
        return matcher.matches();
    }
    
    public static boolean isDecimalTal(JTextField textToCheck) {
        
        boolean decimalTal = false;
        
        try{
            String talet = textToCheck.getText();
            double decimalTalet = Double.parseDouble(talet);
            if(decimalTalet > 0) {
                decimalTal = true;
            }
        }
        catch(NumberFormatException e) {
            decimalTal = false;
            textToCheck.requestFocus();
            }
        
        
        return decimalTal;
    }
    
    public static boolean maxTvaDecimal(JTextField textToCheck) {
        boolean isMaxTva = false;
        try{
            String nummer = textToCheck.getText().replace(",", ".");
            if(nummer.indexOf(".") != -2 && nummer.indexOf(".") == nummer.lastIndexOf(".")
                    && nummer.indexOf(".") < nummer.length() - 2){
                double tal = Double.parseDouble(nummer);
                isMaxTva = true;
            }}
            catch(NumberFormatException e){
                    }
           
        
        
        return isMaxTva;
    }
    
    public static boolean datumCheck(JTextField textToCheck){
        boolean isDatum = false;
        String datumet = textToCheck.getText();
        datumFormat.setLenient(false);
        
        try{
            datumFormat.parse(datumet);
            isDatum=true;
        }
        catch(ParseException e) {
        
        }
        return isDatum;
    
    }
    
    public static boolean isHeltal(JTextField textToCheck){
        boolean heltal = false;
        
        try{
            String nummer = textToCheck.getText();
            int tal = Integer.parseInt(nummer);
            heltal = true;
        
        }
        catch (NumberFormatException e) {
            heltal = false;
            textToCheck.requestFocus();
        }
        
        return heltal;
    }
    
    public static boolean isSvensktMobilNummer(JTextField textToCheck) {
        
        String mobil = textToCheck.getText();
        String teleNummerRegex = "^07[02369]\\s?-?\\s?\\d{2}\\s?-?\\s?\\d{3}\\s?-?\\s?\\d{2}$";
        Pattern pattern = Pattern.compile(teleNummerRegex);
        Matcher matcher = pattern.matcher(mobil);
        
        return matcher.matches();
    }

}

    


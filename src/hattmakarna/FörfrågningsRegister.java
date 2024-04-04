/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;
import java.util.ArrayList;



public class FörfrågningsRegister {
    ArrayList<Förfrågning> förfrågningar = new ArrayList();
    
    public void läggTill(){
        Förfrågning F1 = new Förfrågning(1);
        förfrågningar.add(F1);
        Förfrågning F2 = new Förfrågning(2);
        förfrågningar.add(F2);
    }
    public void taBort(int id){
        for (Förfrågning enFörfrågning : förfrågningar){
            if(enFörfrågning.getId() == id){
                förfrågningar.remove(enFörfrågning);
                break;
            }
        }
    }
    
}

  

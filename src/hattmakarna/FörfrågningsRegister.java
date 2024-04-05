/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FörfrågningsRegister {

    ArrayList<Förfrågning> förfrågningar = new ArrayList();

    public void fil() {
        try {
            FileWriter fileWriter = new FileWriter("förfrågningar.txt", true);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                for (Förfrågning enFörfrågning : förfrågningar) {
                    bufferedWriter.write("Id: " + Integer.toString(enFörfrågning.getId()) + " ");
                    bufferedWriter.write("Datum: " + enFörfrågning.getDate() + " ");
                    bufferedWriter.write("KundID: " + Integer.toString(enFörfrågning.getKundId()) + " ");
                    bufferedWriter.newLine();

                }
                bufferedWriter.close();
//                bufferedWriter.write("Hej");
//                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void läggTill() {
        //Ett sätt att automatisera idet kanske skulle vara bra
        Förfrågning F1 = new Förfrågning(1, "2000-01-01");
        F1.laggInKund();

        förfrågningar.add(F1);
        Förfrågning F2 = new Förfrågning(2, "1999-01-01");
        F2.laggInKund();
        förfrågningar.add(F2);
    }

    public void taBort(int id) {
        for (Förfrågning enFörfrågning : förfrågningar) {
            if (enFörfrågning.getId() == id) {

                förfrågningar.remove(enFörfrågning);
                break;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hattmakarna;

/**
 *
 * @author adamhanssondylen
 */
public class OmvandlaPDF {
    
     public static void skrivUt(Förfrågning enForfragan) {
        // Skapa en förfrågan
        //Förfrågning förfrågning = new Förfrågning(1, "2024-04-15");
        //förfrågning.laggInKund();  // Lägger till en kund till förfrågan

        // Skapa en fraktsedel baserad på förfrågan
        FraktSedel fraktsedel = new FraktSedel(enForfragan);

        // Sökväg där PDF-filen ska sparas
        String filePath = "fraktsedel.pdf";

        // Generera PDF
        PdfGenerator.generatePDF(fraktsedel, filePath);

        System.out.println("PDF-filen har genererats: " + filePath);
    
}
     
     
     public static void skrivUtOffert(Förfrågning enForfragan) {
         Offert offert = new Offert(enForfragan);
         
         String filePath = "offert.pdf";
         
         PdfGenerator.genereraOffertPDF(offert, filePath);
         
         System.out.println("PDF-filen har genererats: " + filePath);
     }
}

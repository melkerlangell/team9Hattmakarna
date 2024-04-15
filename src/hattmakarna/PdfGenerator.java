
package hattmakarna;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;


/**
 *
 * @author tindr
 */
public class PdfGenerator {
    public static void generatePDF(FraktSedel fraktsedel, String filePath) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.beginText();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 700);
                contentStream.showText("Fraktsedel:");
                contentStream.newLine();
                contentStream.showText("Frakt ID: " + fraktsedel.getFraktId());
                contentStream.newLine();
                contentStream.showText("Avsändare: " + fraktsedel.getAvsändare());
                contentStream.newLine();
                contentStream.showText("Kundens namn: " + fraktsedel.getKundNamn());
                contentStream.newLine();
                contentStream.showText("Kundens adress: " + fraktsedel.getKundAdress());
                contentStream.newLine();
                contentStream.showText("Fraktkostnad: " + fraktsedel.getFraktKostnad() + " SEK");
                contentStream.endText();
                
            }

            document.save(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


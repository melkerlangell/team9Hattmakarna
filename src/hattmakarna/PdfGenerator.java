
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
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 650);
                contentStream.showText("Frakt ID: " + fraktsedel.getFraktId());
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 600);
                contentStream.showText("Avsändare: " + fraktsedel.getAvsändare());
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 550);
                contentStream.showText("Kundens namn: " + fraktsedel.getKundNamn());
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 500);
                contentStream.showText("Kundens adress: " + fraktsedel.getKundAdress());
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 450);
                contentStream.showText("Fraktkostnad: " + fraktsedel.getFraktKostnad() + " SEK");
                contentStream.endText();
                contentStream.close();
                
            }

            document.save(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void genereraOffertPDF(Offert offert, String filePath) {
            try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.beginText();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 700);
                contentStream.showText("Offert:");
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 650);
                contentStream.showText("Offert ID: " + offert.getOffertID());
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 600);
                contentStream.showText("Total kostnad: " + offert.getTotalKostnad());
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 15);
                contentStream.newLineAtOffset(100, 550);
                contentStream.showText("Kundens namn: " + offert.getKundNamn());
                contentStream.endText();
                contentStream.beginText();
                contentStream.newLine();
                contentStream.close();
                
            }

            document.save(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }


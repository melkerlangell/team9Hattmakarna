
 import org.appache.pdfbox.pdmodel.PDDocument;
 import org.appache.pdfbox.printing.PDFPageable;
 import java.io.File;
 import java.io.IOException;
 import javax.print.PrintService;
 import javax.print.PrintServiceLookup;
 import javax.print.attribute.standard.PrinterException;
 import javax.print.attribute.standard.PrinterJob;
 
public class SkrivaUtPDF {
    
    public static void skrivUt(String filePath){
        try{
            PDDocument document = PDDocument.load(new File(filePath));
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPagable(new PDFPagable(document));
            PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
            if(defaultPrintService !=null){
                printerJob.setPrintService(defaultPrintService);
                printerJob.print();
                }
            else{
                System.out.println("Ingen standard skrivare tillgänglig");
            }
            document.close();
            catch(IOException | PrinterException e){
                    e.printStackTrace();
                    }
        }
    }
}

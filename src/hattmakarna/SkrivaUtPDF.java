//package hattmakarna;
//
//
//
//import java.awt.print.PrinterException;
//import java.awt.print.PrinterJob;
//import org.apache.pdfbox.pdmodel.PDDocument;
// import org.apache.pdfbox.printing.PDFPageable;
// import java.io.File;
//import java.io.FileInputStream;
// import java.io.IOException;
// import javax.print.PrintService;
// import javax.print.PrintServiceLookup;
//import org.apache.pdfbox.pdfparser.PDFParser;
//import org.apache.pdfbox.pdmodel.PDDocument;
// 
//public class SkrivaUtPDF {
//    
//    public static void skrivUt(String filePath){
//        try{
//            PDDocument document =  new PDDocument();
//            //PDFParser parser = new PDFParser(new FileInputStream(new File(filePath)));
//            PrinterJob printerJob = PrinterJob.getPrinterJob();
//            printerJob.setPageable(new PDFPageable(document));
//            PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
//            if(defaultPrintService !=null){
//                printerJob.setPrintService(defaultPrintService);
//                printerJob.print();
//                }
//            else{
//                System.out.println("Ingen standard skrivare tillgänglig");
//            }
//            document.close();
//        }
//            catch(IOException | PrinterException e){
//                    e.printStackTrace();
//                    }
//        }
//    }
//

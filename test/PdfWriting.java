
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.DocumentException;
import java.io.*;
public class PdfWriting {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("A Hello World PDF document."));
            document.close();
            writer.close();
            System.out.println("Document Written Successfully");
        } catch (IOException Ex) {
            
        }
        catch (DocumentException e) {
        e.printStackTrace();
        }
    }
}
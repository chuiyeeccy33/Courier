
package courier;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Month;
import java.util.Scanner;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Report {

    Feedback f;
    Users u;
    
    public Report(Feedback f, Users u) {
        this.f = f;
        this.u = u;
    }
    
    public Report() {
        
    }
      
    public void FeedbackReport() {
        
        Document document = new Document ();
        
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("FeedbackReport.pdf"));
            document.open();
            LocalDate date = LocalDate.now(); 
            //date format
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String Date = date.format(format);
            
            //create title for feedback report
            document.add(new Paragraph("Feedback Report"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("___________________________________"));
            document.add(new Paragraph("Company name: Fast & Furious"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Report Date: " + Date));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Report Description: "));
            document.add(new Paragraph("View all feedback given by the user to improve the current system"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Feedback List"));
            document.add(Chunk.NEWLINE);
            
            //create table for the data for feedback
            PdfPTable table = new PdfPTable(4);
            
            //create the header for the table
            table.addCell("Feedback ID");
            table.addCell("Rating");
            table.addCell("Description");
            table.addCell("User");
            
            //load the data from Delivery
            List<String> strings = Files.readAllLines(Paths.get("Feedback.txt"));
            List<Feedback> feedbacks = new ArrayList<>();
            
            for(String line : strings) {
                String[] split = line.split(",");
                
                String feedbackid = split[0];
                String rating = split[1];
                String description = split[2];
                String userid = split[3];
                
                Users CustomerID = new Users();
                Feedback f = new Feedback(feedbackid,rating,description,CustomerID);
                CustomerID.setUserid(userid);
                
                table.addCell(f.getFeedbackid());
                table.addCell(f.getRating());
                table.addCell(f.getDescription());
                table.addCell(f.getFeedbackUser().toString());
            }
            
            //Add table into document
            document.add(table);
            
            //close document
            document.close();
            
            //close writer
            writer.close();
            
        } catch (IOException ex) {
            
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
    
    public void UserReport() {
        
        Document document = new Document ();
        
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("UserReport.pdf"));
            document.open();
            LocalDate date = LocalDate.now(); 
            //date format
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String Date = date.format(format);
            
            //create title for feedback report
            document.add(new Paragraph("Users Report"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("___________________________________"));
            document.add(new Paragraph("Company name: Fast & Furious"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Report Date: " + Date));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Report Description: "));
            document.add(new Paragraph("View all current user list"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Feedback List"));
            document.add(Chunk.NEWLINE);
            
            //create table for the data for feedback
            PdfPTable table = new PdfPTable(4);
            
            //create the header for the table
            table.addCell("User ID");
            table.addCell("Username");
            table.addCell("User Type");
            table.addCell("Status");
            
            //load the data from Delivery
            List<String> strings = Files.readAllLines(Paths.get("UserDetails.txt"));
            List<Users> users = new ArrayList<>();
            
            for(String line : strings) {
                String[] split = line.split(",");
                
                String Userid = split[0];
                String Username = split[1];
                String Usertype = split[2];
                String Status = split[8];
                
                Users u = new Users();
                u.userid = Userid;
                u.username = Username;
                u.selectedusertype = Usertype;
                u.status = Status;
                
                table.addCell(u.userid);
                table.addCell(u.username);
                table.addCell(u.selectedusertype);
                table.addCell(u.status);
            }
            
            //Add table into document
            document.add(table);
            
            //close document
            document.close();
            
            //close writer
            writer.close();
            
        } catch (IOException ex) {
            
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
    
    public void DeliveryReport() {
        Document document = new Document ();
        
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("DeliveryReport.pdf"));
            document.open();
            LocalDate date = LocalDate.now(); 
            //date format
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String Date = date.format(format);
            
            //create title for feedback report
            document.add(new Paragraph("Delivery Report"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("___________________________________"));
            document.add(new Paragraph("Company name: Fast & Furious"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Report Date: " + Date));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Report Description: "));
            document.add(new Paragraph("View all the delivery and order in Fast & Furious"));
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Delivery Transaction"));
            document.add(Chunk.NEWLINE);
            
            //create table for the data for feedback
            PdfPTable table = new PdfPTable(4);
            
            //create the header for the table
            table.addCell("Order ID");
            table.addCell("Order Date");
            table.addCell("Delivery Staff");
            table.addCell("Status");
            
            //load the data from Delivery
            List<String> strings = Files.readAllLines(Paths.get("Orders.txt"));
            List<Delivery> delivery = new ArrayList<>();
            
            for(String line : strings) {
                String[] split = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                
                String Orderid = split[0];
                String OrderDate = split[9];
                String DeliveryStaff = split[19];
                String Status = split[18];
                
                Delivery d = new Delivery();
                d.orderid = Orderid;
                d.orderdate = OrderDate;
                d.setAssginperson(DeliveryStaff);
                d.setDeliverystatus(Status);
                
                table.addCell(d.orderid);
                table.addCell(d.orderdate);
                table.addCell(d.getAssignperson());
                table.addCell(d.getDeliverystatus());
            }
            
            //Add table into document
            document.add(table);
            
            //close document
            document.close();
            
            //close writer
            writer.close();
            
        } catch (IOException ex) {
            
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

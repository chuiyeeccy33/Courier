
package courier;

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


public class Report extends Orders {
    public String selection;
    public String buttonClick;
    
    public String getselection() {
        return selection;
    }
    
    public String getbuttonClick() {
        return buttonClick;
    }

    public void setselection(String Selection) {
        selection = Selection;
    }
    
    public void setbuttonClick(String ButtonClick) {
        buttonClick = ButtonClick;
    }
    
    public String Fill() {
        try {
            File file = new File("Orders.txt");
            Scanner sc = new Scanner(file);
            String temp;
            boolean found = false;
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            
            while(sc.hasNext() && !found) {
                temp = sc.nextLine();
                String[] tempArr;
                tempArr = temp.split(",");
                
                Object[] data = br.lines().toArray();
                for (Object load : data) {
                    String line = load.toString().trim();
                    String[] row = line.split(",");
                    orderdate = row[9];
                    String [] separateDate = orderdate.split("/");
                    String day = separateDate[0];
                    String month = Month.of(Integer.parseInt(separateDate[1])).name();
                    String year = separateDate[2];
                    if(buttonClick.equals("MonthlyOrder")) {        
                        sb.append(month +  "\n");
                    } else if (buttonClick.equals("DailyOrder")) {
                        sb.append(day + "\n");
                    } else if (buttonClick.equals("YearlyOrder")) {
                        sb.append(year + "\n");
                    } else if (buttonClick.equals("UserList")) {
                        sb.append("All" + "\n");
                    } else {
                        sb.append("There is no Order" + "\n");
                    }
                }
            return sb.toString();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "error in filling combobox";
    }
      
    public void GeneratePDF() {
      try {
            File file = new File("Orders.txt");
            Scanner sc = new Scanner(file);
            String temp;
            boolean found = false;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            while(sc.hasNext() && !found) {
                temp = sc.nextLine();
                String[] tempArr;
                tempArr = temp.split(",");
                 Object[] data = br.lines().toArray();
                for (Object load : data) {
                    String line = load.toString().trim();
                    String[] row = line.split(",");
                    orderdate = row[9];
                    String [] separateDate = orderdate.split("/");
                    String day = separateDate[0];
                    String month = Month.of(Integer.parseInt(separateDate[1])).name();
                    String year = separateDate[2];
                    Document document = new Document();
                    try
                    {
                       if (buttonClick.equals("MonthlyOrder")) {
                           if (selection.equals(separateDate[1])) {
                            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Monthly Order Report(" + selection + ").pdf"));
                            document.open();
                            document.add(new Paragraph("            Monthly Order Report (" + selection + ")           "));
                            document.add(new Paragraph("_________________________________________________________"));
                            document.add(new Paragraph(orderid));
                            document.add(new Paragraph("Order Date: " + orderdate));
                            document.add(new Paragraph("Weight: " + weight));
                            document.add(new Paragraph("Width: " + width + "     " + "Height: " + height + "       " + "Length: " + length + "       " ));
                            document.add(new Paragraph("Order Details: " + orderdetails));
                            document.add(new Paragraph("Shipping Fee: " + shippingfee));
                            document.add(new Paragraph("Item Price: " + itemprice));
                            document.add(new Paragraph("Total: " + total));
                            writer.close();
                            System.out.println("monthly Document Written Successfully");
                           }
                    } else if (buttonClick.equals("DailyOrder")) {
                          if (selection.equals(separateDate[1])) {
                            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Daily Order Report(" + selection + ").pdf"));
                            document.open();
                            document.add(new Paragraph("            Daily Order Report (" + selection + ")           "));
                            document.add(new Paragraph("___________________________________________________________"));
                            document.add(new Paragraph(orderid));
                            document.add(new Paragraph("Order Date: " + orderdate));
                            document.add(new Paragraph("Weight: " + weight));
                            document.add(new Paragraph("Width: " + width + "     " + "Height: " + height + "       " + "Length: " + length + "       " ));
                            document.add(new Paragraph("Order Details: " + orderdetails));
                            document.add(new Paragraph("Shipping Fee: " + shippingfee));
                            document.add(new Paragraph("Item Price: " + itemprice));
                            document.add(new Paragraph("Total: " + total));
                            writer.close();
                            System.out.println("daily Document Written Successfully");
                         }
                    } else if (buttonClick.equals("YearlyOrder")) {
                        if (selection.equals(separateDate[1])) {
                            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Yearly Order Report(" + selection + ").pdf"));
                            document.open();
                            document.add(new Paragraph("               Yearly Order Report(" + selection + ")          "));
                            document.add(new Paragraph("______________________________________________________________"));
                            document.add(new Paragraph(orderid));
                            document.add(new Paragraph("Order Date: " + orderdate));
                            document.add(new Paragraph("Weight: " + weight));
                            document.add(new Paragraph("Width: " + width + "     " + "Height: " + height + "       " + "Length: " + length + "       " ));
                            document.add(new Paragraph("Order Details: " + orderdetails));
                            document.add(new Paragraph("Shipping Fee: " + shippingfee));
                            document.add(new Paragraph("Item Price: " + itemprice));
                            document.add(new Paragraph("Total: " + total));
                            writer.close();
                            System.out.println("yearly Document Written Successfully");
                         }
                    }
                    }catch (IOException Ex)
                   {

                   }catch (DocumentException e) {
                         e.printStackTrace();
                      }
                }
            }
         } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

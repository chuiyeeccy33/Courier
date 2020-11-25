/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daniellim0510
 */
public class Delivery extends Orders {

    private String deliverystatus;
    private String assignperson;
    private String staffphone;

    public Delivery() {}

    public Delivery(String Orderid, String Sendername, String Senderaddress, String Senderphone, String Senderemail, String Receivername, String Receiveraddress, 
            String Receiverphone,String Receiveremail,String Orderdate, String Weight, String Width, String Length,String Height, String Orderdetails, String Shippingfee, 
            String Itemprice, String Total, String Deliverystatus,String DeliveryStaff, String DeliveryStaffPhone, String Userid) {


        assignperson = DeliveryStaff; //Delivery Staff to the order 19
        staffphone = DeliveryStaffPhone; //Delivery staff Phone Number 20
        deliverystatus = Deliverystatus; // the status of the order 18
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public String getAssignperson() {
        return assignperson;
    }

    public String getStaffphone() {
        return staffphone;
    }

    public void setDeliverystatus(String Deliverystatus) {
        deliverystatus = Deliverystatus;
    }

    public void setAssginperson(String DeliveryStaff) {
        assignperson = DeliveryStaff;
    }

    public void setStaffphone(String DeliveryStaffPhone) {
        staffphone = DeliveryStaffPhone ;
    }

    //Update Order
    public void UpdateDelivery() {
        String removeTerm = orderid; 
        ArrayList <String> tempArray = new ArrayList <>();

        try{
            File file = new File("Orders.txt");
            file.createNewFile();
            Scanner sc = new Scanner(file);
            String data;

            while((data = sc.nextLine()) != null){
                String[] tempData = data.split(",");
                if(!removeTerm.equals(tempData[0])){
                    tempArray.add(data);
                }
            }
            sc.close();
        } catch(Exception ex) {
            ex.toString();
        }
        try{
            try(PrintWriter pr = new PrintWriter("Orders.txt")){
                for(String newFile : tempArray){
                    pr.println(newFile);
                }
                pr.close();
            }
        } catch(Exception ex){
            ex.toString();
        }
        //change the status of the delivery
        File Finput = new File("Orders.txt");

        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = getOrderid()+ "," + getSendername()+ "," + getSenderaddress() + "," + getSenderphone() + ","+ getSenderemail() + "," + getReceivername()+ "," + getReceiveraddress() 
                    + "," + getReceiverphone()+ "," + getReceiveremail()+ "," + getOrderdate() + "," + getWeight() + ","+ getWidth() + "," + getLength()+ "," + getHeight() + "," + getOrderdetails()
                    + "," + getShippingfee()  + "," + getItemprice()+ "," + getTotal()+ "," + getDeliverystatus() + "," + getAssignperson() + ","+ getStaffphone() + "," + getUserid();            
            //in the textfile, each data will have one row blank b4 next line
            //use pw to write data you want to write
            pw.write(Line);
            bw.newLine();
            pw.close();
            System.out.println("Order Updated!");
        } catch (IOException ex) {
           ex.toString();
        }
    }

    //Load Delivery into Table for specific reasons
    //Custoemr can view their own delivery
    //Managing staff can assign a delivery staff into delivery
    //Delivery staff can view their current delivery
    public String LoadDelivery() {
        try {
            File file1 = new File ("UserDetails.txt");
            File file2 = new File("Orders.txt");
            Scanner sc1 = new Scanner(file1);
            Scanner sc2 = new Scanner(file2);
            String temp;
            boolean found = false;
            BufferedReader br2 = new BufferedReader (new FileReader(file2));
            StringBuilder sb = new StringBuilder();

            while(sc1.hasNext() && !found) {
                temp = sc1.nextLine();
                String[] tempArr;
                tempArr = temp.split(",");

                if(userid.equals(tempArr[0])) {
                    String TempUserType = tempArr[2]; // Return the usertype to the variable
                    if(TempUserType.equals("Customer")) {
                        Object[] details = br2.lines().toArray();
                        for (Object detail : details) { 
                            String line = detail.toString().trim();
                            String[] row = line.split(",");
                            if (userid.equals(row[21])) {
                                orderid = row[0];
                                orderdate = row[9];
                                total = row[17];
                                deliverystatus = row[18];
                                sb.append(orderid + "," + orderdate + "," + total + "," + deliverystatus + "\n");                             
                            }
                        }
                    return sb.toString();
                    } else if(TempUserType.equals("Managing Staff")) {
                        Object[] details = br2.lines().toArray();
                        for (Object detail : details) {
                            String line = detail.toString().trim();
                            String[] row = line.split(",");
                            assignperson = row[19];
                            if(assignperson.equals("None")) {
                                orderid = row[0];
                                orderdate = row[9];
                                total = row[17];
                                deliverystatus = row[18];    
                                sb.append(orderid + "," + orderdate + "," + total + "," + deliverystatus + "\n");   
                            }
                        }
                    return sb.toString();
                    } else if(TempUserType.equals("Delivery Staff")) {
                        Object[] details = br2.lines().toArray();
                        for (Object detail : details) {
                            String line = detail.toString().trim();
                            String[] row = line.split(",");
                            assignperson = row[19];
                            if(assignperson.equals(userid)) {
                                orderid = row[0];
                                orderdate = row[9];
                                total = row[17];
                                deliverystatus = row[18];    
                                sb.append(orderid + "," + orderdate + "," + total + "," + deliverystatus + "\n");   
                            }
                        }
                    return sb.toString();
                    } else {
                        return "cannot found any role in this form";
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "error in loadorder";
    }

    //Load all Data Into Order Table
    //Managing Staff view all delivery
    public String LoadAllDelivery() {
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
                    assignperson = row[19];
                    if(!assignperson.equals("None")) {
                        orderid = row[0];
                        orderdate = row[9];
                        total = row[17];
                        deliverystatus = row[18];    
                        sb.append(orderid + "," + orderdate + "," + total + "," + deliverystatus + "\n"); 
                    } else {
                        sb.append("There is no Order");
                    }
                }
            return sb.toString();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "error in Order.java";
    }
}
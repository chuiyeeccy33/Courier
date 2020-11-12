
package courier;

import java.io.*;
import java.util.*;

public class Orders {
    //composition 
    private Users users;
    //general
    //person details
    private String orderid;
    private String userid;
    private String sendername;
    private String senderaddress;
    private String senderphone;
    private String senderemail;
    private String receivername;
    private String receiveraddress;
    private String receiverphone;
    private String receiveremail;
    //order details
    private String orderdate;
    private String weight;
    private String width;
    private String length;
    private String height;
    private String orderdetails;
    private String shippingfee;
    private String itemprice;
    private String total;
    //delivery side
    private String deliverystatus;
    //admin
    private String assignperson;
    //customer
    private String staffphone;
    
    public Orders(){}
    
    public Orders(String Orderid, String Sendername, String Senderaddress, String Senderphone, String Senderemail, String Receivername, String Receiveraddress, 
            String Receiverphone,String Receiveremail,String Orderdate, String Weight, String Width, String Length,String Height, String Orderdetails, String Shippingfee, 
            String Itemprice, String Total, String Deliverystatus,String Assignperson, String Staffphone, String Userid) {
        
        orderid = Orderid; //Order ID 0
        userid = Userid; //Customer ID 1
        sendername = Sendername; //Customer Name 2
        senderaddress = Senderaddress; //Customer address 3
        senderphone = Senderphone; //Customer Phone Number 4
        senderemail = Senderemail; //Customer Email 5
        receivername = Receivername; //Receiver Name 6
        receiveraddress = Receiveraddress; // Receiver Address 7
        receiverphone = Receiverphone; // Receiver Phone Number 8
        receiveremail = Receiveremail; // Receiver Email 9
        orderdate = Orderdate; //Order Date 10
        weight = Weight; //Weight of the Item 11
        width = Width; //Width of the Item 12
        length = Length; //length of the Item 13
        height = Height; // Height of the Item 14
        orderdetails = Orderdetails; //Order Description 15
        shippingfee = Shippingfee; //Shipping Fees Selection 16
        itemprice = Itemprice; // Shipping Fees Amount 17
        total = Total; //Total Amount of the order 18
        deliverystatus = Deliverystatus; // the status of the order 19
        assignperson = Assignperson; //Delivery Staff to the order 20
        staffphone = Staffphone; //Delivery staff Phone Number 21
        this.users = new Users();
    }
    
    //get
    public String getType() {
        return users.getSelectedUserType();
    }
      
    private String getOrderid() {
        return orderid;
    }
    
    private String getUserid() {
        return userid;
    }
    
    private String getSendername(){
        return sendername;
    }
    
    private String getSenderaddress() {
        return senderaddress;
    }
    
    private String getSenderphone() {
        return senderphone;
    }
    
    private String getSenderemail() {
        return senderemail;
    }
    
    private String getReceivername() {
        return receivername;
    }
    
    private String getReceiveraddress() {
        return receiveraddress;
    }
    
    private String getReceiverphone() {
        return receiverphone;
    }
    
    private String getReceiveremail() {
        return receiveremail;
    }
    
    private String getOrderdate() {
        return orderdate;
    }
    
    private String getWeight() {
        return weight;
    }
    
    private String getWidth() {
        return width;
    }
    
    private String getLength() {
        return length;
    }
    
    private String getHeight() {
        return height;
    }
    
    private String getOrderdetails() {
        return orderdetails;
    }
    
    private String getShippingfee() {
        return shippingfee;
    }
    
    private String getItemprice() {
        return itemprice;
    }
    
    private String getTotal() {
        return total;
    }
    private String getDeliverystatus() {
        return deliverystatus;
    }
    
    private String getAssignperson() {
        return assignperson;
    }
    
    private String getStaffphone() {
        return staffphone;
    }
    
    //set
     public void setOrderid(String Orderid) {
        orderid = Orderid;
    }
    
    public void setUserid(String Userid) {
        userid = Userid;
    }
    
    public void setSendername(String Sendername){
        sendername = Sendername;
    }
    
    public void setSenderaddress(String Senderaddress) {
        senderaddress = Senderaddress;
    }
    
    public void setSenderphone(String Senderphone) {
        senderphone = Senderphone;
    }
    
    public void setSenderemail(String Senderemail) {
        senderemail = Senderemail;
    }
    
    public void setReceivername(String Receivername) {
        receivername = Receivername;
    }
    
    public void setReceiveraddress(String Receiveraddress) {
        receiveraddress = Receiveraddress;
    }
    
    public void setReceivephone(String Receiverphone) {
        receiverphone = Receiverphone;
    }
    
    public void setReceiveemail(String Receiveremail) {
        receiveremail = Receiveremail;
    }
    
    public void setOrderdate(String Orderdate) {
        orderdate = Orderdate;
    }
    
    public void setWeight(String Weight) {
         weight = Weight;
    }
    
    public void setWidth(String Width) {
        width = Width;
    }
    
    public void setLength(String Length) {
        length = Length;
    }
    
    public void setHeight(String Height) {
        height = Height;
    }
    
    public void setOrderdetails(String Orderdetails) {
        orderdetails = Orderdetails;
    }
    
    public void setShippingfee(String Shippingfee) {
        shippingfee = Shippingfee;
    }
    
    public void setItemprice(String Itemprice) {
        itemprice = Itemprice;
    }
    
    public void setTotal(String Total) {
        total = Total;
    }
    public void setDeliverystatus(String Deliverystatus) {
        deliverystatus = Deliverystatus;
    }
    
    public void setAssginperson(String Assignperson) {
        assignperson = Assignperson;
    }
    
    public void setStaffphone(String Staffphone) {
        staffphone = Staffphone ;
    }
    
    public String toString() {
        return orderid + userid;
    }
        
    //add new orders from user
    public void SaveOrderFile() {
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
            System.out.println("Order Added!");
        } catch (IOException ex) {
           
        }
    }
    
    public boolean checkEmptyOrderField() {
        return sendername.equals("") ||  senderaddress.equals("")|| senderphone.equals("")|| senderemail.equals("")|| receivername.equals("")|| receiveraddress.equals("")|| receiverphone.equals("")
                || receiveremail.equals("")|| orderdate.equals("") || weight.equals("")|| width.equals("") || length.equals("")|| height.equals("") || orderdetails.equals("")
                || shippingfee.equals("");
    }//|| itemprice.equals("")|| deliverystatus.equals("")|| assignperson.equals("")
     
    public void Back(String user) {
        userid = user;
        new DeliveryStaffOrderPage(userid).setVisible(true);              
    }

      //remove order detail
    public void RemoveOrder(){
        String removeTerm = "c9680219-292b-4beb-a016-1e70acca4454"; 
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
        } catch(Exception ex){
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
    }
    
    public void UpdateOrder() {
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
           
        }
    }
       
    public void Back(String user, String type){
        userid = user;
        type = getType();
        if (type.equals("Customer")) {
            new CustomerDashboard(userid).setVisible(true);
        } else if(type.equals("Managing Staff")) {
            new ManagingStaffDasboard(userid).setVisible(true);
        } else{
            new DeliveryStaffDashboardPage(userid).setVisible(true);           
        }       
    }
    
    public String LoadOrder() {
        try {
            File file1 = new File ("UserDetails.txt");
            File file2 = new File("Orders.txt");
            Scanner sc1 = new Scanner(file1);
            Scanner sc2 = new Scanner(file2);
            String temp;
            boolean found = false;
            String strLine;
            BufferedReader br1 = new BufferedReader (new FileReader(file1));
            BufferedReader br2 = new BufferedReader (new FileReader(file2));
            
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
                            orderid = row[0];
                            orderdate = row[9];
                            total = row[17];
                            deliverystatus = row[18];    
                            return orderid + "," + orderdate + "," + total + "," + deliverystatus;
                        }
                    }
                }
            }
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "error in loadorder";
    }
}

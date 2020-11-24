
package courier;

import java.io.*;
import java.util.*;

public class Orders {
    //composition 
    public Users users = new Users();
    //general
    //person details
    public String orderid;
    public String orderdate;
    public String userid;
    public String sendername;
    public String senderaddress;
    public String senderphone;
    public String senderemail;
    public String receivername;
    public String receiveraddress;
    public String receiverphone;
    private String receiveremail;
    //order details
    public String weight;
    public String width;
    public String length;
    public String height;
    public String orderdetails;
    public String itemprice;
    public String shippingfee;
    public String total;
    
    public Orders(){}
    
    public Orders(String Orderid, String Sendername, String Senderaddress, String Senderphone, String Senderemail, String Receivername, String Receiveraddress, 
            String Receiverphone,String Receiveremail,String Orderdate, String Weight, String Width, String Length,String Height, String Orderdetails, String Shippingfee, 
            String Itemprice, String Total, String Deliverystatus,String Assignperson, String Staffphone, String Userid) {
        
        orderid = Orderid; //Order ID 0
        userid = Userid; //Customer ID 21
        sendername = Sendername; //Customer Name 1
        senderaddress = Senderaddress; //Customer address 2
        senderphone = Senderphone; //Customer Phone Number 3
        senderemail = Senderemail; //Customer Email 4
        receivername = Receivername; //Receiver Name 5
        receiveraddress = Receiveraddress; // Receiver Address 6
        receiverphone = Receiverphone; // Receiver Phone Number 7
        receiveremail = Receiveremail; // Receiver Email 8
        orderdate = Orderdate; //Order Date 9
        weight = Weight; //Weight of the Item 10
        width = Width; //Width of the Item 11
        length = Length; //length of the Item 12
        height = Height; // Height of the Item 13
        orderdetails = Orderdetails; //Order Description 14
        shippingfee = Shippingfee; //Shipping Fees Selection 15
        itemprice = Itemprice; // Shipping Fees Amount 16
        total = Total; //Total Amount of the order 17
        this.users = new Users();
    }
    
    //get
    public Users getSelectedUserType() {
        return users;
    }
      
    public String getOrderid() {
        return orderid;
    }
    
    public String getUserid() {
        return userid;
    }
    
    public String getSendername(){
        return sendername;
    }
    
    public String getSenderaddress() {
        return senderaddress;
    }
    
    public String getSenderphone() {
        return senderphone;
    }
    
    public String getSenderemail() {
        return senderemail;
    }
    
    public String getReceivername() {
        return receivername;
    }
    
    public String getReceiveraddress() {
        return receiveraddress;
    }
    
    public String getReceiverphone() {
        return receiverphone;
    }
    
    public String getReceiveremail() {
        return receiveremail;
    }
    
    public String getOrderdate() {
        return orderdate;
    }
    
    public String getWeight() {
        return weight;
    }
    
    public String getWidth() {
        return width;
    }
    
    public String getLength() {
        return length;
    }
    
    public String getHeight() {
        return height;
    }
    
    public String getOrderdetails() {
        return orderdetails;
    }
    
    public String getShippingfee() {
        return shippingfee;
    }
    
    public String getItemprice() {
        return itemprice;
    }
    
    public String getTotal() {
        return total;
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
                    + "," + getShippingfee()  + "," + getItemprice()+ "," + getTotal()+ "," + "" + "," + "" + ","+ "" + "," + getUserid();
            //in the textfile, each data will have one row blank b4 next line
            //use pw to write data you want to write
            pw.write(Line);
            bw.newLine();
            pw.close();
            System.out.println("Order Added!");
        } catch (IOException ex) {
            ex.toString();
        }
    }
    
    public boolean checkEmptyOrderField() {
        return sendername.equals("") ||  senderaddress.equals("")|| senderphone.equals("")|| senderemail.equals("")|| receivername.equals("")|| receiveraddress.equals("")|| receiverphone.equals("")
                || receiveremail.equals("")|| orderdate.equals("") || weight.equals("")|| width.equals("") || length.equals("")|| height.equals("") || orderdetails.equals("")
                || shippingfee.equals("");
    }
     
    //remove order detail
    public void RemoveOrder(){
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
       
    //delete order detail
     public void DeletedOrder() {
        File Finput = new File("DeletedOrders.txt");
      
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = getOrderid()+ "," + getSendername()+ "," + getSenderaddress() + "," + getSenderphone() + ","+ getSenderemail() + "," + getReceivername()+ "," + getReceiveraddress() 
                    + "," + getReceiverphone()+ "," + getReceiveremail()+ "," + getOrderdate() + "," + getWeight() + ","+ getWidth() + "," + getLength()+ "," + getHeight() + "," + getOrderdetails()
                    + "," + getShippingfee()  + "," + getItemprice()+ "," + getTotal() + "," + getUserid();
            //in the textfile, each data will have one row blank b4 next line
            //use pw to write data you want to write
            pw.write(Line);
            bw.newLine();
            pw.close();
            System.out.println("Order Deleted!");
        } catch (IOException ex) {
           
        }
    }
    
    //Back Button
    public void Back(String user, String type){
        userid = user;
        type = users.getSelectedUserType();
        if (type.equals("Customer")) {
            new CustomerDashboard(userid).setVisible(true);
        } else if(type.equals("Managing Staff")) {
            new ManagingStaffDasboard(userid).setVisible(true);
        } else{
            new DeliveryStaffDashboardPage(userid).setVisible(true);           
        }       
    }
       
    // view order details to table    
    public void ViewFormBackToTable(String user, String type){
            userid = user;
            type = users.getSelectedUserType();
            if (type.equals("Customer")) {
                new CustomerOrderTable(userid).setVisible(true);
            }else if(type.equals("Managing Staff")) {
                new ManagingStaffAllOrder(userid).setVisible(true);
            }else {
                new DeliveryStaffOrderPage(userid).setVisible(true);           
            }
}

    //order details to table
    public void FormBackToTable(String user, String type){
            userid = user;
            type = users.getSelectedUserType();
            if (type.equals("Customer")) {
                new CustomerOrderTable(userid).setVisible(true);
            }else if(type.equals("Managing Staff")) {
                new ManagingStaffAssignOrder(userid).setVisible(true);
            }
    }
}

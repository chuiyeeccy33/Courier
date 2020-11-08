
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
            String Itemprice, String Total, String Deliverystatus,String Assignperson, String Staffphone, String Userid){
        orderid = Orderid;
        userid = Userid;
        sendername = Sendername;
        senderaddress = Senderaddress;
        senderphone = Senderphone;
        senderemail = Senderemail;
        receivername = Receivername;
        receiveraddress = Receiveraddress;
        receiverphone = Receiverphone;
        receiveremail = Receiveremail;
        orderdate = Orderdate;
        weight = Weight;
        width = Width;
        length = Length;
        height = Height;
        orderdetails = Orderdetails;
        shippingfee = Shippingfee;
        itemprice = Itemprice;
        total = Total;
        deliverystatus = Deliverystatus;
        assignperson = Assignperson;
        staffphone = Staffphone;
        //users.java
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
                || receiveremail.equals("")|| orderdate.equals("") || weight.equals("")|| width.equals("") || length.equals("")|| height.equals("") || orderdetails.equals("")|| shippingfee.equals("")
                || itemprice.equals("");
    }//|| deliverystatus.equals("")|| assignperson.equals("")
     
    public void Back(String user){
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
    
    //update new user detail
    /*public void UpdateUser() {
        File Finput = new File("UserDetails.txt");
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
             String Line = getOrderid()+ "," + getSendername()+ "," + getSenderaddress() + "," + getSenderphone() + ","+ getSenderemail() + "," + getReceivername()+ "," + getReceiveraddress() 
                    + "," + getReceiverphone()+ "," + getReceiveremail()+ "," + getOrderdate() + "," + getWeight() + ","+ getWidth() + "," + getLength()+ "," + getHeight() + "," + getOrderdetails()
                    + "," + getShippingfee()  + "," + getItemprice()+ "," + getTotal()+ "," + getDeliverystatus() + "," + getAssignperson() + ","+ getStaffphone() + "," + getUserid();
              //remove blank line when update
            if (!Line.isEmpty()) {
                //use pw to write data you want to write
                pw.write(Line);
                //escape the blank line
                pw.write("\n");
            }
            pw.close();
            System.out.println("User Updated!");
        } catch (IOException ex) {
           
        }
   }*/
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
}

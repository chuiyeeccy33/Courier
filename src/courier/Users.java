
package courier;

import java.awt.Component;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users {
    public String userid;
    public String username;
    public String selectedusertype;
    public String firstname;
    public String lastname;
    public String email;
    public String phone;
    public String password;
    public String status;
     
    //constructor
    public Users(){}
    public Users(String Userid, String Username,String SelectedUserType, String Firstname, String Lastname, String Email, String Phone, String Password, String Status){
        userid = Userid;
        username = Username;
        selectedusertype = SelectedUserType;
        firstname = Firstname;
        lastname = Lastname;
        email = Email;
        phone = Phone;
        password = Password;
        status = Status;
    }
    
    //get
    public String getUserid() {
        return userid;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getSelectedUserType() {
        return selectedusertype;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getPassword() {
        return password;
    } 
    
    public String getStatus() {
        return status;
    }
    
    public void setUserid(String Userid) {
        userid = Userid;
    }

    //set
    public void setUsername(String Username) {
        username = Username;
    }
    
    public void setSelectedUserType(String SelectedUserType) {
        selectedusertype = SelectedUserType;
    }
    
    public void setFirstname(String Firstname) {
        firstname = Firstname;
    }
    
    public void setLastname(String Lastname) {
        lastname = Lastname;
    }
    
    public void setEmail(String Email) {
        email = Email;
    }
    
    public void setPhone(String Phone) {
        phone = Phone;
    }
    
    public void setPassword(String Password) {
        password = Password;
    }
    
    public void setStatus(String Status) {
        status = Status;
    }

    public String toString() {
        return userid;
    }
   
    //create an account for user
    public void SignUp() {
        File Finput = new File("UserDetails.txt");
      
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = userid + "," + username + "," + selectedusertype + "," + firstname + ","+ lastname + "," + email + "," + phone + "," + password + "," + status;
            //in the textfile, each data will have one row blank b4 next line
            //use pw to write data you want to write
            pw.write(Line);
            bw.newLine();
            pw.close();
        } catch (IOException ex) {
           
        }
    }
   
    //check emtpy field
    public boolean checkEmpty() {
        return username.equals("") ||  firstname.equals("")||lastname.equals("")||email.equals("")||phone.equals("")||password.equals("");
    }
    
    //update new user detail
    public void UpdateProfile() {
        //delete user first
        String removeTerm = userid; 
        ArrayList <String> tempArray = new ArrayList <>();

        try{
            File file = new File("UserDetails.txt");
            file.createNewFile();
            Scanner sc = new Scanner(file);
            String data;
            
            while((data = sc.nextLine()) != null){
                String[] tempData = data.split(",");
                if(!removeTerm.equals(tempData[0])) {
                    tempArray.add(data);
                }
            }
        sc.close();
        } catch(Exception ex){
            ex.toString();
        }
        
        try{
            try(PrintWriter pr = new PrintWriter("UserDetails.txt")){
                for(String newFile : tempArray){
                    pr.println(newFile);
                }
                pr.close();
            }
        } catch(Exception ex){
            ex.toString();
        }
        
        //update user
        File Finput = new File("UserDetails.txt");
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = userid + "," + username + "," + selectedusertype + "," + firstname + ","+ lastname + "," + email + "," + phone + "," + password + "," + status;
              //remove blank line when update
            if (!Line.isEmpty()) {
                //use pw to write data you want to write
                pw.write(Line);
                //escape the blank line
                pw.write("\n");
            }
            pw.close();
        } catch (IOException ex) {
           
        }
   } 
    
    public void Back(String user, String type){
        userid = user;
        selectedusertype = type;
        if (type.equals("Customer")) {
            new CustomerDashboard(userid).setVisible(true);
        } else if(type.equals("Managing Staff")) {
            new ManagingStaffDasboard(userid).setVisible(true);
        }else{
            new DeliveryStaffDashboardPage(userid).setVisible(true);           
        }       
    }
}

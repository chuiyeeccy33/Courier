
package courier;

import java.awt.Component;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Users {
    private String userid;
    private String username;
    private String selectedusertype;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private String status;
     
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
    private String getUserid() {
        return userid;
    }
    
    private String getUsername() {
        return username;
    }
    
    private String getSelectedUserType() {
        return selectedusertype;
    }
    
    private String getFirstname() {
        return firstname;
    }
    
    private String getLastname() {
        return lastname;
    }
    
    private String getEmail() {
        return email;
    }
    
    private String getPhone() {
        return phone;
    }
    
    private String getPassword() {
        return password;
    } 
    
    private String getStatus() {
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
    public void UserSaveFile() {
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
            System.out.println("User Added!");
        } catch (IOException ex) {
           
        }
    }
   
    //check emtpy field
    public boolean checkEmpty() {
        return username.equals("") ||  firstname.equals("")||lastname.equals("")||email.equals("")||phone.equals("")||password.equals("");
    }
    
    //remove user detail
    public void RemoveUser(){
        String removeTerm = userid; 
        ArrayList <String> tempArray = new ArrayList <>();

        try{
            File file = new File("UserDetails.txt");
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
            try(PrintWriter pr = new PrintWriter("UserDetails.txt")){
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
    public void UpdateUser() {
        File Finput = new File("UserDetails.txt");
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = userid + "," + username + "," + selectedusertype + "," + firstname + ","+ lastname + "," + email + "," + phone + "," + password + status;
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

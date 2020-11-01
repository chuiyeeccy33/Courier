
package courier;

import java.awt.Component;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Users {
    private String username;
    private String selectedusertype;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    
    public Users(){}
    public Users(String Username, String Firstname, String Lastname, String Email, String Phone){
        username = Username;
        firstname = Firstname;
        lastname = Lastname;
        email = Email;
        phone = Phone;
    }
     
    public Users(String Username,String SelectedUserType, String Firstname, String Lastname, String Email, String Phone, String Password){
        username = Username;
        selectedusertype = SelectedUserType;
        firstname = Firstname;
        lastname = Lastname;
        email = Email;
        phone = Phone;
        password = Password;
    }
    
   public String getUsername() {return username;}
   public String getSelectedUserType() {return selectedusertype;}
   public String getFirstname() {return firstname;}
   public String getLastname() {return lastname;}
   public String getEmail() {return email;}
   public String getPhone() {return phone;}
   public String getPassword() {return password;}
   
   public void setUsername(String Username) {username = Username;}
   public void setSelectedUserType(String SelectedUserType) {selectedusertype = SelectedUserType;}
   public void setFirstname(String Firstname) {firstname = Firstname;}
   public void setLastname(String Lastname) {lastname = Lastname;}
   public void setEmail(String Email) {email = Email;}
   public void setPhone(String Phone) {phone = Phone;}
   public void setPassword(String Password) {password = Password;}
   
   public String toString() {return username + password;}
   
    //create an account for user
    public void UserSaveFile() {
        File Finput = new File("UserDetails.txt");
      
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = username + "," + selectedusertype + "," + firstname + ","+ lastname + "," + email + "," + phone + "," + password;
            //in the textfile, each data will have one row blank b4 next line
            bw.newLine();
            //use pw to write data you want to write
            pw.write(Line);      
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
        String removeTerm = username; 
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
            String Line = username + "," + selectedusertype + "," + firstname + ","+ lastname + "," + email + "," + phone + "," + password;
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
        username=user;
        selectedusertype=type;
        if (type.equals("Customer")) {
            new CustomerDashboard(user).setVisible(true);
        } else if(type.equals("Managing Staff")) {
            new ManagingStaffDasboard(user).setVisible(true);
        }else{
            new DeliveryStaffDashboardPage(user).setVisible(true);           
        }       
    }
}


package courier;

import java.io.*;

public class Users {
    private String username;
    private String selectedusertype;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private String confirmpassword;
    
    public Users(){}
     public Users(String Username, String Firstname, String Lastname, String Email, String Phone){
    username=Username;
    firstname=Firstname;
    lastname=Lastname;
    email=Email;
    phone=Phone;
    }
    public Users(String Username,String SelectedUserType, String Firstname, String Lastname, String Email, String Phone, String Password, String Confirmpassword ){
    username=Username;
    selectedusertype=SelectedUserType;
    firstname=Firstname;
    lastname=Lastname;
    email=Email;
    phone=Phone;
    password=Password;
    confirmpassword=Confirmpassword;
    }
   private String getUsername(){return username;}
   private String getSelectedUserType(){return selectedusertype;}
   private String getFirstname(){return firstname;}
   private String getLastname(){return lastname;}
   private String getEmail(){return email;}
   private String getPhone(){return phone;}
   private String getPassword(){return password;}
   private String getConfirmpassword(){return confirmpassword;}
   
   public void setUsername(String Username){username=Username;}
   public void setSelectedUserType(String SelectedUserType){selectedusertype=SelectedUserType;}
   public void setFirstname(String Firstname){firstname=Firstname;}
   public void setLastname(String Lastname){lastname=Lastname;}
   public void setEmail(String Email){email=Email;}
   public void setPhone(String Phone){phone=Phone;}
   public void setPassword(String Password){password=Password;}
   public void setConfirmpassword(String Confirmpassword){confirmpassword=Confirmpassword;}
   
   public String toString(){return username + password;}
   
   public void UserSaveFile(){
     File Finput = new File("UserDetails.txt");
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = username + "," + selectedusertype + "," + firstname + ","+ lastname + "," + email + "," + phone + "," + password + "," + confirmpassword;
            //in the textfile, each data will have one row blank b4 next line
            bw.newLine();
            //use pw to write data you want to write
            pw.write(Line);
            pw.close();
            System.out.println("Data Written!");
        } catch (IOException ex) {
           
        }
   } 
    public boolean checkEmpty(){
        return username.equals("") ||  firstname.equals("")||lastname.equals("")||email.equals("")||phone.equals("")||password.equals("")||confirmpassword.equals("");
    
    }    
}

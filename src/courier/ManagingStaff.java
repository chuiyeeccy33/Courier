package courier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagingStaff extends Staff  {
    
    public void ApproveUser() {
        //search the data in the textfile
        String searchTerms = username;
        Scanner scan;
        try {
            scan = new Scanner(new File("UserDetails.txt"));
            while(scan.hasNext()) {
                String line = scan.nextLine().toString();
                if(line.contains(searchTerms)) {
                    String[] tempArr;
                    tempArr = line.split(",");
                    userid = tempArr[0];
                    username = tempArr[1];
                    selectedusertype = tempArr[2];
                    firstname = tempArr[3];
                    lastname = tempArr[4];
                    email = tempArr[5];
                    phone = tempArr[6];
                    password = tempArr[7];
                    status = "Active";
                    
                    //remove User
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
                    //end of remove User
                    
                    //update status
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
                        System.out.println("User Approved");
                    } catch (IOException ex) {

                    }
                    //end of update status
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void RejectUser() {
        //search the data in the textfile
        String searchTerms = username;
        Scanner scan;
        try {
            scan = new Scanner(new File("UserDetails.txt"));
            while(scan.hasNext()) {
                String line = scan.nextLine().toString();
                if(line.contains(searchTerms)) {
                    String[] tempArr;
                    tempArr = line.split(",");
                    userid = tempArr[0];
                    username = tempArr[1];
                    selectedusertype = tempArr[2];
                    firstname = tempArr[3];
                    lastname = tempArr[4];
                    email = tempArr[5];
                    phone = tempArr[6];
                    password = tempArr[7];
                    status = "Reject";
                    
                    //remove User
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
                    //end of remove User
                    
                    //update status
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
                        System.out.println("User Decline");
                    } catch (IOException ex) {

                    }
                    //end of update status
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void ActivateUser() {
        //search the data in the textfile
        String searchTerms = username;
        Scanner scan;
        try {
            scan = new Scanner(new File("UserDetails.txt"));
            while(scan.hasNext()) {
                String line = scan.nextLine().toString();
                if(line.contains(searchTerms)) {
                    String[] tempArr;
                    tempArr = line.split(",");
                    userid = tempArr[0];
                    username = tempArr[1];
                    selectedusertype = tempArr[2];
                    firstname = tempArr[3];
                    lastname = tempArr[4];
                    email = tempArr[5];
                    phone = tempArr[6];
                    password = tempArr[7];
                    status = "Active";
                    
                    //remove User
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
                    //end of remove User
                    
                    //update status
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
                        System.out.println("User Activated");
                    } catch (IOException ex) {

                    }
                    //end of update status
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    //deactivate user
     public void DeactivateUser() {
        File Finput = new File("UserDetails.txt");
      
        try {
            FileWriter fw = new FileWriter(Finput,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String Line = getUserid()+ "," + getUsername()+ "," + getSelectedUserType() + "," + getFirstname() + ","+ getLastname() + "," + getEmail()+ "," + getPhone() 
                    + "," + getPassword()+ "," + getStatus();
            //in the textfile, each data will have one row blank b4 next line
            //use pw to write data you want to write
            pw.write(Line);
            bw.newLine();
            pw.close();
            System.out.println("User deactivated!");
        } catch (IOException ex) {
           
        }
    }
     
    public String LoadUser() {
        try {
            FileReader rf = new FileReader("UserDetails.txt");
            BufferedReader br = new BufferedReader(rf);
            Object[] details = br.lines().toArray();
            StringBuilder sb = new StringBuilder();
            for (Object detail : details) {
                String line = detail.toString().trim();
                String[] row = line.split(",");
                if (selectedusertype.equals(row[2])) {
                    userid = row[0];
                    username = row[1];
                    selectedusertype = row[2];
                    firstname = row[3];
                    lastname = row[4];
                    email = row[5];
                    phone = row[6];
                    status = row[8];
                    sb.append(userid + "," + username + "," + selectedusertype + "," + firstname + "," + lastname + "," + email + "," + phone + "," + status);
                } else {
                    userid = row[0];
                    username = row[1];
                    selectedusertype = row[2];
                    firstname = row[3];
                    lastname = row[4];
                    email = row[5];
                    phone = row[6];
                    status = row[8];
                    sb.append(userid + "," + username + "," + selectedusertype + "," + firstname + "," + lastname + "," + email + "," + phone + "," + status);
                }
            }
            return sb.toString();          
        } catch(FileNotFoundException ex) {
                       ex.toString();
        }
        return "error in load user";
    }
}

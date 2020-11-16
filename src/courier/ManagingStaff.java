package courier;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
}
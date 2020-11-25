/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class SignUpPage extends javax.swing.JFrame {

    public SignUpPage() {
        initComponents();
         setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Fast & Furious Express");
        groupButton();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        firstnametxt = new javax.swing.JTextField();
        lastnametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        confirmpasstxt = new javax.swing.JPasswordField();
        passwordtxt = new javax.swing.JPasswordField();
        customerRbtn = new javax.swing.JRadioButton();
        managingRbtn = new javax.swing.JRadioButton();
        deliveryRbtn = new javax.swing.JRadioButton();
        usertypelbl = new javax.swing.JLabel();
        validationlbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 650));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 245, 238));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel2.setText("Fast & Furious Express");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 110);

        jPanel2.setBackground(new java.awt.Color(21, 71, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up Here");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Username");

        usernametxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("First name");

        firstnametxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lastnametxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Last Name");

        emailtxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        phonetxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        phonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonetxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Phone No");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Confirm Password");

        signupbtn.setBackground(new java.awt.Color(214, 245, 238));
        signupbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        signupbtn.setText("Sign Up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        confirmpasstxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        passwordtxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        customerRbtn.setBackground(new java.awt.Color(129, 182, 157));
        customerRbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        customerRbtn.setForeground(new java.awt.Color(240, 240, 240));
        customerRbtn.setText("Customer");

        managingRbtn.setBackground(new java.awt.Color(129, 182, 157));
        managingRbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        managingRbtn.setForeground(new java.awt.Color(240, 240, 240));
        managingRbtn.setText("Managing Staff");

        deliveryRbtn.setBackground(new java.awt.Color(129, 182, 157));
        deliveryRbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        deliveryRbtn.setForeground(new java.awt.Color(240, 240, 240));
        deliveryRbtn.setText("Delivery Staff");

        usertypelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usertypelbl.setForeground(new java.awt.Color(240, 240, 240));
        usertypelbl.setText("User Type");

        validationlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        validationlbl.setForeground(new java.awt.Color(204, 13, 13));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Login Here");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(295, 295, 295)
                                .addComponent(usertypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(287, 287, 287)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(314, 314, 314)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(290, 290, 290)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(signupbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(confirmpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customerRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(managingRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deliveryRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(usertypelbl))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(managingRbtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(deliveryRbtn))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(customerRbtn)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(validationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(signupbtn)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 110, 850, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
    ArrayList <Users> UList = new ArrayList<Users>();        
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        
        UUID TempID = UUID.randomUUID();
        String UserID = TempID.toString();
        String Tempuser = usernametxt.getText();
        String Tempselectedradio = getUserType();
        String Tempfirst = firstnametxt.getText();
        String Templast = lastnametxt.getText();
        String Tempemail = emailtxt.getText();       
        String Tempphone = phonetxt.getText();
        String Temppass= new String(passwordtxt.getPassword()); //Password
        String Tempconfirmpass = new String(confirmpasstxt.getPassword()); //Confirm Password
        String Tempstatus = "";
        
        //Assign User detail from the text field
        Users u = new Users(UserID, Tempuser,Tempselectedradio,Tempfirst,Templast,Tempemail,Tempphone,Temppass,Tempstatus);
        
        if(u.checkEmpty()) { //if the text field is empty
            JOptionPane.showMessageDialog(rootPane, "Please fill up the empty fields! ", "Empty ", JOptionPane.INFORMATION_MESSAGE);
        } 
        else{ //else the field is not empty
            try{
                File file = new File("UserDetails.txt");
                // execute when file is exist 
                if(file.exists()){
                    //read the data from the file
                    Scanner sc = new Scanner(file);
            
                    String temp;
                    boolean found = false;

                    //while loop the login file
                    while(sc.hasNext() &&  !found) { //the system will stop running until it found the correct username and password
                        temp = sc.nextLine(); //read line of text from login.txt
                        String[] tempArr;
                        tempArr = temp.split (",");
                        //if username and password
                        //if the usernama is found, cannnot continue to signup
                        if(Tempuser.equals(tempArr[0]) || Tempemail.equals(tempArr[3])) { 
                            JOptionPane.showMessageDialog(rootPane, "Username or Email is used by someone.", "Repeated", JOptionPane.INFORMATION_MESSAGE);
                            found = true;
                        }
                    }
                    //if the user didnt select any role
                    if(!found){
                        if (Tempselectedradio.equals("Empty")){
                            JOptionPane.showMessageDialog(rootPane, "Please select the user type!", "Remind", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            if(Tempemail.matches(regex)){
                                //if Password and Confirm Password is match
                                if(Tempconfirmpass.equals(Temppass) && !Tempconfirmpass.equals("") && !Temppass.equals("")){
                                    //show the Message
                                    JOptionPane.showMessageDialog(rootPane, "Your Fast and Furios Account is created ", "SignUp ", JOptionPane.INFORMATION_MESSAGE);
                                    //clear all the field
                                    clearFields();
                                    //role selection
                                    //customer sign up
                                    if(Tempselectedradio.equals("Customer")){
                                        this.dispose();
                                        //save file
                                        u.setStatus("Active");
                                        u.UserSaveFile();
                                        new Login().setVisible(true);
                                        //Staff sign up
                                    } else if(Tempselectedradio.equals("Managing Staff") || Tempselectedradio.equals("Delivery Staff")) {
                                        JOptionPane.showMessageDialog(rootPane, "Please wait for the admin to approve your request!", "Approve", JOptionPane.INFORMATION_MESSAGE);
                                        u.setStatus("Pending");
                                        u.UserSaveFile();
                                        this.dispose();
                                        new Login().setVisible(true);
                                    }
                                 //Password Validation
                                } else{
                                    JOptionPane.showMessageDialog(rootPane, "Please confirm your both password field is correct!", "Password", JOptionPane.INFORMATION_MESSAGE);
                                }          
                            } //the email is not in format
                            else {
                                JOptionPane.showMessageDialog(rootPane, "Please use the correct email format!", "Remind", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }      
                    }
                }else {
                // execute when file not exist   
                    if (Tempselectedradio.equals("Empty")) {
                        JOptionPane.showMessageDialog(rootPane, "Please select the user type!", "Remind", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if(Tempemail.matches(regex)){
                            //if Password and Confirm Password is match
                            if(Tempconfirmpass.equals(Temppass) && !Tempconfirmpass.equals("") && !Temppass.equals("")){
                                //show the Message
                                JOptionPane.showMessageDialog(rootPane, "Your Fast and Furios Account is created ", "SignUp ", JOptionPane.INFORMATION_MESSAGE);
                                //clear all the field
                                clearFields();

                                //role selection
                                //customer sign up
                                if(Tempselectedradio.equals("Customer")) {
                                    //save file
                                    u.UserSaveFile();
                                    this.dispose();
                                    new Login().setVisible(true);

                                //Staff sign up
                                } else if(Tempselectedradio.equals("Managing Staff") || Tempselectedradio.equals("Delivery Staff")) {
                                    JOptionPane.showMessageDialog(rootPane, "Please wait for the admin to approve your request!", "Approve", JOptionPane.INFORMATION_MESSAGE);
                                    this.dispose();
                                    new Login().setVisible(true);
                                }
                            //Password Validation
                            } else{
                                JOptionPane.showMessageDialog(rootPane, "Please confirm your both password field is correct!", "Password", JOptionPane.INFORMATION_MESSAGE);
                            }           
                        } //the email is not in format
                        else { 
                            JOptionPane.showMessageDialog(rootPane, "Please use the correct email format!", "Remind", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }   
                }
            } catch(FileNotFoundException ex) {
                ex.toString();
            }
        }
    }//GEN-LAST:event_signupbtnActionPerformed

    private void phonetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonetxtKeyTyped
        //function to allow digit to be typed
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_phonetxtKeyTyped

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void groupButton( ) {
        //group the radio button so, only one radio button can be selected at once
        ButtonGroup group = new ButtonGroup();
        group.add(customerRbtn);
        group.add(managingRbtn);
        group.add(deliveryRbtn);
    }
    
    private String getUserType() {
    //to return the selected radio button value
        if(customerRbtn.isSelected()){
            return "Customer";
        }  else if(managingRbtn.isSelected()){
            return "Managing Staff";
        }  else if(deliveryRbtn.isSelected()){
            return "Delivery Staff";
        } else{
            return "Empty";
        }
}
   
    private void clearFields(){ 
        //clears the textfields
        usernametxt.setText("");
        customerRbtn.setSelected(true);
        firstnametxt.setText("");
        lastnametxt.setText("");
        emailtxt.setText("");
        phonetxt.setText("");
        passwordtxt.setText("");
        confirmpasstxt.setText("");
        //set the cursor back to the ID textfield
        usernametxt.requestFocus();
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField confirmpasstxt;
    private javax.swing.JRadioButton customerRbtn;
    private javax.swing.JRadioButton deliveryRbtn;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JRadioButton managingRbtn;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField usernametxt;
    private javax.swing.JLabel usertypelbl;
    private javax.swing.JLabel validationlbl;
    // End of variables declaration//GEN-END:variables
}
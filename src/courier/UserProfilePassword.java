/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author daniellim0510
 */
public class UserProfilePassword extends javax.swing.JFrame {

    /**
     * Creates new form UserProfilePassword
     */
    String userid="";
    String usertype="";
    public UserProfilePassword(String user,String type) {
        initComponents();
        userid=user;
        usertype=type;
         setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Fast & Furious Express");
         try{
       File file = new File("UserDetails.txt");
        Scanner sc = new Scanner(file); 
        //read data from the file
       
       String temp;
       boolean found = false;

       while(sc.hasNext() && !found /*the system will stop running while it found the correct username and password*/){
           temp = sc.nextLine(); //read a line of text from file
           String[] tempArr;
           tempArr = temp.split (",");
           if (userid.equals(tempArr[0])) { 
               usernametxt.setText(tempArr[1]);

               usernametxt.setEditable(false);
           }
       }
       }catch(FileNotFoundException ex) {
               ex.toString();
               }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordlbl = new javax.swing.JLabel();
        newpasslbl = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        newpasstxt = new javax.swing.JPasswordField();
        confirmpasstxt = new javax.swing.JPasswordField();
        confirmpasslbl = new javax.swing.JLabel();
        showpasschk = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        usernametxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 71, 52));

        passwordlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(240, 240, 240));
        passwordlbl.setText("Old Password:");

        newpasslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        newpasslbl.setForeground(new java.awt.Color(240, 240, 240));
        newpasslbl.setText("New Password: ");

        passwordtxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        newpasstxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        confirmpasstxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        confirmpasslbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        confirmpasslbl.setForeground(new java.awt.Color(240, 240, 240));
        confirmpasslbl.setText("Confirm Password: ");

        showpasschk.setBackground(new java.awt.Color(129, 182, 157));
        showpasschk.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        showpasschk.setForeground(new java.awt.Color(240, 240, 240));
        showpasschk.setText("show");
        showpasschk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasschkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Change Password");

        usernamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(240, 240, 240));
        usernamelbl.setText("Username: ");

        savebtn.setBackground(new java.awt.Color(214, 245, 238));
        savebtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        usernametxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        backbtn.setBackground(new java.awt.Color(214, 245, 238));
        backbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernamelbl)
                            .addComponent(passwordlbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametxt)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newpasslbl)
                            .addComponent(confirmpasslbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(showpasschk, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn)
                    .addComponent(savebtn))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelbl)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpasslbl)
                    .addComponent(newpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmpasslbl)
                    .addComponent(confirmpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showpasschk))
                .addGap(39, 39, 39)
                .addComponent(savebtn)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showpasschkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasschkActionPerformed
       if(showpasschk.isSelected()){
            //unmask the password
            passwordtxt.setEchoChar((char)0); 
            newpasstxt.setEchoChar((char)0);
             confirmpasstxt.setEchoChar((char)0);
        }
        else{
           //mask the password
            passwordtxt.setEchoChar('*');
            newpasstxt.setEchoChar('*');
            confirmpasstxt.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasschkActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Users u = new Users();
        u.Back(userid,usertype);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        try{
            File file = new File("UserDetails.txt");
            Scanner sc = new Scanner(file); 
            //read data from the file

            String temp;
            boolean found = false;

            while(sc.hasNext() && !found /*the system will stop running while it found the correct username and password*/){
                temp = sc.nextLine(); //read a line of text from file
                String[] tempArr;
                tempArr = temp.split (",");
                if (userid.equals(tempArr[0])) {
                    String UserID = userid;
                    String Tempuser = usernametxt.getText();
                    String Tempselectedradio = tempArr[2];
                    String Tempfirst =tempArr[3];
                    String Templast = tempArr[4];
                    String Tempemail =tempArr[5];       
                    String Tempphone =tempArr[6];
                    String Tempoldpass=new String (passwordtxt.getPassword());
                    String Temppass= new String(newpasstxt.getPassword());
                    String Tempconfirmpass = new String(confirmpasstxt.getPassword()); //Confirm Password
                    String TempStatus = "Active";

                    Users u = new Users(UserID,Tempuser,Tempselectedradio, Tempfirst,Templast,Tempemail,Tempphone, Temppass,TempStatus);
                    if(u.checkEmpty()){
                            JOptionPane.showMessageDialog(rootPane, "Please fill up the empty fields! ", "Empty ", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        if(Tempoldpass.equals(tempArr[7])){
                            if(Tempconfirmpass.equals(Temppass) && !Tempconfirmpass.equals("") && !Temppass.equals("")){
                                //show the Message
                                JOptionPane.showMessageDialog(rootPane, "You have changed your password. Please login again! ", "Change Password ", JOptionPane.INFORMATION_MESSAGE);
                                //update user
                                u.UpdateProfile();
                                new Login().setVisible(true);
                                this.dispose();
                                //Password Validation
                            }else {
                                JOptionPane.showMessageDialog(rootPane, "Please confirm your both password field is correct!", "Password", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else {
                            JOptionPane.showMessageDialog(rootPane, "You enter the incorrect current password. Please try again!", " Current Password", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        } catch(FileNotFoundException ex) {
                   ex.toString();
        }
    }//GEN-LAST:event_savebtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfilePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfilePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfilePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfilePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new UserProfilePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel confirmpasslbl;
    private javax.swing.JPasswordField confirmpasstxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newpasslbl;
    private javax.swing.JPasswordField newpasstxt;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JCheckBox showpasschk;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}

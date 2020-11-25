/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author daniellim0510
 */
public class UserProfile extends javax.swing.JFrame {
    /**
     * Creates new form UserProfile
     */
    String view_user = "";
    
    public UserProfile(String user_id) {
       initComponents();
        view_user= user_id;
         setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Fast & Furious Express");
        typelbl.setVisible(false);
        typetxt.setVisible(false);
        passwordlbl.setVisible(false);
        passwordtxt.setVisible(false);
        
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
           if (view_user.equals(tempArr[0])) { 
               usernametxt.setText(tempArr[1]);
               typetxt.setText(tempArr[2]);
               firstnametxt.setText(tempArr[3]);
               lastnametxt.setText(tempArr[4]);
               emailtxt.setText(tempArr[5]);
               phonetxt.setText(tempArr[6]);
               passwordtxt.setText(tempArr[7]);
               
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

        backbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        typelbl = new javax.swing.JLabel();
        lastnametxt = new javax.swing.JTextField();
        typetxt = new javax.swing.JTextField();
        emaillbl = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        phonelbl = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        usernamelbl = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        changepasslbl = new javax.swing.JLabel();
        firstnamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        firstnametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        lastnamelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(432, 375));

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(21, 71, 52));

        typelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        typelbl.setForeground(new java.awt.Color(240, 240, 240));
        typelbl.setText("Type:");

        lastnametxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        typetxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        emaillbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        emaillbl.setForeground(new java.awt.Color(240, 240, 240));
        emaillbl.setText("Email: ");

        emailtxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        phonelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        phonelbl.setForeground(new java.awt.Color(240, 240, 240));
        phonelbl.setText("Phone No:");

        phonetxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        phonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonetxtKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("My Profile");

        savebtn.setBackground(new java.awt.Color(214, 245, 238));
        savebtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        usernamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(240, 240, 240));
        usernamelbl.setText("Username: ");

        usernametxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        changepasslbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changepasslbl.setForeground(new java.awt.Color(240, 240, 240));
        changepasslbl.setText("Change Password? Click Here");
        changepasslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepasslblMouseClicked(evt);
            }
        });

        firstnamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        firstnamelbl.setForeground(new java.awt.Color(240, 240, 240));
        firstnamelbl.setText("First Name: ");

        passwordlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(240, 240, 240));
        passwordlbl.setText("Password:");

        firstnametxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        passwordtxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lastnamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lastnamelbl.setForeground(new java.awt.Color(240, 240, 240));
        lastnamelbl.setText("Last Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(savebtn)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(typelbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(passwordlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(usernamelbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lastnamelbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(emaillbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(phonelbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(firstnamelbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(changepasslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typelbl)
                    .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelbl)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelbl)
                    .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnamelbl)
                    .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillbl)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonelbl)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savebtn)
                    .addComponent(changepasslbl))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(33, 33, 33))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changepasslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepasslblMouseClicked
        String usertype=typetxt.getText();
        this.dispose();
         new UserProfilePassword(view_user,usertype).setVisible(true);
    }//GEN-LAST:event_changepasslblMouseClicked

    private void phonetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonetxtKeyTyped
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_phonetxtKeyTyped

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

        String TempID = view_user;
        String Tempuser = usernametxt.getText();
        String Tempselectedradio = typetxt.getText();
        String Tempfirst = firstnametxt.getText();
        String Templast = lastnametxt.getText();
        String Tempemail = emailtxt.getText();       
        String Tempphone = phonetxt.getText();
        String Temppass= new String(passwordtxt.getPassword());
        String TempStatus = "Active";
    
      Users u = new Users(TempID,Tempuser,Tempselectedradio, Tempfirst,Templast,Tempemail,Tempphone, Temppass, TempStatus);
      
       
        if(u.checkEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please fill up the empty fields! ", "Empty ", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            if(Tempemail.matches(regex)){
                JOptionPane.showMessageDialog(rootPane, "Your changes are made! ", "Update ", JOptionPane.INFORMATION_MESSAGE);
                u.RemoveUser();
                u.UpdateUser();
      }
          else
              { JOptionPane.showMessageDialog(rootPane, "Please use the correct email format!", "Remind", JOptionPane.INFORMATION_MESSAGE);
              }
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        String usertype = typetxt.getText();
        Users u = new Users();
        u.Back(view_user,usertype);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel changepasslbl;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel firstnamelbl;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelbl;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel phonelbl;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel typelbl;
    private javax.swing.JTextField typetxt;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}

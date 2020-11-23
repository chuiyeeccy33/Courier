/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author daniellim0510
 */
public class ManagingStaffUserManagement extends javax.swing.JFrame {

    /**
     * Creates new form ManagingStaffUserManagement
     */
    String UserID = "";
    public ManagingStaffUserManagement(String user_id) {
        initComponents();
        UserID = user_id;
        fillcomboRole();
       data();
    }

   private void fillcomboRole() {      
      rolecbox.addItem("Managing Staff");
      rolecbox.addItem("Customer");
      rolecbox.addItem("Delivery Staff");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userstbl = new javax.swing.JTable();
        viewbtn = new javax.swing.JButton();
        activatebtn = new javax.swing.JButton();
        rolecbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Fira Sans Semi-Light", 1, 35)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Account");

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        userstbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        userstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(userstbl);

        viewbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        activatebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        activatebtn.setText("Activate");
        activatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activatebtnActionPerformed(evt);
            }
        });

        rolecbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rolecbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolecboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(backbtn)
                        .addGap(23, 23, 23))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activatebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rolecbox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewbtn)
                    .addComponent(activatebtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        new ManagingStaffDasboard(UserID).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed

        DefaultTableModel model = (DefaultTableModel) userstbl.getModel();
        int[] indexs = userstbl.getSelectedRows();
        Object[] row = new Object[2];
        for(int i =0; i < indexs.length; i++) {
            String RowuserID;
            RowuserID = (String) model.getValueAt(indexs[i], 0);
            System.out.println(RowuserID);
            new ManagingStaffUserInformation(UserID,RowuserID).setVisible(true);
        }
        //Show the form
        this.dispose();
    }//GEN-LAST:event_viewbtnActionPerformed

    private void activatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activatebtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) userstbl.getModel();
        
        int[] indexs = userstbl.getSelectedRows();
        Object[] row = new Object[7];
        ManagingStaff u = new ManagingStaff();
        for(int i =0; i < indexs.length; i++) {
            String Username;
            Username = (String) model.getValueAt(indexs[i], 0);
            u.setUsername(Username);
            u.ActivateUser();
            JOptionPane.showMessageDialog(rootPane, "The Account is Activated. User can access the Fast and Furious Account ", "Account Activated ", JOptionPane.INFORMATION_MESSAGE);
        }
        data();
    }//GEN-LAST:event_activatebtnActionPerformed

    private void rolecboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolecboxActionPerformed
        String role = rolecbox.getSelectedItem().toString();
        //variable for output
        String Userid;
        String Username;
        String Role;
        String FirstName;
        String LastName;
        String Email;
        String Phone;
        String Status;
        //reader
        BufferedReader br;
        try {
            FileReader rf = new FileReader("UserDetails.txt");
            br = new BufferedReader (rf);
            String[] columnName = {"User ID", "Username", "Role","First Name", "Last Name", "Email", "Phone","Status"};
            DefaultTableModel model = (DefaultTableModel) userstbl.getModel();
            model.setColumnIdentifiers(columnName);
            model.setRowCount(0);
            userstbl.revalidate();
            Object[] details = br.lines().toArray();
            for (Object detail : details) {
                String line = detail.toString().trim();
                String[] row = line.split(",");
                //if role selected equal to row[2] in database
                if (role.equals(row[2])) {
                    //create the object to added into the table
                    Userid = row[0];
                    Username = row[1];
                    Role = row[2];
                    FirstName = row[3];
                    LastName = row[4];
                    Email = row[5];
                    Phone = row[6];
                    Status = row[8];
                    model.addRow(new Object[] {Userid,Username,Role,FirstName,LastName,Email,Phone,Status});
                }
            }
        }catch(FileNotFoundException ex) {
                       ex.toString();
        }
               
    }//GEN-LAST:event_rolecboxActionPerformed

     public void data() {
        //variable for output
        String Userid;
        String Username;
        String Role;
        String FirstName;
        String LastName;
        String Email;
        String Phone;
        String Status;
        //reader
        String filepath = "UserDetails.txt";
        File file = new File(filepath);
        BufferedReader br;
        
        try {
            FileReader rf = new FileReader(file);
            br = new BufferedReader (rf);
            String[] columnName = {"User ID", "Username", "Role","First Name", "Last Name", "Email", "Phone","Status"};
            DefaultTableModel model = (DefaultTableModel) userstbl.getModel();
            model.setColumnIdentifiers(columnName);
            model.setRowCount(0);
            userstbl.revalidate();
            Object[] details = br.lines().toArray();
            for (Object detail : details) {
                String line = detail.toString().trim();
                String[] row = line.split(",");
                    //create the object to added into the table
                    Userid = row[0];
                    Username = row[1];
                    Role = row[2];
                    FirstName = row[3];
                    LastName = row[4];
                    Email = row[5];
                    Phone = row[6];
                    Status = row[8];
                    model.addRow(new Object[] {Userid,Username,Role,FirstName,LastName,Email,Phone,Status});
                }
            br.close();        
            rf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(ManagingStaffUserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagingStaffUserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagingStaffUserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagingStaffUserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ManagingStaffUserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activatebtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> rolecbox;
    private javax.swing.JTable userstbl;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}

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
        setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Fast & Furious Express");
        fillcomboRole();
       
         String[] columnName = {"User ID", "Username", "Role","First Name", "Last Name", "Email", "Phone","Status"};
        DefaultTableModel model = (DefaultTableModel)userstbl.getModel();
        model.setColumnIdentifiers(columnName);
        model.setRowCount(0); //clear the model
        userstbl.revalidate(); //refresh the table
        
        ManagingStaff mg = new ManagingStaff();
        //mg.setUserid(UserID);
        Object[] outputs = mg.LoadUser().lines().toArray();
        for (Object output : outputs) {
            String line = output.toString().trim();
            String[] row = line.split(",");
            model.addRow(row);
        }
    }

   private void fillcomboRole() { 
       rolecbox.addItem("All Users");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rolecbox = new javax.swing.JComboBox<>();
        activatebtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userstbl = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 71, 52));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Account");

        rolecbox.setBackground(new java.awt.Color(214, 245, 238));
        rolecbox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rolecbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolecboxActionPerformed(evt);
            }
        });

        activatebtn.setBackground(new java.awt.Color(129, 182, 157));
        activatebtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        activatebtn.setText("Activate");
        activatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activatebtnActionPerformed(evt);
            }
        });

        viewbtn.setBackground(new java.awt.Color(129, 182, 157));
        viewbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        userstbl.setAutoCreateRowSorter(true);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewbtn)
                        .addGap(18, 18, 18)
                        .addComponent(activatebtn)
                        .addGap(27, 27, 27)
                        .addComponent(rolecbox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backbtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activatebtn)
                    .addComponent(viewbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        String[] columnName = {"User ID", "Username", "Role","First Name", "Last Name", "Email", "Phone","Status"};
        DefaultTableModel model1 = (DefaultTableModel)userstbl.getModel();
        model1.setColumnIdentifiers(columnName);
        model1.setRowCount(0); //clear the model
        userstbl.revalidate(); //refresh the table
        
        Object[] outputs = u.LoadUser().lines().toArray();
        for (Object output : outputs) {
            String line = output.toString().trim();
            String[] row1 = line.split(",");
            model.addRow(row1);
        }
    }//GEN-LAST:event_activatebtnActionPerformed

    private void rolecboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolecboxActionPerformed
        String role = rolecbox.getSelectedItem().toString();
       
        String[] columnName = {"User ID", "Username", "Role","First Name", "Last Name", "Email", "Phone","Status"};
        DefaultTableModel model = (DefaultTableModel)userstbl.getModel();
        model.setColumnIdentifiers(columnName);
        model.setRowCount(0); //clear the model
        userstbl.revalidate(); //refresh the table
        
         ManagingStaff   mg = new ManagingStaff();
        mg.setFilterRole(role);
        Object[] outputs = mg.FilterUser().lines().toArray();
        for (Object output : outputs) {
            String line = output.toString().trim();
            String[] row = line.split(",");
            model.addRow(row);
        }
       
               
    }//GEN-LAST:event_rolecboxActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> rolecbox;
    private javax.swing.JTable userstbl;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}

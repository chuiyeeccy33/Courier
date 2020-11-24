/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier;

public class ManagingStaffReportManagement extends javax.swing.JFrame {

    String UserID = "";
    public ManagingStaffReportManagement(String user_id) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        monthlybtn = new javax.swing.JButton();
        dailybtn = new javax.swing.JButton();
        userlistbtn = new javax.swing.JButton();
        yearlybtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Fira Sans Semi-Light", 1, 35)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Report Management");

        logoutbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        monthlybtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        monthlybtn.setText("Monthly Order Report");
        monthlybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlybtnActionPerformed(evt);
            }
        });

        dailybtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dailybtn.setText("Daily Order Report");
        dailybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailybtnActionPerformed(evt);
            }
        });

        userlistbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userlistbtn.setText("User List");
        userlistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userlistbtnActionPerformed(evt);
            }
        });

        yearlybtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        yearlybtn.setText("Yearly Order Report");
        yearlybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlybtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backbtn.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dailybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthlybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearlybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(logoutbtn))
                    .addComponent(backbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monthlybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dailybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearlybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userlistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dailybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailybtnActionPerformed
        String click = "DailyOrder";
        Report r = new Report();
        r.setbuttonClick(click);
        new ManagingStaffReportInformation(UserID,click).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dailybtnActionPerformed

    private void monthlybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlybtnActionPerformed
        String click = "MonthlyOrder";
        Report r = new Report();
        r.setbuttonClick(click);
        new ManagingStaffReportInformation(UserID,click).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_monthlybtnActionPerformed

    private void yearlybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlybtnActionPerformed
        String click = "YearlyOrder";
        Report r = new Report();
        r.setbuttonClick(click);
        new ManagingStaffReportInformation(UserID,click).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_yearlybtnActionPerformed

    private void userlistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userlistbtnActionPerformed
        String click = "UserList";
        Report r = new Report();
        r.setbuttonClick(click);
        new ManagingStaffReportInformation(UserID,click).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userlistbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
       new Login ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagingStaffReportManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagingStaffReportManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagingStaffReportManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagingStaffReportManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new ManagingStaffReportManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton dailybtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton monthlybtn;
    private javax.swing.JButton userlistbtn;
    private javax.swing.JButton yearlybtn;
    // End of variables declaration//GEN-END:variables
}


package courier;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.ButtonGroup;

public class FeedbackForm extends javax.swing.JFrame {
    String userid = "";
    
    //Feedback rating group button
    private void groupButton() {
        ButtonGroup bg1 = new ButtonGroup();
        
        bg1.add(excellentbtn);
        bg1.add(goodbtn);
        bg1.add(normalbtn);
        bg1.add(badbtn);
        bg1.add(worstbtn);
    }
    
    //Creates new form FeedbackForm
    public FeedbackForm(String UserID) {
        initComponents();
        userid = UserID;
        setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Fast & Furious Express");
        groupButton();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        normalbtn = new javax.swing.JRadioButton();
        goodbtn = new javax.swing.JRadioButton();
        excellentbtn = new javax.swing.JRadioButton();
        badbtn = new javax.swing.JRadioButton();
        worstbtn = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        submitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 71, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Feedback");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Feel free to give us Feeback ^_^");

        backbtn.setBackground(new java.awt.Color(214, 245, 238));
        backbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Rating: ");

        normalbtn.setBackground(new java.awt.Color(129, 182, 157));
        normalbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        normalbtn.setForeground(new java.awt.Color(240, 240, 240));
        normalbtn.setText("Normal");

        goodbtn.setBackground(new java.awt.Color(129, 182, 157));
        goodbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        goodbtn.setForeground(new java.awt.Color(240, 240, 240));
        goodbtn.setText("Good");

        excellentbtn.setBackground(new java.awt.Color(129, 182, 157));
        excellentbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        excellentbtn.setForeground(new java.awt.Color(240, 240, 240));
        excellentbtn.setText("Excellent");

        badbtn.setBackground(new java.awt.Color(129, 182, 157));
        badbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        badbtn.setForeground(new java.awt.Color(240, 240, 240));
        badbtn.setText("Bad");

        worstbtn.setBackground(new java.awt.Color(129, 182, 157));
        worstbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        worstbtn.setForeground(new java.awt.Color(240, 240, 240));
        worstbtn.setText("Worst");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        submitbtn.setBackground(new java.awt.Color(214, 245, 238));
        submitbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(excellentbtn)
                                .addGap(18, 18, 18)
                                .addComponent(goodbtn)
                                .addGap(18, 18, 18)
                                .addComponent(normalbtn)
                                .addGap(18, 18, 18)
                                .addComponent(badbtn)
                                .addGap(18, 18, 18)
                                .addComponent(worstbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(submitbtn)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excellentbtn)
                    .addComponent(goodbtn)
                    .addComponent(normalbtn)
                    .addComponent(badbtn)
                    .addComponent(worstbtn)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitbtn)
                        .addGap(30, 30, 30))))
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

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        new CustomerDashboard(userid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        //rating from the radio button
        String ratingButton = "";
        
        if (excellentbtn.isSelected()) {
            ratingButton = "Excellent";
            System.out.println("Excellent is Selected");
        } else if (goodbtn.isSelected()) {
            ratingButton = "Good";
            System.out.println("Good is Selected");
        } else if (normalbtn.isSelected()) {
            ratingButton = "Normal";
            System.out.println("Normal is Selected");
        } else if (badbtn.isSelected()) {
            ratingButton = "Bad";
            System.out.println("Bad is Selected");
        } else if (worstbtn.isSelected()) {
            ratingButton = "Worst";
            System.out.println("Worst is selected");
        } else {
            ratingButton = "";
            System.out.println("Rating is not selected");
        }
        
        //varable
        UUID FeedbackNo = UUID.randomUUID();
        String FeedbackID = FeedbackNo.toString();
        String CustomerRating = ratingButton;
        String CustomerDescription = jTextArea1.getText();
        Users CustomerID = new Users();
                
        Feedback f = new Feedback(FeedbackID,CustomerRating,CustomerDescription,CustomerID);
        
        CustomerID.setUserid(userid);
        
        //Store data
        //check empty Feedback
        if(f.EmptyFeedback()) { //check empty Feedback
            JOptionPane.showMessageDialog(rootPane, "Please fill up the feedback form before submit", "Empty Feedback", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (f.UserNotFound()) {
            JOptionPane.showMessageDialog(rootPane, "There is an Error Submitting Form", "Error 404", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Thanks for submit a feedback. We will improve our system based on the feedback you gave", "Feedback Submited", JOptionPane.INFORMATION_MESSAGE);
            f.SaveFeedback();
            this.setVisible(false);
            new CustomerDashboard(userid).setVisible(true);
        }
    }//GEN-LAST:event_submitbtnActionPerformed


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
            java.util.logging.Logger.getLogger(FeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FeedbackForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JRadioButton badbtn;
    private javax.swing.JRadioButton excellentbtn;
    private javax.swing.JRadioButton goodbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton normalbtn;
    private javax.swing.JButton submitbtn;
    private javax.swing.JRadioButton worstbtn;
    // End of variables declaration//GEN-END:variables
}


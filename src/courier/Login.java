
package courier;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Loginbtn = new javax.swing.JButton();
        passwordlbl = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(21, 71, 52));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 245, 238));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setText("Courier System");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel4.setText("Fast & Furious Express");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel4)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 140);

        jPanel2.setBackground(new java.awt.Color(21, 71, 52));

        Loginbtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });

        passwordlbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(240, 240, 240));
        passwordlbl.setText("Password");

        usernamelbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(240, 240, 240));
        usernamelbl.setText("Username");

        txtusername.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtpassword.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Don't Have an Account? Sign up Here");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Login Here");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernamelbl)
                                    .addComponent(passwordlbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Loginbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3)))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(239, 239, 239))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelbl)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Loginbtn)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 135, 650, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        // TODO add your handling code here:
        //declaration
        String userid;
        String user = txtusername.getText();
        String password = new String(txtpassword.getPassword());
        String status = "Active";
        
        //declaration for user type
        String customer_role = "Customer";
        String delivery_staff_role = "Delivery Staff";
        String managing_staff_role = "Managing Staff";
        
        //try method
        try{
            File file = new File("UserDetails.txt");
            Scanner sc = new Scanner(file);
            
            String temp;
            boolean found = false;
            
            //while loop the login file
            while(sc.hasNext() &&  !found) { //the system will stop running until it found the correct username and password
                temp = sc.nextLine(); //read line of text from login.txt
                String[] tempArr;
                tempArr = temp.split (",");
                //if username and password exist in the login page then able to proceed
                //else show the error message username is not exist
                if (user.equals(tempArr[1]) && password.equals(tempArr[7])) {
                    userid = tempArr[0];
                    user = tempArr[1];
                    found = true;
                    //to validate the user is active or not
                    if (status.equals(tempArr[8])) {
                        JOptionPane.showMessageDialog(rootPane, "You are logged in", "Login Sucessfully", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        //if the user is customer then bring user to customer dashboard
                        if(customer_role.equals(tempArr[2])) {
                            new CustomerDashboard(userid).setVisible(true);
                        } // the user is delivery staff then bring user to delivery staff
                        else if (delivery_staff_role.equals(tempArr[2])) {
                            new DeliveryStaffDashboardPage(userid).setVisible(true);
                        } //the user is managing staff then bring user to managing staff dashboard
                        else {
                            new ManagingStaffDasboard(userid).setVisible(true);
                        }
                    } else if(tempArr[8].equals("Pending")) {
                        JOptionPane.showMessageDialog(rootPane, "Your account is still pending for approval", "Pending Approval", JOptionPane.INFORMATION_MESSAGE);
                    } else if(tempArr[8].equals("Reject")) {
                         JOptionPane.showMessageDialog(rootPane, "Your account request has been rejected", "Rejected Request", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                         JOptionPane.showMessageDialog(rootPane, "Your account has been terminated due to some reasons", "Deactivated Account", JOptionPane.INFORMATION_MESSAGE);
                    }
              }
           }
            //display error if not matching username or password
            if(!found){
                JOptionPane.showMessageDialog(rootPane, "Not matching username and password.Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }        
        } catch(FileNotFoundException ex) {
            ex.toString();
        }  
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new SignUpPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
}

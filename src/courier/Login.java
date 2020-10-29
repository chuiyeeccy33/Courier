
package courier;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        Loginbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setText("Fast & Furious Express");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel2.setText("Login Here");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 128));
        jLabel3.setText("Don't Have an Account? Sign up Here");

        usernamelbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernamelbl.setText("Username");

        passwordlbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordlbl.setText("Password");

        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 142, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpassword)
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(usernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordlbl)
                .addGap(3, 3, 3)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(Loginbtn)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
    
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        // TODO add your handling code here:
        //declaration
        String user = txtusername.getText();
        String password = new String(txtpassword.getPassword());
        
        //declaration for user type
        String customer_role = "Customer";
        String delivery_staff_role = "Delivery Staff";
        String managing_staff_role = "Managing Staff";
        
        //try method
        try{
            File file = new File("login.txt");
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
                if (user.equals(tempArr[0]) && password.equals(tempArr[1])) {
                    JOptionPane.showMessageDialog(rootPane, "You are logged in", "Login Sucessfully", JOptionPane.INFORMATION_MESSAGE);
                    
                    System.out.println(user);
                    System.out.println(password);
                    user = tempArr[0];
                    found = true;
                    this.setVisible(false);
                    
                    //if the user is customer then bring user to customer dashboard
                    if(customer_role.equals(tempArr[2])) {
                        new CustomerDashboard().setVisible(true);
                    } // the user is delivery staff then bring user to delivery staff
                    else if (delivery_staff_role.equals(tempArr[2])) {
                        new DeliveryStaffDashboardPage().setVisible(true);
                    } //the user is managing staff then bring user to managing staff dashboard
                    else {
                        new ManagingStaffDasboard().setVisible(true);
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
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.gui;

import emart.dao.UserDAO;
import emart.pojo.UserPojo;
import emart.pojo.UserProfile;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhuwan Pandey
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    String userId,password;
    public LoginFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbUserTypeGrp = new javax.swing.ButtonGroup();
        myPannel = new javax.swing.JPanel();
        loginPannel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        userTypePannel = new javax.swing.JPanel();
        rbManager = new javax.swing.JRadioButton();
        rbReceptionist = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMART Online");

        myPannel.setBackground(new java.awt.Color(51, 51, 0));

        loginPannel.setBackground(new java.awt.Color(102, 102, 0));
        loginPannel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(102, 102, 0)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 51))), "Login Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic Medium", 1, 18), new java.awt.Color(204, 255, 204))); // NOI18N
        loginPannel.setToolTipText("Fiill User Login Details");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("User ID");
        jLabel2.setToolTipText("Enter UserName");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Password");
        jLabel3.setToolTipText("Enter Password");

        txtUserId.setForeground(new java.awt.Color(0, 51, 255));
        txtUserId.setToolTipText("Enter UserName");

        btnLogin.setBackground(new java.awt.Color(51, 51, 0));
        btnLogin.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 204));
        btnLogin.setText("Login");
        btnLogin.setToolTipText("Click here to Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 51, 0));
        btnExit.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 204));
        btnExit.setText("Quit");
        btnExit.setToolTipText("Click here to close application");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtPassword.setForeground(new java.awt.Color(0, 0, 255));
        txtPassword.setToolTipText("Enter Password");

        javax.swing.GroupLayout loginPannelLayout = new javax.swing.GroupLayout(loginPannel);
        loginPannel.setLayout(loginPannelLayout);
        loginPannelLayout.setHorizontalGroup(
            loginPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPannelLayout.createSequentialGroup()
                .addGroup(loginPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPannelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserId)
                    .addComponent(txtPassword))
                .addContainerGap())
            .addGroup(loginPannelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        loginPannelLayout.setVerticalGroup(
            loginPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPannelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(loginPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(loginPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        userTypePannel.setBackground(new java.awt.Color(102, 102, 0));
        userTypePannel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 102), new java.awt.Color(0, 102, 102)), "User Type", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic Medium", 1, 36), new java.awt.Color(255, 204, 204))); // NOI18N
        userTypePannel.setToolTipText("Select User Type");

        rbManager.setBackground(new java.awt.Color(102, 102, 0));
        rbUserTypeGrp.add(rbManager);
        rbManager.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        rbManager.setForeground(new java.awt.Color(255, 204, 204));
        rbManager.setText("Manager");
        rbManager.setToolTipText("Select Manager as UserType");

        rbReceptionist.setBackground(new java.awt.Color(102, 102, 0));
        rbUserTypeGrp.add(rbReceptionist);
        rbReceptionist.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        rbReceptionist.setForeground(new java.awt.Color(255, 204, 204));
        rbReceptionist.setText("Receptionist");
        rbReceptionist.setToolTipText("Select Receptionist as UserType");

        javax.swing.GroupLayout userTypePannelLayout = new javax.swing.GroupLayout(userTypePannel);
        userTypePannel.setLayout(userTypePannelLayout);
        userTypePannelLayout.setHorizontalGroup(
            userTypePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTypePannelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(rbManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(rbReceptionist)
                .addGap(181, 181, 181))
        );
        userTypePannelLayout.setVerticalGroup(
            userTypePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTypePannelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(userTypePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbManager)
                    .addComponent(rbReceptionist))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Login Frame");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emart/images/loginImage.jpg"))); // NOI18N

        javax.swing.GroupLayout myPannelLayout = new javax.swing.GroupLayout(myPannel);
        myPannel.setLayout(myPannelLayout);
        myPannelLayout.setHorizontalGroup(
            myPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPannelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(myPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(myPannelLayout.createSequentialGroup()
                        .addComponent(loginPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(userTypePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );
        myPannelLayout.setVerticalGroup(
            myPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPannelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(myPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(userTypePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(!validateUser()){
            JOptionPane.showMessageDialog(null, "Please Fill the userName/Password.","Incomplete",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String userType = gUserType();
        if(userType== null){
            JOptionPane.showMessageDialog(null, "Please select UserType.","Incomplete",JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserPojo user = new UserPojo();
        user.setUserId(userId);
        user.setPassword(password);
        user.setUserType(userType);
        try{
           boolean result = UserDAO.validateUser(user);
           if(result == false){
                 JOptionPane.showMessageDialog(null, "Please enter correct id/password/usertype","Error",JOptionPane.ERROR_MESSAGE);
                 return;
           }
           UserProfile.setUserId(userId);
           UserProfile.setUserType(userType);
           if(userType.equalsIgnoreCase("Manager")){
               ManagerOptionsFrame managerOptionsFrame = new ManagerOptionsFrame();
               managerOptionsFrame.setVisible(true);
               this.dispose();
           }else{
               ReceptionistOptionsFrame repectionistOptionsFrame = new ReceptionistOptionsFrame();
               repectionistOptionsFrame.setVisible(true);
               this.dispose();
           }
        }catch(SQLException se){
             JOptionPane.showMessageDialog(null, "Unable to connect with database","error",JOptionPane.ERROR_MESSAGE);
             se.printStackTrace();
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JPanel loginPannel;
    private javax.swing.JPanel myPannel;
    private javax.swing.JRadioButton rbManager;
    private javax.swing.JRadioButton rbReceptionist;
    private javax.swing.ButtonGroup rbUserTypeGrp;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JPanel userTypePannel;
    // End of variables declaration//GEN-END:variables

    private boolean validateUser() {
        userId = txtUserId.getText().trim();
        char[] pass = txtPassword.getPassword();
        password = String.valueOf(pass).trim();
        if(userId.isEmpty() || password.isEmpty()){
            return false;
        }  
        return true;
    }

    private String gUserType() {
        if(rbManager.isSelected()){
            return rbManager.getText();
        }else if(rbReceptionist.isSelected()){
            return rbReceptionist.getText();
        }
        else
            return null;
        
    }
}

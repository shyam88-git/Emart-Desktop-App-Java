/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.gui;

import emart.dao.ReceptionistDAO;
import emart.pojo.UserPojo;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhuwan Pandey
 */
public class AddReceptionistFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddReceptionistFrame
     
    */
    Map<String,String> receptionist;
    public AddReceptionistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadEmpId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        AddEmployeePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblEmpId = new javax.swing.JLabel();
        lblEmpName = new javax.swing.JLabel();
        lblUserType = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        cbEmpId = new javax.swing.JComboBox<>();
        txtEmpName = new javax.swing.JTextField();
        lblRePassword = new javax.swing.JLabel();
        pwPassword = new javax.swing.JPasswordField();
        pwRePassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)), "Manage Receptionist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic Medium", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 0, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 153));
        jButton6.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Employee Details (Receptionist)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        lblEmpId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblEmpId.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpId.setText("Employee ID");

        lblEmpName.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblEmpName.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpName.setText("Employee Name");

        lblUserType.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblUserType.setForeground(new java.awt.Color(255, 255, 255));
        lblUserType.setText("User Id");

        lblPassword.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        txtUserId.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        cbEmpId.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        cbEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpIdActionPerformed(evt);
            }
        });

        txtEmpName.setEditable(false);
        txtEmpName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N

        lblRePassword.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblRePassword.setForeground(new java.awt.Color(255, 255, 255));
        lblRePassword.setText("Re-Password");

        pwPassword.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        pwPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwPasswordActionPerformed(evt);
            }
        });

        pwRePassword.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserId)
                    .addComponent(pwPassword)
                    .addComponent(pwRePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwPassword)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwRePassword))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emart/images/loginImage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnAdd.setBackground(new java.awt.Color(102, 0, 102));
        btnAdd.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddEmployeePanelLayout = new javax.swing.GroupLayout(AddEmployeePanel);
        AddEmployeePanel.setLayout(AddEmployeePanelLayout);
        AddEmployeePanelLayout.setHorizontalGroup(
            AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEmployeePanelLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEmployeePanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        AddEmployeePanelLayout.setVerticalGroup(
            AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEmployeePanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddEmployeePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AddEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginFrame lFrame = new LoginFrame();
        lFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ManageReceptionistsFrame manageReceptionistsFrame = new ManageReceptionistsFrame();
        manageReceptionistsFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void pwPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwPasswordActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       int result = validateInput();
       if(result == 1){
           JOptionPane.showMessageDialog(null, "Please enter atleast 4 character");
           return;
       }
       
       if(result == -1){
            JOptionPane.showMessageDialog(null, "Please enter user ID");
            return;
       }
       char[] pwFirst = pwPassword.getPassword();
       char[] pwSecond = pwRePassword.getPassword();
       String pwFirstStr = String.valueOf(pwFirst);
       String pwSecondStr = String.valueOf(pwSecond);
       if(isPasswordSame(pwFirstStr,pwSecondStr) == false){
           JOptionPane.showMessageDialog(null, "Please enter same password");
           return;
       }
       try{
           String empId = cbEmpId.getSelectedItem().toString();
           String userId = txtUserId.getText().trim();
           String userName = txtEmpName.getText().trim();
           UserPojo user = new UserPojo();
           user.setUserId(userId);
           user.setEmpId(empId);
           user.setPassword(pwFirstStr);
           user.setUserType("Receptionist");
           user.setUserName(userName);
           boolean status = ReceptionistDAO.addReceptionist(user);
           if(!status){
                JOptionPane.showMessageDialog(null, "Receptionst not added.");
                return;
           }
           JOptionPane.showMessageDialog(null, "Receptionst added sucessfully.");
           clearData();
           loadEmpId();
           
           
       }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to Add Receptionst User.");
            se.printStackTrace();
        }
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpIdActionPerformed
        if(cbEmpId.getItemCount() == 0)
            return;
        txtEmpName.setText(receptionist.get(cbEmpId.getSelectedItem()));
    }//GEN-LAST:event_cbEmpIdActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddEmployeePanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbEmpId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblEmpName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JPasswordField pwPassword;
    private javax.swing.JPasswordField pwRePassword;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private void loadEmpId() {
        try{
            receptionist = ReceptionistDAO.getNonRegisteredReceptionist();
            if(receptionist.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Non-Registerd Receptionist Present ");
                btnAdd.setEnabled(false);
                return;
            }   
            btnAdd.setEnabled(true);
            Set <String> empId = receptionist.keySet();
            Iterator<String> it = empId.iterator();
            cbEmpId.removeAllItems();
            while(it.hasNext()){
                cbEmpId.addItem(it.next());
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to load employee id");
            se.printStackTrace();
        }
    }
    
    private int validateInput(){
        if(pwPassword.getPassword().length < 4 || pwRePassword.getPassword().length < 4){
            return 1;
        }
        
        else if(txtUserId.getText().isEmpty()){
           
            return -1;
        }
        return 0;
    }
    private boolean isPasswordSame(String first,String second){
        return first.equals(second);
        
    }

    private void clearData() {
        pwPassword.setText("");
        pwRePassword.setText("");
        txtUserId.setText("");
    }
}
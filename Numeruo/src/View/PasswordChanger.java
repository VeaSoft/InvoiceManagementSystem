/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.UserAcctController;
import Model.CurrentUser;
import View.Manager.ManagerOptionView;
import View.SalesView.SalesOptionView;
import View.WareHouse.WarehouseOptionView;

/**
 *
 * @author user
 */
public class PasswordChanger extends javax.swing.JPanel {

    /**
     * Creates new form PasswordChanger
     */
    LoginView parentFrame;
    public PasswordChanger(LoginView parentFramer) {
        initComponents();
        parentFrame= parentFramer;
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
        oldPasswdTxtBx = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        newPasswdTxtBx = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confirmPasswdTxtBx = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 93, 23));
        jLabel2.setText("Old Password:");

        oldPasswdTxtBx.setText("jPasswordField1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 93, 23));
        jLabel3.setText("New Password:");

        newPasswdTxtBx.setText("jPasswordField1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 93, 23));
        jLabel4.setText("Confirm New Password:");

        confirmPasswdTxtBx.setText("jPasswordField1");

        submitBtn.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 165, 250));
        submitBtn.setText("Submit Change");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(newPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(196, 196, 196))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(oldPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(confirmPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(submitBtn)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(oldPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Users Viewer");

        homeBtn.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(65, 104, 197));
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBtn)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        this.submitChanges();
    }//GEN-LAST:event_submitBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        this.returnBack();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswdTxtBx;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPasswdTxtBx;
    private javax.swing.JPasswordField oldPasswdTxtBx;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
    private boolean confirmOldPassword(){
        if(String.valueOf(this.oldPasswdTxtBx.getPassword()).trim().equals(CurrentUser.userPassword)==false){
            MyMessageBox.displayMessage("Incorrect old password");
            return false;
        }
        return true;
    }
    private boolean confirmNewPassword(){
        if(String.valueOf(this.newPasswdTxtBx.getPassword()).trim().equals(String.valueOf(this.confirmPasswdTxtBx.getPassword()).trim())){
            return true;
        }
        MyMessageBox.displayMessage("the new password and the confirm new password do not match");
        return false;
    }
    private boolean areAllFieldsFilled(){
        if(String.valueOf(this.oldPasswdTxtBx.getPassword()).trim().equals("")||String.valueOf(this.newPasswdTxtBx.getPassword()).trim().equals("")||String.valueOf(this.confirmPasswdTxtBx.getPassword()).trim().equals("")){
            MyMessageBox.displayMessage("All Fields cannot be left blank");
            return false;
        }
        return true;
    }
    private void submitChanges(){
        if (areAllFieldsFilled() && confirmOldPassword() && confirmNewPassword()) {
            if (UserAcctController.changePassword(String.valueOf(this.newPasswdTxtBx.getPassword()).trim())) {
                MyMessageBox.displayMessage("Password successfully changed");
                returnBack();
            } else {
                MyMessageBox.displayMessage("Operation Unsuccessful.  Please contact Admin");
            }
        }
    }
    private void returnBack(){
        switch(CurrentUser.userDepartment){
            case "Managerial Department":
                transitToManagerOptionView(new ManagerOptionView(parentFrame));
                break;
            case "WareHouse Department":
                transitToWareHouseOptionView(new WarehouseOptionView(parentFrame));
                break;
            default:
                transitToSalesOptionView(new SalesOptionView(parentFrame));
                break;

        }
    }
    private void transitToSalesOptionView(SalesOptionView sov){
       this.setVisible(false);
       parentFrame.remove(this);
       sov.setSize(978,570);
       parentFrame.add(sov);
       sov.setVisible(true);
       
   }
    private void transitToWareHouseOptionView(WarehouseOptionView whov){
       this.setVisible(false);
       parentFrame.remove(this);
       whov.setSize(978,570);
       parentFrame.add(whov);
       whov.setVisible(true);
       
   }
    private void transitToManagerOptionView(ManagerOptionView mov) {
        this.setVisible(false);
        parentFrame.remove(this);
        mov.setSize(978, 570);
        parentFrame.add(mov);
        mov.setVisible(true);

    }
}

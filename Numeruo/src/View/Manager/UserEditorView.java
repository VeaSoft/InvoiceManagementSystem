/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Manager;

import Controller.UserAcctController;
import Model.CurrentUser;
import Model.NumeruoUser;
import View.LoginView;
import View.MyMessageBox;

/**
 *
 * @author user
 */
public class UserEditorView extends javax.swing.JPanel {

    /**
     * Creates new form UserEditorView
     */
    LoginView parentFrame;
    NumeruoUser searchResult;
    public UserEditorView(LoginView parentFramer) {
        initComponents();
        parentFrame= parentFramer;
        this.disableAll();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submitEditBtn = new javax.swing.JButton();
        userNameTxtBx = new javax.swing.JFormattedTextField();
        fullNameTxtBx = new javax.swing.JFormattedTextField();
        deptComboBx = new javax.swing.JComboBox();
        userPasswdTxtBx = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        confirmPasswordTxtBx = new javax.swing.JPasswordField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 109, 38), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 93, 23));
        jLabel2.setText("User Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 93, 23));
        jLabel3.setText("User Full Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 93, 23));
        jLabel4.setText("User Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 93, 23));
        jLabel5.setText("User Department:\n");

        submitEditBtn.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        submitEditBtn.setForeground(new java.awt.Color(0, 165, 250));
        submitEditBtn.setText("Submit Edit");
        submitEditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitEditBtnMouseClicked(evt);
            }
        });

        userNameTxtBx.setForeground(new java.awt.Color(0, 51, 204));
        userNameTxtBx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        fullNameTxtBx.setEditable(false);
        fullNameTxtBx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        deptComboBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deptComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sales Department", "WareHouse Department", "Managerial Department" }));

        userPasswdTxtBx.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 93, 23));
        jLabel6.setText("Confirm User Password:");

        confirmPasswordTxtBx.setEditable(false);

        searchBtn.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(49, 93, 23));
        searchBtn.setText("Search");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fullNameTxtBx)
                        .addComponent(deptComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userPasswdTxtBx)
                        .addComponent(confirmPasswordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userNameTxtBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(submitEditBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullNameTxtBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmPasswordTxtBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deptComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Edit User");

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
                        .addGap(390, 390, 390)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitEditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitEditBtnMouseClicked
       this.submitEditedUser();
    }//GEN-LAST:event_submitEditBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        this.returnBack();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        this.search(this.userNameTxtBx.getText().trim());
    }//GEN-LAST:event_searchBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordTxtBx;
    private javax.swing.JComboBox deptComboBx;
    private javax.swing.JFormattedTextField fullNameTxtBx;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton submitEditBtn;
    private javax.swing.JFormattedTextField userNameTxtBx;
    private javax.swing.JPasswordField userPasswdTxtBx;
    // End of variables declaration//GEN-END:variables
     private void returnBack() {
        ManagerOptionView mov = new ManagerOptionView(parentFrame);
        mov.setGreeting(CurrentUser.userFullName.trim());
        this.transitToHomePage(mov);
    }

    public void transitToHomePage(ManagerOptionView mov) {
        this.setVisible(false);
        parentFrame.remove(this);
        mov.setSize(978, 570);
        parentFrame.add(mov);
        mov.setVisible(true);

    }
    private void search(String userName){
        searchResult= UserAcctController.getUser(userName);
        if(searchResult==null){
            MyMessageBox.displayMessage("UserName does not exist");
        }else{
            this.enableAll();
            this.display();
        }
    }
    private void display(){
        this.userNameTxtBx.setText(searchResult.getUserName());
        this.fullNameTxtBx.setText(searchResult.getUserFullName());
        this.userPasswdTxtBx.setText(searchResult.getUserPassword());
        this.confirmPasswordTxtBx.setText(searchResult.getUserPassword());
        this.deptComboBx.setSelectedItem(searchResult.getUserDepartment());
    }
    private void enableAll(){
        this.fullNameTxtBx.setEditable(true);
        this.userPasswdTxtBx.setEditable(true);
        this.confirmPasswordTxtBx.setEditable(true);
        this.submitEditBtn.setEnabled(true);
        
    }
    private void disableAll(){
        this.fullNameTxtBx.setEditable(false);
        this.userPasswdTxtBx.setEditable(false);
        this.confirmPasswordTxtBx.setEditable(false);
        this.submitEditBtn.setEnabled(false);
    }

    private void submitEditedUser() {
        NumeruoUser userToSubmit = getUserBeingDisplayed();
        if (userToSubmit.getUserName().equals(searchResult.getUserName()) == false) {
            MyMessageBox.displayMessage("User name cannot be changed");
            userToSubmit.setUserName(searchResult.getUserName().trim());
        }
        if (confirmPassword()) {
            if (UserAcctController.updateUser(searchResult.getUserName(), userToSubmit)) {
                MyMessageBox.displayMessage("Update Successfull");
                returnBack();
            } else {
                MyMessageBox.displayMessage("Unable to complete operation.  Please contact Admin");
            }
        }
    }
    private NumeruoUser getUserBeingDisplayed(){
        NumeruoUser editedUser= new NumeruoUser();
        editedUser.setUserDepartment(String.valueOf(this.deptComboBx.getSelectedItem()));
        editedUser.setUserName(this.userNameTxtBx.getText().trim());
        editedUser.setUserPassword(String.valueOf(this.userPasswdTxtBx.getPassword()).trim());
        editedUser.setUserFullName(this.fullNameTxtBx.getText().trim());
        return editedUser;
    }
    private boolean confirmPassword(){
        if(String.valueOf(this.userPasswdTxtBx.getPassword()).trim().equals(String.valueOf(this.confirmPasswordTxtBx.getPassword()).trim())){
            return true;
        }
        MyMessageBox.displayMessage("User Password and Confirm Password does not match");
        return false;
    }
}

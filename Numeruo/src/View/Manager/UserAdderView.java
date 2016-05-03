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
public class UserAdderView extends javax.swing.JPanel {

    /**
     * Creates new form UserAdderView
     */
    LoginView parentFrame;
    public UserAdderView(LoginView parentFramer) {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        userNameTxtBx = new javax.swing.JFormattedTextField();
        fullNameTxtBx = new javax.swing.JFormattedTextField();
        deptComboBx = new javax.swing.JComboBox();
        userPasswdTxtBx = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        confirmPasswordTxtBx = new javax.swing.JPasswordField();
        homeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Add User");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 109, 38), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 93, 23));
        jLabel2.setText(" User Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 93, 23));
        jLabel3.setText("User Full Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 93, 23));
        jLabel4.setText("User Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 93, 23));
        jLabel5.setText("User Department:\n");

        createButton.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        createButton.setForeground(new java.awt.Color(0, 165, 250));
        createButton.setText("Create");
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });

        userNameTxtBx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        fullNameTxtBx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        deptComboBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deptComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sales Department", "WareHouse Department", "Managerial Department" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 93, 23));
        jLabel6.setText("Confirm User Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(createButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fullNameTxtBx)
                    .addComponent(deptComboBx, 0, 229, Short.MAX_VALUE)
                    .addComponent(userPasswdTxtBx)
                    .addComponent(userNameTxtBx)
                    .addComponent(confirmPasswordTxtBx))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fullNameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(userPasswdTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(confirmPasswordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deptComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

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
                        .addGap(380, 380, 380)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 152, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
       this.createUser();
    }//GEN-LAST:event_createButtonMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        this.returnBack();
    }//GEN-LAST:event_homeBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordTxtBx;
    private javax.swing.JButton createButton;
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
    private javax.swing.JFormattedTextField userNameTxtBx;
    private javax.swing.JPasswordField userPasswdTxtBx;
    // End of variables declaration//GEN-END:variables
    private boolean validateFields(){
        if(this.userNameTxtBx.getText().trim().equals("")||String.valueOf(this.userPasswdTxtBx.getPassword()).trim().equals("")||this.fullNameTxtBx.getText().trim().equals("")){
            MyMessageBox.displayMessage("All fields must be filled");
            return false;
        }
        return true;
    }
    public void createUser(){
        if(validateFields()&&confirmPassword()){
            if(UserAcctController.getUser(this.userNameTxtBx.getText().trim())!=null){
                MyMessageBox.displayMessage("User already exist.  Please use another userName");
            }else
            {
                NumeruoUser userToAdd= getUserBeingDisplayed();
                if(UserAcctController.addNewUser(userToAdd)){
                    MyMessageBox.displayMessage("User successfully created");
                    returnBack();
                }else
                {
                    MyMessageBox.displayMessage("Operation failed, please contact the admin");
                }
            }
        }
    }
    private NumeruoUser getUserBeingDisplayed(){
        NumeruoUser userBeingDisplayed= new NumeruoUser();
        userBeingDisplayed.setUserDepartment(String.valueOf(this.deptComboBx.getSelectedItem()));
        userBeingDisplayed.setUserName(this.userNameTxtBx.getText().trim());
        userBeingDisplayed.setUserPassword(String.valueOf(this.userPasswdTxtBx.getPassword()).trim());
        userBeingDisplayed.setUserFullName(this.fullNameTxtBx.getText().trim());
        return userBeingDisplayed;
    }
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
    private boolean confirmPassword(){
        if(String.valueOf(this.userPasswdTxtBx.getPassword()).trim().equals(String.valueOf(this.confirmPasswordTxtBx.getPassword()).trim())){
            return true;
        }
        MyMessageBox.displayMessage("User Password and Confirm Password does not match");
        return false;
    }
}
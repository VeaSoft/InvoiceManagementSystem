/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.WareHouse;

import Controller.LoginController;
import View.IGreetable;
import View.IHoverable;
import View.LoginView;
import View.PasswordChanger;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class WarehouseOptionView extends javax.swing.JPanel implements IGreetable,IHoverable {

    /**
     * Creates new form WarehouseOptionView
     */
    LoginView parentFrame;
    public WarehouseOptionView(LoginView ParentFramer) {
        initComponents();
        this.parentFrame= ParentFramer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addItemBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lowQuantityBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchItemBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        changePasswdBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(37, 154, 205));
        welcomeLabel.setText("welcome");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addItemBut.setBackground(new java.awt.Color(183, 239, 240));
        addItemBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add records.jpg"))); // NOI18N
        addItemBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true));
        addItemBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addItemButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addItemButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addItemButMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 154, 205));
        jLabel1.setText("Add Item");

        lowQuantityBtn.setBackground(new java.awt.Color(183, 239, 240));
        lowQuantityBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/678092-sign-add-128.png"))); // NOI18N
        lowQuantityBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        lowQuantityBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lowQuantityBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lowQuantityBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lowQuantityBtnMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 154, 205));
        jLabel3.setText("items with lowest quantity");

        searchItemBtn.setBackground(new java.awt.Color(183, 239, 240));
        searchItemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccc(s1).jpg"))); // NOI18N
        searchItemBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        searchItemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchItemBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchItemBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchItemBtnMouseExited(evt);
            }
        });
        searchItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 154, 205));
        jLabel4.setText("Search Item");

        changePasswdBtn.setBackground(new java.awt.Color(183, 239, 240));
        changePasswdBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/secrecy-icon.png"))); // NOI18N
        changePasswdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswdBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePasswdBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePasswdBtnMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 154, 205));
        jLabel6.setText("change password");

        logOutButton.setBackground(new java.awt.Color(183, 239, 240));
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image logou.jpg"))); // NOI18N
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 154, 205));
        jLabel5.setText("logOut");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(addItemBut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lowQuantityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(searchItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(changePasswdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(75, 75, 75)
                .addComponent(jLabel6)
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(searchItemBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addItemBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lowQuantityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changePasswdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(welcomeLabel)
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchItemBtnActionPerformed

    private void searchItemBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchItemBtnMouseEntered
        this.enter(this.searchItemBtn);
    }//GEN-LAST:event_searchItemBtnMouseEntered

    private void addItemButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemButMouseEntered
      this.enter(this.addItemBut);
   
    }//GEN-LAST:event_addItemButMouseEntered

    private void lowQuantityBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowQuantityBtnMouseEntered
     this.enter(this.lowQuantityBtn);
   
    }//GEN-LAST:event_lowQuantityBtnMouseEntered

    private void addItemButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemButMouseExited
      this.exit(this.addItemBut);
    }//GEN-LAST:event_addItemButMouseExited

    private void lowQuantityBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowQuantityBtnMouseExited
        this.exit(this.lowQuantityBtn);
    }//GEN-LAST:event_lowQuantityBtnMouseExited

    private void searchItemBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchItemBtnMouseExited
         this.exit(this.searchItemBtn);
   
    }//GEN-LAST:event_searchItemBtnMouseExited

    private void addItemButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemButMouseClicked
        this.transitToItemAdder(new ItemAdderView(parentFrame));
    }//GEN-LAST:event_addItemButMouseClicked

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        this.logOut();
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
       this.enter(logOutButton);
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
       this.exit(logOutButton);
    }//GEN-LAST:event_logOutButtonMouseExited

    private void lowQuantityBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowQuantityBtnMouseClicked
        this.transitToLowestItemView(new LowestItemView(parentFrame));
    }//GEN-LAST:event_lowQuantityBtnMouseClicked

    private void searchItemBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchItemBtnMouseClicked
        this.transitToSearchItemView(new SearchItemView(parentFrame));
    }//GEN-LAST:event_searchItemBtnMouseClicked

    private void changePasswdBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswdBtnMouseEntered
        this.enter(this.changePasswdBtn);
    }//GEN-LAST:event_changePasswdBtnMouseEntered

    private void changePasswdBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswdBtnMouseExited
        this.exit(this.changePasswdBtn);
    }//GEN-LAST:event_changePasswdBtnMouseExited

    private void changePasswdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswdBtnMouseClicked
       this.transitToChangPasswordView(new PasswordChanger(parentFrame));
    }//GEN-LAST:event_changePasswdBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBut;
    private javax.swing.JButton changePasswdBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton lowQuantityBtn;
    private javax.swing.JButton searchItemBtn;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
    @Override
    public void setGreeting(String userName){
        this.welcomeLabel.setText("Welcome "+userName);
    }
    public void transitToItemAdder(ItemAdderView iAdder){
        this.setVisible(false);
       parentFrame.remove(this);
       iAdder.setSize(978,570);
       parentFrame.add(iAdder);
       iAdder.setVisible(true);
    }
    public void logOut(){
        LoginView myView= new LoginView();
        this.setVisible(false);
        parentFrame.setVisible(false);
        myView.setVisible(true);
        myView.setLocationRelativeTo(null);
        LoginController.logOut();
    }
    public void transitToLowestItemView(LowestItemView myItem){
        this.setVisible(false);
        parentFrame.remove(this);
        myItem.setSize(978, 570);
        parentFrame.add(myItem);
        myItem.setVisible(true);
    }
    public void transitToSearchItemView(SearchItemView siv){
        this.setVisible(false);
        parentFrame.remove(this);
        siv.setSize(978, 570);
        parentFrame.add(siv);
        siv.setVisible(true);
    }
    public void transitToChangPasswordView(PasswordChanger pChange) {
        this.setVisible(false);
        parentFrame.remove(this);
        pChange.setSize(978, 570);
        parentFrame.add(pChange);
        pChange.setVisible(true);
    }
    @Override
    public void enter(JButton button) {
        button.setBackground(Color.orange);
        button.setSize((button.getWidth() + 15), (button.getHeight() + 15));
    }

    @Override
    public void exit(JButton button) {
        button.setBackground(new java.awt.Color(183, 239, 240));
        button.setSize((button.getWidth() - 15), (button.getHeight() - 15));
    }
}

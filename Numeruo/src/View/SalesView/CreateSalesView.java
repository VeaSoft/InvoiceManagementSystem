/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.SalesView;

import Controller.ClientController;
import Controller.ItemController;
import Controller.OrderItemController;
import Controller.SalesController;
import Model.CurrentUser;
import Model.Items;
import Model.OrderItems;
import Model.Sales;
import View.LoginView;
import View.MyMessageBox;
import java.text.DateFormat;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author user
 */
public class CreateSalesView extends javax.swing.JPanel {

    /**
     * Creates new form CreateSalesPanel
     */
    LoginView parentFrame;
    int currentPointer = 0;
    double formerAmount = 0;

    public CreateSalesView(LoginView parentFramer) {
        initComponents();
        this.loadInitialValues();
        parentFrame = parentFramer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salesIdTxtbx = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clientUserNameTxtbx = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        itemIdComboBx = new javax.swing.JComboBox();
        itemNameTxtbx = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemDescTxtarea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        unitPriceTxtBx = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        itemTotalPriceTxtbx = new javax.swing.JTextField();
        prevButton = new javax.swing.JButton();
        addItem = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        totalPriceTxtBx = new javax.swing.JTextField();
        saveOrderButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        numOfOrderedItemsTxtBx = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(72, 93, 215));
        jLabel2.setText("Sales Order Creator");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 145, 1)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 93, 23));
        jLabel1.setText("Sales Id:");

        salesIdTxtbx.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 93, 23));
        jLabel3.setText("Client User Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clientUserNameTxtbx))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesIdTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salesIdTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientUserNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Add Items");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 93, 23));
        jLabel6.setText("Item Id:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 93, 23));
        jLabel7.setText("Item Name:");

        itemIdComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        itemIdComboBx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemIdComboBxMouseClicked(evt);
            }
        });
        itemIdComboBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemIdComboBxItemStateChanged(evt);
            }
        });

        itemNameTxtbx.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(49, 93, 23));
        jLabel8.setText("Item Description:");

        itemDescTxtarea.setEditable(false);
        itemDescTxtarea.setColumns(20);
        itemDescTxtarea.setRows(5);
        jScrollPane1.setViewportView(itemDescTxtarea);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 93, 23));
        jLabel9.setText("Unit Price:");

        unitPriceTxtBx.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(49, 93, 23));
        jLabel10.setText("Item Total Price:");

        quantitySpinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantitySpinnerMouseClicked(evt);
            }
        });
        quantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantitySpinnerStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(49, 93, 23));
        jLabel11.setText("Quantity:");

        itemTotalPriceTxtbx.setEditable(false);
        itemTotalPriceTxtbx.setText("0.0");

        prevButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prevButton.setForeground(new java.awt.Color(47, 165, 242));
        prevButton.setText("Previous");
        prevButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevButtonMouseClicked(evt);
            }
        });

        addItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addItem.setForeground(new java.awt.Color(37, 100, 16));
        addItem.setText("Add Item");
        addItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addItemMouseClicked(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(47, 165, 242));
        nextButton.setText("Next");
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(102, 102, 0));
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitPriceTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemTotalPriceTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemIdComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prevButton)
                .addGap(2, 2, 2)
                .addComponent(addItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemIdComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(201, 201, 201))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitPriceTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemTotalPriceTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 93, 23));
        jLabel5.setText("Total Price");

        totalPriceTxtBx.setEditable(false);

        saveOrderButton.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        saveOrderButton.setForeground(new java.awt.Color(51, 51, 0));
        saveOrderButton.setText("Save Order");
        saveOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveOrderButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(saveOrderButton)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totalPriceTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        homeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(47, 165, 242));
        homeButton.setText("Home");
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(49, 93, 23));
        jLabel12.setText("Number of Ordered Items:");

        numOfOrderedItemsTxtBx.setEditable(false);
        numOfOrderedItemsTxtBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numOfOrderedItemsTxtBx.setForeground(new java.awt.Color(0, 0, 204));
        numOfOrderedItemsTxtBx.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(numOfOrderedItemsTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(homeButton)))
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOfOrderedItemsTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        this.next();
    }//GEN-LAST:event_nextButtonMouseClicked

    private void prevButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevButtonMouseClicked
        this.prev();
    }//GEN-LAST:event_prevButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        this.delete();
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void saveOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveOrderButtonMouseClicked
        this.saveOrder();
    }//GEN-LAST:event_saveOrderButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        this.returnBack();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void quantitySpinnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantitySpinnerMouseClicked
        this.monitorQuantity(this.getSelectedIndex());
        this.calculateTotalItemPrice();
    }//GEN-LAST:event_quantitySpinnerMouseClicked

    private void quantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantitySpinnerStateChanged
        this.monitorQuantity(this.getSelectedIndex());
        this.calculateTotalItemPrice();
    }//GEN-LAST:event_quantitySpinnerStateChanged

    private void itemIdComboBxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemIdComboBxMouseClicked
        this.loadItemsBasedOnId();
    }//GEN-LAST:event_itemIdComboBxMouseClicked

    private void itemIdComboBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemIdComboBxItemStateChanged
        if (this.itemIdComboBx.getSelectedIndex() >= 0) {
            this.loadItemsBasedOnId();
        }
    }//GEN-LAST:event_itemIdComboBxItemStateChanged

    private void addItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemMouseClicked
        this.addNewItem();
    }//GEN-LAST:event_addItemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JTextField clientUserNameTxtbx;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextArea itemDescTxtarea;
    private javax.swing.JComboBox itemIdComboBx;
    private javax.swing.JTextField itemNameTxtbx;
    private javax.swing.JTextField itemTotalPriceTxtbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField numOfOrderedItemsTxtBx;
    private javax.swing.JButton prevButton;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField salesIdTxtbx;
    private javax.swing.JButton saveOrderButton;
    private javax.swing.JTextField totalPriceTxtBx;
    private javax.swing.JTextField unitPriceTxtBx;
    // End of variables declaration//GEN-END:variables
    private void loadInitialValues() {
        this.salesIdTxtbx.setText(String.valueOf(SalesController.getAutoGeneratedSalesId()));
        this.fillItemComboBox();
        this.loadItemsBasedOnId();
    }

    private int getSelectedIndex() {
        return this.itemIdComboBx.getSelectedIndex();
    }

    private void loadItemsBasedOnId() {
        this.resetValues();
        int selectedIndex = this.getSelectedIndex();
        Items itemToDisplay = ItemsFromDb.get(selectedIndex);
        this.itemNameTxtbx.setText(itemToDisplay.getItemName());
        this.itemDescTxtarea.setText(itemToDisplay.getItemDescription());
        this.unitPriceTxtBx.setText(itemToDisplay.getUnitPrice());
    }
    LinkedList<Items> ItemsFromDb = ItemController.getAllItems();
    LinkedList<OrderItems> ItemsToSubmit = new LinkedList<>();

    private void fillItemComboBox() {
        this.itemIdComboBx.removeAllItems();
        for (Items item : ItemsFromDb) {
            this.itemIdComboBx.addItem(item.getItemId());
        }
        this.itemIdComboBx.setSelectedIndex(0);
    }

    private void monitorQuantity(int itemId) {
       
        Items itemToDisplay = ItemsFromDb.get(itemId);
        //System.out.println("Quantity is: "+itemToDisplay.getQuantityAvailable());
        if(Integer.valueOf((String.valueOf(this.quantitySpinner.getValue())))<=0) {
            this.quantitySpinner.setValue(0);
        }else if (Integer.valueOf((String.valueOf(this.quantitySpinner.getValue()))) > itemToDisplay.getQuantityAvailable()) {
            MyMessageBox.displayMessage("you have exceeded the quantity of " + itemToDisplay.getItemName() + " available");
            this.quantitySpinner.setValue(itemToDisplay.getQuantityAvailable());
        } 
        
        

    }

    private void calculateTotalItemPrice() {
        Items itemToCalculate = ItemsFromDb.get(this.itemIdComboBx.getSelectedIndex());
        double totalPrice = Integer.valueOf(String.valueOf(this.quantitySpinner.getValue())) * Double.valueOf(itemToCalculate.getUnitPrice());
        this.itemTotalPriceTxtbx.setText(String.valueOf(totalPrice));
        this.totalPriceTxtBx.setText(String.valueOf(formerAmount + totalPrice));
    }

    private void next() {
      if(this.saveCurrentlyDisplayed(false)){
        if (currentPointer >= this.ItemsToSubmit.size() - 1) {
            currentPointer = 0;
        } else {
            currentPointer += 1;
        }
        this.LtotalPrice = 0;
        this.displayCurrent();
        this.numOfOrderedItemsTxtBx.setText(String.valueOf(this.currentPointer + 1) + "/" + String.valueOf(this.ItemsToSubmit.size()));
      }
    }

    
    private void displayCurrent() {
        //MyMessageBox.displayMessage("Current Position is: " + this.currentPointer);
        OrderItems orderToDisplay = this.ItemsToSubmit.get(this.currentPointer);
        if (orderToDisplay != null) {
            this.itemIdComboBx.setSelectedItem(orderToDisplay.getItemId());
            this.quantitySpinner.setValue(orderToDisplay.getQuantityOrdered());
            this.itemTotalPriceTxtbx.setText(orderToDisplay.getTotalPrice());
            this.salesIdTxtbx.setText(String.valueOf(orderToDisplay.getSalesId()));
        }
    }

    private void prev() {
        
       if(this.saveCurrentlyDisplayed(false)){
        if (currentPointer <= 0) {
            currentPointer = 0;
        } else {
            currentPointer -= 1;
        }
        this.LtotalPrice = 0;
        this.displayCurrent();
        this.numOfOrderedItemsTxtBx.setText(String.valueOf(this.currentPointer + 1) + "/" + String.valueOf(this.ItemsToSubmit.size()));
       }
    }
    /*private void loadAllOrderValues(){
     int totalIndex= this.ItemsToSubmit.size();
        
     if(this.currentPointer<totalIndex&&this.currentPointer>=0){
     OrderItems ori= this.ItemsToSubmit.get(this.currentPointer);
     this.itemIdComboBx.setSelectedItem(ori.getItemId());
     this.quantitySpinner.setValue(ori.getQuantityOrdered());
     this.itemTotalPriceTxtbx.setText(ori.getTotalPrice());
     this.salesIdTxtbx.setText(String.valueOf(ori.getSalesId()));
     //  MyMessageBox.displayMessage("I'm within range"+totalIndex+" and"+this.ItemsToSubmit.size());
     }else
     {
     this.currentPointer=0;
     //  MyMessageBox.displayMessage("I'm outa range"+totalIndex+" and"+this.ItemsToSubmit.size());
     this.loadAllOrderValues();
            
     }
     }*/

    private boolean saveCurrentlyDisplayed(boolean addNew) {
        if(this.getItemsBeingDisplayed().getQuantityOrdered()<=0){
            MyMessageBox.displayMessage("Quantity of this item must be more than 0");
            System.out.println("Quantity saved: "+this.getItemsBeingDisplayed().getQuantityOrdered());
            return false;
        }
        if (addNew == true) {
            this.ItemsToSubmit.add(this.getItemsBeingDisplayed());
            this.calculateOverAllPrice();
        } else if (addNew == false) {
            System.out.println("FIRST: Current: "+currentPointer+"; total: "+(this.ItemsToSubmit.size()-1)+"; quantity: "+this.getItemsBeingDisplayed().getQuantityOrdered());
            this.ItemsToSubmit.set(currentPointer, this.getItemsBeingDisplayed());
            System.out.println("SECOND: Current: "+currentPointer+"; total: "+(this.ItemsToSubmit.size()-1)+"; quantity: "+this.getItemsBeingDisplayed().getQuantityOrdered());
           
        }
        this.ItemsFromDb= ItemController.getAllItems();
        //MyMessageBox.displayMessage("Current Current size :" + this.ItemsToSubmit.size());
      return true;
    }

    private OrderItems getItemsBeingDisplayed() {
        OrderItems dItems = new OrderItems();
        dItems.setItemId(Integer.valueOf(String.valueOf(this.itemIdComboBx.getSelectedItem())));
        dItems.setQuantityOrdered(Integer.valueOf((String.valueOf(this.quantitySpinner.getValue()))));
        System.out.println("quantity ordered: "+ dItems.getQuantityOrdered());
        dItems.setSalesId(Integer.valueOf(this.salesIdTxtbx.getText().trim()));
        dItems.setTotalPrice(String.valueOf(this.itemTotalPriceTxtbx.getText().trim()));
        //System.out.println("I entered new here");
        return dItems;
    }

    private void resetValues() {
        /* this.itemDescTxtarea.setText("");
         this.itemNameTxtbx.setText("");*/
        this.quantitySpinner.setValue(0);
        this.itemTotalPriceTxtbx.setText("0");
        this.LtotalPrice = 0;
    }

    private void addNewItem() {
        boolean successfullStorage=false;
        if (this.ItemsToSubmit.size() == 0) {
            this.saveCurrentlyDisplayed(true);
            successfullStorage=true;
        } else if (currentPointer == this.ItemsToSubmit.size() - 1) {
            this.saveCurrentlyDisplayed(true);
            successfullStorage=true;
        } else {
            this.saveCurrentlyDisplayed(false);
            successfullStorage=true;
        }
        if(successfullStorage){
        this.currentPointer = this.ItemsToSubmit.size() - 1;
        formerAmount = this.LtotalPrice;    
        this.numOfOrderedItemsTxtBx.setText(String.valueOf(this.ItemsToSubmit.size()) + "/" + String.valueOf(this.ItemsToSubmit.size()));
    
        }
    }

    private void delete() {
        this.ItemsToSubmit.remove(this.currentPointer);
        this.next();

    }
    double LtotalPrice = 0;

    private void calculateOverAllPrice() {

        for (OrderItems myItem : this.ItemsToSubmit) {
            LtotalPrice += Double.valueOf(myItem.getTotalPrice());
        }

        this.totalPriceTxtBx.setText(String.valueOf(LtotalPrice));
    }

    private void saveOrder() {
        if (ClientController.doesClientExist(this.clientUserNameTxtbx.getText().trim()) == false) {
            MyMessageBox.displayMessage("Client does not exist. Use the client interface to add a new client");
        } else {
            if (this.areRequiredFieldsFilled()) {
                Sales mySales = new Sales();
                mySales.setClientUserName(this.clientUserNameTxtbx.getText().trim());
                mySales.setSalesId(Integer.valueOf(this.salesIdTxtbx.getText().trim()));
                mySales.setOverAllPrice(this.totalPriceTxtBx.getText().trim());
                mySales.setSalesPersonnel(CurrentUser.userName);
                mySales.setOrderStatus("UnDelivered");
                mySales.setDateOfTransaction(this.getCurrentDate());
                if (OrderItemController.storeAllOrderItems(ItemsToSubmit) && SalesController.storeSales(mySales)) {
                    MyMessageBox.displayMessage("Sales Sucessfully created");
                    this.returnBack();
                } else {
                    MyMessageBox.displayMessage("Unable to Store details. please call the Admin");
                }

            }
        }
    }

    private void returnBack() {
        SalesOptionView salesPanel = new SalesOptionView(parentFrame);
        salesPanel.setGreeting(CurrentUser.userFullName.trim());
        this.transitToHomePage(salesPanel);
    }

    public void transitToHomePage(SalesOptionView sov) {
        this.setVisible(false);
        parentFrame.remove(this);
        sov.setSize(978, 570);
        parentFrame.add(sov);
        sov.setVisible(true);

    }

    private boolean areRequiredFieldsFilled() {
        if ("".equals(this.clientUserNameTxtbx.getText().trim())) {
            MyMessageBox.displayMessage("Please Input the client's username");
            return false;
        }
        return true;
    }

    private String getCurrentDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        DateFormat formarrer = DateFormat.getDateTimeInstance(DateFormat.DATE_FIELD, DateFormat.DATE_FIELD, Locale.ENGLISH);
        TimeZone timeZone = TimeZone.getTimeZone("CST");
        formarrer.setTimeZone(timeZone);
        return formarrer.format(calendar.getTime());
    }

}
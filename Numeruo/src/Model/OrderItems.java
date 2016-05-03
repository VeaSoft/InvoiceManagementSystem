/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DataInterfacer.DataConnector;
import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class OrderItems {
    private int orderItemsId;
    private int salesId;
    private int itemId;
    private int quantityOrdered;
    private String totalPrice;
    
    //connection variables
    static DataConnector dConnector= DataConnector.getDataConnector();

    public int getOrderItemsId() {
        return orderItemsId;
    }

    public void setOrderItemsId(int orderItemsId) {
        System.out.println("I was called");
        this.orderItemsId = orderItemsId;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public static boolean insert(OrderItems ordersToInsert){
        try {
            if(ordersToInsert==null){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("insert into OrderItems(orderItemsId,salesId,itemId,quantityOrdered,totalPrice) values(?,?,?,?,?)");
            statementToExec.setInt(1, ordersToInsert.getItemId());
            statementToExec.setInt(2, ordersToInsert.getSalesId());
            statementToExec.setInt(3, ordersToInsert.getItemId());
            statementToExec.setInt(4, ordersToInsert.getQuantityOrdered());
            statementToExec.setString(5, ordersToInsert.getTotalPrice());
            
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0){
                System.out.println("I got here to insert");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderItems.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
        finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static LinkedList<OrderItems> retrieveBasedOnSalesId(int salesId){
        try {
            if(salesId<=0){
                return null;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select * from OrderItems where salesId=(?)");
            statementToExec.setInt(1, salesId);
            ResultSet rs= statementToExec.executeQuery();
            LinkedList<OrderItems> requestedData= new LinkedList<>();
            while(rs.next()){
                OrderItems oi= new OrderItems();
                oi.setOrderItemsId(rs.getInt("orderItemsId"));
                oi.setSalesId(salesId);
                oi.setItemId(rs.getInt("itemId"));
                oi.setQuantityOrdered(rs.getInt("quantityOrdered"));
                oi.setTotalPrice(rs.getString("totalPrice"));
                requestedData.add(oi);
            }
            return requestedData;
        } catch (SQLException ex) {
            Logger.getLogger(OrderItems.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return null;
    }
    public static OrderItems retrieve(int orderItemsId){
        try {
            if(orderItemsId<=0){
                return null;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select * from OrderItems where orderItemsId=(?)");
            statementToExec.setInt(1, orderItemsId);
            ResultSet rs= statementToExec.executeQuery();
            if(rs.next()){
            OrderItems oi= new OrderItems();
                oi.setOrderItemsId(orderItemsId);
                oi.setSalesId(rs.getInt("salesId"));
                oi.setItemId(rs.getInt("itemId"));
                oi.setQuantityOrdered(rs.getInt("quantityOrdered"));
                oi.setTotalPrice(rs.getString("totalPrice"));
                return oi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderItems.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return null;
        
    }
    public static boolean update(int orderItemsId,OrderItems itemToUpdate){
        try {
            if(orderItemsId<=0||itemToUpdate==null){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("update OrderItems set orderItemsId=(?),salesId=(?),itemId=(?),quantityOrdered=(?),totalPrice=(?) where orderItemsId=(?)");
            statementToExec.setInt(1, itemToUpdate.getOrderItemsId());
            statementToExec.setInt(2, itemToUpdate.getSalesId());
            statementToExec.setInt(3, itemToUpdate.getItemId());
             statementToExec.setInt(4, itemToUpdate.getQuantityOrdered());
            statementToExec.setString(5, itemToUpdate.getTotalPrice());
            statementToExec.setInt(6, orderItemsId);
            
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderItems.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static boolean delete(int orderItemsId){
        try {
            if(orderItemsId<=0){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("delete  from OrderItems where orderItemsId=(?)");
            statementToExec.setInt(1, orderItemsId);
            
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderItems.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return false;
        
    }
    public static int getNextOrderItemsId(){
         try {
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select orderItemsId from OrderItems");
            ResultSet rs= statementToExec.executeQuery();
            int nextId=0;
            while(rs.next()){
                nextId= rs.getInt("orderItemsId");
                //System.out.println("rec: "+ nextId);
            }
            nextId+=1;
            return nextId;
            
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return 0;
    }
}

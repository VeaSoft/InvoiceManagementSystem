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
public class Items {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemPreviewUrl="@Default";
    private String unitPrice;
    private int quantityAvailable;
    private double valueAddedTax;
    //connection variables;
    
    static DataConnector dConnector= DataConnector.getDataConnector();

    
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemPreviewUrl() {
        return itemPreviewUrl;
    }

    public void setItemPreviewUrl(String itemPreviewUrl) {
        this.itemPreviewUrl = itemPreviewUrl;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getValueAddedTax() {
        return valueAddedTax;
    }

    public void setValueAddedTax(double valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }
    
    
    public static boolean insert(Items itemsToInsert){
        try {
            if(itemsToInsert==null){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("insert into Items values(?,?,?,?,?,?,?)");
            statementToExec.setInt(1, itemsToInsert.itemId);
            statementToExec.setString(2, itemsToInsert.itemName);
            statementToExec.setString(3, itemsToInsert.itemDescription);
            statementToExec.setString(4, itemsToInsert.itemPreviewUrl);
            statementToExec.setString(5, itemsToInsert.unitPrice);
            statementToExec.setInt(6, itemsToInsert.quantityAvailable);
            statementToExec.setDouble(7, itemsToInsert.valueAddedTax);
            
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static Items retrieve(int itemId){
        try {
            if(itemId==0){
                return null;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select * from Items where itemId=(?)");
            statementToExec.setInt(1, itemId);
            ResultSet rs= statementToExec.executeQuery();
            if(rs.next()){
                Items requestedItem= new Items();
                requestedItem.setItemId(itemId);
                requestedItem.setItemName(rs.getString("itemName"));
                requestedItem.setItemDescription(rs.getString("itemDescription"));
                requestedItem.setUnitPrice(rs.getString("unitPrice"));
                requestedItem.setQuantityAvailable(rs.getInt("quantityAvailable"));
                requestedItem.setValueAddedTax(rs.getDouble("valueAddedTax"));
                requestedItem.setItemPreviewUrl(rs.getString("itemPreviewUrl"));
                return requestedItem;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return null;
    }
    public static LinkedList<Items> retrieveAllItems(){
        try {
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select * from Items ");
            ResultSet rs= statementToExec.executeQuery();
            LinkedList<Items> requestedData= new LinkedList<>();
            while(rs.next()){
                Items requestedItem= new Items();
                requestedItem.setItemId(rs.getInt("itemId"));
                requestedItem.setItemName(rs.getString("itemName"));
                requestedItem.setItemDescription(rs.getString("itemDescription"));
                requestedItem.setUnitPrice(rs.getString("unitPrice"));
                requestedItem.setQuantityAvailable(rs.getInt("quantityAvailable"));
                requestedItem.setValueAddedTax(rs.getDouble("valueAddedTax"));
                requestedItem.setItemPreviewUrl(rs.getString("itemPreviewUrl"));
                requestedData.add(requestedItem);
            }
            return requestedData;
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static boolean update(int itemId, Items itemToUpdate){
        try {
            if(itemId<0||itemToUpdate==null){
                return false;
            }
            Connection con=dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("update Items set itemId=(?),itemName=(?),itemDescription=(?),itemPreviewUrl=(?),unitPrice=(?),quantityAvailable=(?),valueAddedTax=(?) where itemId=(?)");
            statementToExec.setInt(1, itemToUpdate.itemId);
            statementToExec.setString(2, itemToUpdate.itemName);
            statementToExec.setString(3, itemToUpdate.itemDescription);
            statementToExec.setString(4, itemToUpdate.itemPreviewUrl);
            statementToExec.setString(5, itemToUpdate.unitPrice);
            statementToExec.setInt(6, itemToUpdate.quantityAvailable);
            statementToExec.setDouble(7, itemToUpdate.valueAddedTax);
            statementToExec.setInt(8, itemId);
            
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static boolean reduceQuantity(int itemId, int deductionAmount) {

        if (itemId < 0 || deductionAmount <= 0) {
            return false;
        }
        Items myItem = retrieve(itemId);
        myItem.setQuantityAvailable(myItem.getQuantityAvailable()-deductionAmount);
        return update(itemId,myItem);
    }
    public static boolean delete(int itemId){
        try {
            if(itemId==0){
                System.out.println("operation false");
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("delete from Items where itemId=(?)");
            statementToExec.setInt(1, itemId);
            
            int rowsAffected= statementToExec.executeUpdate();
            System.out.println("I operated well outside");
            if(rowsAffected>0){
                System.out.println("I operated well");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return true;
    }
    public static int getNextId(){
        try {
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select itemId from Items");
            ResultSet rs= statementToExec.executeQuery();
            int nextId=0;
            while(rs.next()){
               nextId= rs.getInt("itemId")+1;
               
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

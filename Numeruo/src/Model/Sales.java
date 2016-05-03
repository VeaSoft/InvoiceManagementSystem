/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DataInterfacer.DataConnector;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class Sales {
    private int salesId;
    private String overAllPrice;
    private String orderStatus;
    private String clientUserName;
    private String salesPersonnel;
    private String dateOfTransaction;

    //connection variables
    static DataConnector dConnector= DataConnector.getDataConnector();
    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getOverAllPrice() {
        return overAllPrice;
    }

    public void setOverAllPrice(String overAllPrice) {
        this.overAllPrice = overAllPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getClientUserName() {
        return clientUserName;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public String getSalesPersonnel() {
        return salesPersonnel;
    }

    public void setSalesPersonnel(String salesPersonnel) {
        this.salesPersonnel = salesPersonnel;
    }

    public String getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(String dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public static boolean insert(Sales salesToInsert){
        try {
            if(salesToInsert==null){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("insert into Sales(salesId,overAllPrice,orderStatus,clientUserName,salesPersonnel,dateOfTransaction) values(?,?,?,?,?,?)");
            statementToExec.setInt(1, salesToInsert.salesId);
            statementToExec.setString(2, salesToInsert.overAllPrice);
            statementToExec.setString(3, salesToInsert.orderStatus);
            statementToExec.setString(4, salesToInsert.clientUserName);
            statementToExec.setString(5, salesToInsert.salesPersonnel);
            statementToExec.setString(6, salesToInsert.dateOfTransaction);
           
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static Sales retrieve(int salesId){
        try {
            if(salesId<=0){
                return null;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select * from Sales where salesId=(?)");
            statementToExec.setInt(1, salesId);
            ResultSet rs= statementToExec.executeQuery();
            if(rs.next()){
                Sales requestedData=new Sales();
                requestedData.setSalesId(salesId);
                requestedData.setOverAllPrice(rs.getString("overAllPrice"));
                requestedData.setOrderStatus(rs.getString("orderStatus"));
                requestedData.setClientUserName(rs.getString("clientUserName"));
                requestedData.setSalesPersonnel(rs.getString("salesPersonnel"));
                requestedData.setDateOfTransaction(rs.getString("dateOfTransaction"));
            
                return requestedData;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return null;
    }
    public static boolean update(int salesId, Sales salesToUpdate){
        try {
            if(salesId<=0){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("update Sales set salesId=(?),overAllPrice=(?),orderStatus=(?),clientUserName=(?),salesPersonnel=(?),dateOfTransaction=(?) where salesId=(?)");
            statementToExec.setInt(1,salesToUpdate.salesId);
            statementToExec.setString(2, salesToUpdate.overAllPrice);
            statementToExec.setString(3, salesToUpdate.orderStatus);
            statementToExec.setString(4, salesToUpdate.clientUserName);
            statementToExec.setString(5, salesToUpdate.salesPersonnel);
            statementToExec.setString(6, salesToUpdate.dateOfTransaction);
            statementToExec.setInt(7, salesId);
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0)
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static boolean delete(int salesId){
        try {
            if (salesId <= 0) {
                return false;
            }
            
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("delete * from Sales where salesId=(?)");
            statementToExec.setInt(1, salesId);
            
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static int getNextSalesId(){
         try {
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select salesId from Sales");
            ResultSet rs= statementToExec.executeQuery();
            int currentId=0;
            while(rs.next()){
                currentId=rs.getInt("salesId");
            }
            currentId+=1;
            return currentId;
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return 0;
    }

   
}

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
public class Clients {
    private String userName;
    private String clientName;
    private String clientAddress;
    private String clientPhone;

    //connection variables
    static DataConnector dConnector= DataConnector.getDataConnector();
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }
    
    public static boolean insert(Clients clientToInsert){
        try {
            if(clientToInsert==null){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Insert into Clients(userName,clientName,clientAddress,clientPhone) values(?,?,?,?)");
            statementToExec.setString(1, clientToInsert.userName);
            statementToExec.setString(2, clientToInsert.clientName);
            statementToExec.setString(3, clientToInsert.clientAddress);
            statementToExec.setString(4, clientToInsert.clientPhone);
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static Clients retrieve(String userName){
        try {
            if(userName.length()==0){
                return null;
            }
            Connection con=dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select clientName,clientAddress,clientPhone from Clients where userName=(?)");
            statementToExec.setString(1, userName);
            ResultSet rs= statementToExec.executeQuery();
            if(rs.next()){
                Clients requestedClient= new Clients();
                requestedClient.setUserName(userName);
                requestedClient.setClientName(rs.getString("clientName"));
                requestedClient.setClientAddress(rs.getString("clientAddress"));
                requestedClient.setClientPhone(rs.getString("clientPhone"));
                return requestedClient;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return null;
    }
    public static boolean update(Clients clientToEdit,String userName){
        try {
            if(clientToEdit==null||"".equals(userName))
            {
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("update Clients set userName=(?),clientName=(?),clientAddress=(?),clientPhone=(?) where userName=(?)");
            statementToExec.setString(1, clientToEdit.getUserName());
            statementToExec.setString(2, clientToEdit.getClientName());
            statementToExec.setString(3, clientToEdit.getClientAddress());
            statementToExec.setString(4, clientToEdit.getClientPhone());
            statementToExec.setString(5, userName);
            
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static boolean delete(String userName){
        try {
            if("".equals(userName)){
                return false;
            }
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("delete * from Clients where userName=(?)");
            statementToExec.setString(1, userName);
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return false;
    }
}

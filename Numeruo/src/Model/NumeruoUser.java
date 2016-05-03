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
public class NumeruoUser {
    private String userName;
    private String userPassword;
    private String userDepartment;
    private String userFullName;

    //connection modules
    static  DataConnector dConnector= DataConnector.getDataConnector();
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
    
    public static boolean insert(NumeruoUser userToInsert){
        if(userToInsert == null){
            return false;
        }
        if(retrieve(userToInsert.userName)!=null){
            return false;
        }
        boolean isSuccessful=false;
        try {
           
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("insert into NumeruoUser values(?,?,?,?)");
            statementToExec.setString(1, userToInsert.userName);
            statementToExec.setString(2, userToInsert.userPassword);
            statementToExec.setString(3, userToInsert.userDepartment);
            statementToExec.setString(4, userToInsert.userFullName);
            int rowsAffected=statementToExec.executeUpdate();
            if(rowsAffected>0){
                isSuccessful=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NumeruoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            dConnector.closeConnection();
        }
        return isSuccessful;
    }
    public static NumeruoUser retrieve(String userName){
        if(userName.equals("")){
            return null;
        }
        try {
           
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Select * from NumeruoUser where userName=(?)");
            statementToExec.setString(1, userName);
            ResultSet rs= statementToExec.executeQuery();
            
            if(rs.next()){
                 NumeruoUser queriedUser= new NumeruoUser();
                queriedUser.setUserName(rs.getString("userName"));
                queriedUser.setUserPassword(rs.getString("userPassword"));
                queriedUser.setUserDepartment(rs.getString("userDepartment"));
                queriedUser.setUserFullName(rs.getString("userFullName"));
               return queriedUser;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NumeruoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
          finally{
            dConnector.closeConnection();
        }
        return null;
    }
    public static boolean update(String userName, NumeruoUser updatedUser){
        try {
            if("".equals(userName)&&updatedUser==null){
                return false;
            }
            
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("update NumeruoUser set userName=(?),userPassword=(?),userDepartment=(?),userFullName=(?) where userName=(?)");
            statementToExec.setString(1, updatedUser.getUserName());
            statementToExec.setString(2, updatedUser.getUserPassword());
            statementToExec.setString(3, updatedUser.getUserDepartment());
            statementToExec.setString(4, updatedUser.getUserFullName());
            statementToExec.setString(5, userName);
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NumeruoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
          finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static boolean delete(String userName){
            if(userName.equals("")){
                return false;
            }

        try {
            Connection con= dConnector.getConnection();
            PreparedStatement statementToExec= con.prepareStatement("Delete * from NumeruoUser where userName=?");
            statementToExec.setString(1, userName);
            int rowsAffected= statementToExec.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NumeruoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
          finally{
            dConnector.closeConnection();
        }
        return false;
    }
    public static LinkedList<NumeruoUser> retrieveAll(){
          try {

            Connection con = dConnector.getConnection();
            PreparedStatement statementToExec = con.prepareStatement("Select * from NumeruoUser");
            ResultSet rs = statementToExec.executeQuery();
            LinkedList<NumeruoUser> allUsers = new LinkedList<>();
            while (rs.next()) {
                NumeruoUser queriedUser = new NumeruoUser();
                queriedUser.setUserName(rs.getString("userName"));
                queriedUser.setUserPassword(rs.getString("userPassword"));
                queriedUser.setUserDepartment(rs.getString("userDepartment"));
                queriedUser.setUserFullName(rs.getString("userFullName"));
                allUsers.add(queriedUser);

            }
            return allUsers;

        } catch (SQLException ex) {
            Logger.getLogger(NumeruoUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dConnector.closeConnection();
        }
        return null;
    }

}

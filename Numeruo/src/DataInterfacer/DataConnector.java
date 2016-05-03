/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataInterfacer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class DataConnector {
    private static DataConnector dConnect;
    private Connection con;
    private DataConnector(){
        
    }
    public static DataConnector getDataConnector(){
        if(dConnect==null){
            dConnect=new DataConnector();
        }
        return dConnect;
    }
    private void openConnection(){
        try {
            String driver="org.sqlite.JDBC";
            Class.forName(driver);
            con= DriverManager.getConnection("Jdbc:sqlite:NumeruoDb.sqlite");
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection(){
       // if(con==null){
            openConnection();
        //}
        return con;
    }
    public void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

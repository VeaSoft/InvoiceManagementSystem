/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataInterfacer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.*;
/**
 *
 * @author user
 */
public class tester {
    public static void main(String[] args){
        try {
            Connection con= DataConnector.getDataConnector().getConnection();
            PreparedStatement statementToExec= con.prepareStatement("");
            if(statementToExec.executeUpdate()>0){
                System.out.println("Successful");
            }

        }
        catch (SQLException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

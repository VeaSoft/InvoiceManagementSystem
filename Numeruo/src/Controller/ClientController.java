/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Clients;
import java.util.*;
/**
 *
 * @author user
 */
public class ClientController {
    
    public static boolean createClient(Clients clientToCreate){
        if(clientToCreate== null){
            return false;
        }
      
        return Clients.insert(clientToCreate);
    }
    public static boolean doesClientExist(String clientUserName){
        if(Clients.retrieve(clientUserName)==null){
            return false;
        }return true;
    }
    public static Clients getClient(String clientUserName){
        return Clients.retrieve(clientUserName);
    }
    public static boolean updateClient(String clientUserName,Clients updatedClient){
        return Clients.update(updatedClient, clientUserName);
    }
}

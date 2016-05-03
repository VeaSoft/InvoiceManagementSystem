/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.CurrentUser;
import Model.NumeruoUser;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class UserAcctController {
    public static boolean addNewUser(NumeruoUser userToAdd){
        return NumeruoUser.insert(userToAdd);
    }
    public static NumeruoUser getUser(String userName){
        return NumeruoUser.retrieve(userName);
    }
    public static boolean updateUser(String userName, NumeruoUser editedUser){
        return NumeruoUser.update(userName, editedUser);
    }
    public static LinkedList<NumeruoUser> getAllUsers(){
        return NumeruoUser.retrieveAll();
    }
    public static boolean changePassword(String newPassword){
        NumeruoUser changedUser= new NumeruoUser();
        changedUser.setUserDepartment(CurrentUser.userDepartment);
        changedUser.setUserFullName(CurrentUser.userFullName);
        changedUser.setUserName(CurrentUser.userName);
        changedUser.setUserPassword(newPassword);
        return updateUser(CurrentUser.userName.trim(),changedUser);
    }
}

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
public class LoginController {

    public static boolean login(NumeruoUser myUser) {
        try{
        if (validate(myUser.getUserName(), myUser.getUserPassword())) {
            NumeruoUser mlUser = NumeruoUser.retrieve(myUser.getUserName());

            if (mlUser == null) {

                return false;
            } else {

                //compares password and department ot check its available
                if ((mlUser.getUserPassword().equals(myUser.getUserPassword()))) {
                    if (mlUser.getUserDepartment().equals(myUser.getUserDepartment())) {
                        CurrentUser.userName= mlUser.getUserName();
                        CurrentUser.userPassword= mlUser.getUserPassword();
                        CurrentUser.userDepartment=mlUser.getUserDepartment();
                        CurrentUser.userFullName=mlUser.getUserFullName();
                        return true;
                    }

                }
            }

        }
        }catch(NullPointerException ex)
        {
        }

        return false;
    }

    private static boolean validate(String userName, String userPassword) {
        LinkedList<String> mValues = new LinkedList<>();
        mValues.add(userName);
        mValues.add(userPassword);
        return Validator.validate(mValues);
    }
    public static void logOut(){
        CurrentUser.userName="";
        CurrentUser.userDepartment="";
        CurrentUser.userFullName="";
        CurrentUser.userPassword="";
    }

}

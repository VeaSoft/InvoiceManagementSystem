/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.List;

/**
 *
 * @author user
 */
public class Validator {
    public static boolean validate(List<String> valuesToValidate){
        if(valuesToValidate==null){
            return false;
        }
        for (String value : valuesToValidate) {
            if (value.contains("*") || value.contains("=") || value.contains("/") || value.contains("\\")) {
                return false;
            }
        }
        return true;
    }
    
}

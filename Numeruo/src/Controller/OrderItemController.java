/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import Model.Items;
import Model.OrderItems;
import java.util.LinkedList;
/**
 *
 * @author user
 */
public class OrderItemController {
    public static boolean storeAllOrderItems(LinkedList<OrderItems> itemsToStore){
        if(itemsToStore == null){
            return false;
        }
         
        for(OrderItems myItems: itemsToStore){
           
           int nextId= getAutoIncrementedId();
            System.out.println("The ordernext id is: "+nextId);
             System.out.println("Error with false"+ myItems.getQuantityOrdered());
            myItems.setOrderItemsId(nextId);
            if(Items.reduceQuantity(myItems.getItemId(), myItems.getQuantityOrdered())==false){
                 
                return false;
            }
            if(OrderItems.insert(myItems)==false)
            {
               
                return false;
            }
            
        }
        return true;
    }
    public static int getAutoIncrementedId(){
        return OrderItems.getNextOrderItemsId();
        
    }
    public static LinkedList<OrderItems> getOrderItemsBasedOnSalesID(int salesId){
        return OrderItems.retrieveBasedOnSalesId(salesId);
    }
        
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Items;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class ItemController {
    
    public static LinkedList<Items> getAllItems(){
        return Items.retrieveAllItems();
    }
    public static Items getItem(int itemId){
        Items requestedItem= Items.retrieve(itemId);
        return requestedItem;
    }
    public static int getNextId(){
        return Items.getNextId();
    }
    public static boolean createItem(Items itemToCreate){
        if(itemToCreate==null){
            return false;
        }
        return Items.insert(itemToCreate);
    }
    public static LinkedList<Items> getItemsWithLowQuantity(){
        LinkedList<Items> allItems= getAllItems();
        LinkedList<Items> queriedItems= new LinkedList<>();
        if(allItems==null){
            return null;
        }
        for(Items myItem:allItems){
            if(myItem.getQuantityAvailable()<=15){
                queriedItems.add(myItem);
            }
        }
        return queriedItems;
    }
    public static boolean delete(int itemId){
        return Items.delete(itemId);
    }
    public static boolean edit(int itemId,Items itemsToEdit){
        return Items.update(itemId, itemsToEdit);
    }
}

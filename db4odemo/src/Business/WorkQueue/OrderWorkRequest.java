/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Karthik
 */
public class OrderWorkRequest extends WorkRequest{
    private String id;
    
    private List<ItemQuantity> itemsWithQuantityList = new ArrayList<ItemQuantity>();
    
    private String customerFeedback;
    
    public OrderWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public ItemQuantity addItem(ItemQuantity itemQuantity){
        itemsWithQuantityList.add(itemQuantity);
        return itemQuantity;
    } 

    public List<ItemQuantity> getItemsWithQuantityList() {
        return itemsWithQuantityList;
    }

    public void setItemsWithQuantityList(List<ItemQuantity> itemsWithQuantityList) {
        this.itemsWithQuantityList = itemsWithQuantityList;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    
}

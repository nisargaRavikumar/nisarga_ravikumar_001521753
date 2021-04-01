/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Restaurant.dishes;

/**
 *
 * @author Karthik
 */
public class ItemQuantity {
    dishes dish;
    int quant;
    
public ItemQuantity(dishes dish, int quant) {
        this.dish = dish;
        this.quant = quant;
    }    

    public dishes getDish() {
        return dish;
    }

    public void setDish(dishes dish) {
        this.dish = dish;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

}

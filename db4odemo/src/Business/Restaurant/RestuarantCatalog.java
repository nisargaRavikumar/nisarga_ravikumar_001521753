/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author nisar
 */
public class RestuarantCatalog {
    ArrayList<dishes> dishesList = new ArrayList<dishes>();

    public ArrayList<dishes> getDishesList() {
        return dishesList;
    }

    public void setDishesList(ArrayList<dishes> dishesList) {
        this.dishesList = dishesList;
    }
    public void addtodishesList(dishes dish){
        dishesList.add(dish);
    }
    public void removefromdishesList(dishes dish){
        dishesList.remove(dish);
    }
}

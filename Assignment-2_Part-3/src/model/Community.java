/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nisar
 */
public class Community {
    public String Comunityname;
    public House house;
    public ArrayList<House> houselist;
    
    public Community(){
        this.houselist= new ArrayList<House>();
        
       
    }
    
    public void addHouses(House house){
        this.house= house;
        this.houselist.add(house);
    }

    public String getComunityname() {
        return Comunityname;
    }

    public void setComunityname(String Comunityname) {
        this.Comunityname = Comunityname;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public ArrayList<House> getHouselist() {
        return houselist;
    }

    public void setHouselist(ArrayList<House> houselist) {
        this.houselist = houselist;
    }
    
}

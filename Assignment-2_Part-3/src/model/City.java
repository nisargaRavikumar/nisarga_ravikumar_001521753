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
public class City {
    public String Cityname;
    public Community community;
    public ArrayList<Community> communities;
    
    public City(){
        this.communities= new ArrayList<Community>();       
    }
    
    public void addCommunities(Community community){
        this.community= community;
        this.communities.add(community);
    }

    public String getCityname() {
        return Cityname;
    }

    public void setCityname(String Cityname) {
        this.Cityname = Cityname;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    
}

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
public class EncounterHistory {
    public Encounter encounter;
    public ArrayList<Encounter> enHistory;
    
    public EncounterHistory(){
        this.enHistory = new ArrayList<Encounter>();
    }
    
    public void addEcounter(Encounter encounter){
        this.encounter = encounter;
        this.enHistory.add(encounter);
        
        
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    

    public ArrayList<Encounter> getEnHistory() {
        return enHistory;
    }

    public void setEnHistory(ArrayList<Encounter> enHistory) {
        this.enHistory = enHistory;
    }
    
    
}

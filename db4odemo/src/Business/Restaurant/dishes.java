/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author Karthik
 */
public class dishes {
    private String Name;
    private double Amount;
    
    public dishes(String Name, double Amount) {
        this.Amount = Amount;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    @Override
    public String toString() {
        return this.Name;
    }
    
}

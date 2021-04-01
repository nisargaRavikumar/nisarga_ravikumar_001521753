/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan extends UserAccount {
    private String Name;
    private String Phone;
    public DeliveryMan(String userName, String password, String Name, String Phone) {
        this.Name = Name;
        this.Phone = Phone;
        setUsername(userName);
        setPassword(password);
        setRole(new DeliverManRole());
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
}

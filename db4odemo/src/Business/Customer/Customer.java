/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{
    private String Name;
    private String Address;
    private String Phone;
    
    public Customer(String userName,String Name, String Password, String Address, String Phone) {
        this.Address = Address;
        this.Name = Name;
        this.Phone = Phone;
        setUsername(Name);
        setPassword(Password);
        setRole(new CustomerRole());
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
}

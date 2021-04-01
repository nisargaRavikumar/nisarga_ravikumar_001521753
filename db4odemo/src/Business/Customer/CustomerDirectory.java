/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    ArrayList<Customer> CustomerDirectory = new ArrayList<Customer>();

    public ArrayList<Customer> getCustomerDirectory() {
        return CustomerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> CustomerDirectory) {
        this.CustomerDirectory = CustomerDirectory;
    }
    public void addtoCustomerDirectory(Customer customer) {
        CustomerDirectory.add(customer);
    }
    public void removefromCustomerDirectory(Customer customer) {
        CustomerDirectory.remove(customer);
    }
}

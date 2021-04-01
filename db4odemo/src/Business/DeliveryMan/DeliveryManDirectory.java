/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> DeliveryManDirectory = new ArrayList<DeliveryMan>();

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return DeliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> DeliveryManDirectory) {
        this.DeliveryManDirectory = DeliveryManDirectory;
    }
    public void addtoDeliveryManDirectory(DeliveryMan DeliveryMan) {
        DeliveryManDirectory.add(DeliveryMan);
    }
    public void removefromDeliveryManDirectory(DeliveryMan DeliveryMan) {
        DeliveryManDirectory.remove(DeliveryMan);
    }
}

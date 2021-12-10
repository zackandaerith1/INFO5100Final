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

    private ArrayList<DeliveryMan> deliveryManDirectory;

    public DeliveryManDirectory() {
        deliveryManDirectory = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public DeliveryMan newDeliveryMan(String name, String firstname, String lastname, String address, String email, String phoneNumber) {
        DeliveryMan deliveryMan = new DeliveryMan(name, firstname, lastname, address, email, phoneNumber);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }

    public void removeDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManDirectory.remove(deliveryMan);
    }
}

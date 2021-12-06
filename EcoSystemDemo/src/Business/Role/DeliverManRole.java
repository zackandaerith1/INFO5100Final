/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Profile.ProfileDirectory;
import Business.Order.OrderDirectory;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import javax.swing.JPanel;
import ui.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author yibin
 */
public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,
            CoordinatorDirectory customerDirectory, ShelterDirectory restaurantDirectory,
            DeliveryManDirectory deliveryManDirectory, ProfileDirectory menuDirectory, OrderDirectory orderDirectory, UserAccountDirectory userAccountDirectory) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer, account, business, deliveryManDirectory, orderDirectory);//To change body of generated methods, choose Tools | Templates.
    }

}

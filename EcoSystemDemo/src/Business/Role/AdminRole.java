/*
 * To change this template, choose Tools | Templates
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
import ui.ShelterAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author yibin
 */
public class AdminRole extends Role {

    //  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CoordinatorDirectory customerDirectory, ShelterDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, ProfileDirectory menuDirectory, OrderDirectory orderDirectory, UserAccountDirectory userAccountDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory);
    }

}

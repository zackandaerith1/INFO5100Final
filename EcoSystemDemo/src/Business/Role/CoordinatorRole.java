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
import ui.CoordinatorRole.CoordinatorAreaJPanel;

/**
 *
 * @author yibin
 */
public class CoordinatorRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CoordinatorDirectory coordinatorDirectory, ShelterDirectory shelterDirectory, DeliveryManDirectory deliveryManDirectory, ProfileDirectory menuDirectory, OrderDirectory orderDirectory, UserAccountDirectory userAccountDirectory) {
        return new CoordinatorAreaJPanel(userProcessContainer, account, business, coordinatorDirectory, shelterDirectory, deliveryManDirectory, menuDirectory, orderDirectory);
    }

}

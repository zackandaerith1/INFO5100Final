/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Profile.ProfileDirectory;
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
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CoordinatorDirectory customerDirectory, ShelterDirectory shelterDirectory, DeliveryManDirectory deliveryManDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory, UserAccountDirectory userAccountDirectory, MenuDirectory menuDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business, customerDirectory, shelterDirectory, deliveryManDirectory, profileDirectory, orderDirectory, menuDirectory);
    }

}

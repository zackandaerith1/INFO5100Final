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

/**
 *
 * @author yibin
 */
public abstract class Role {

    public enum RoleType {
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,
            CoordinatorDirectory customerDirectory, ShelterDirectory restaurantDirectory,
            DeliveryManDirectory deliveryManDirectory, ProfileDirectory menuDirectory, OrderDirectory oderDirectory, UserAccountDirectory userAccountDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}

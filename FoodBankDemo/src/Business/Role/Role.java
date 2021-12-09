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

/**
 *
 * @author yibin
 */
public abstract class Role {
<<<<<<<< HEAD:EcoSystemDemo/src/Business/Role/Role.java

    public enum RoleType {
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");

========
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        AccountRole("Accountor"),
        CommRole("Communitator"),
        DistriRole("Distributor"),
        AnalyRole("Analyzter");
        
>>>>>>>> main:FoodBankDemo/src/Business/Role/Role.java
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

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CoordinatorDirectory customerDirectory, ShelterDirectory shelterDirectory, DeliveryManDirectory deliveryManDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory, UserAccountDirectory userAccountDirectory, MenuDirectory menuDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}

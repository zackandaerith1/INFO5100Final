/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Shelter;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Shelter.ArrangementOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import javax.swing.JPanel;
import ui.CoordinatorRole.CoordinatorAreaJPanel;

/**
 *
 * @author yibin
 */
public class CoordinatorRole extends Role {


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new CoordinatorAreaJPanel(userProcessContainer, account, (ArrangementOrganization)organization, enterprise);
       
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new CoordinatorAreaJPanel(userProcessContainer, account, (RegistrationOrganization)organization, enterprise);
       
    }
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CoordinatorDirectory coordinatorDirectory, ShelterDirectory shelterDirectory, DeliveryManDirectory deliveryManDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory, UserAccountDirectory userAccountDirectory, MenuDirectory menuDirectory) {
        return new CoordinatorAreaJPanel(userProcessContainer, account, business, coordinatorDirectory, shelterDirectory, deliveryManDirectory, profileDirectory, orderDirectory, menuDirectory);
    }

}

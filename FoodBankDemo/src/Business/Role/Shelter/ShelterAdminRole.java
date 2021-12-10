package Business.Role.Shelter;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import ui.ShelterAdminRole.AdminWorkAreaJPanel;

import javax.swing.*;
import ui.ShelterAdminRole.ShelterAdminWorkAreaJPanel;

/**
 * @author Zheng Fang
 */

public class ShelterAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ShelterAdminWorkAreaJPanel(userProcessContainer, business, coordinatorDirectory, shelterDirectory, deliveryManDirectory, userAccountDirectory);
    }
}

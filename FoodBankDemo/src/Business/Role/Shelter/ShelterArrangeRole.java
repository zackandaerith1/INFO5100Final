package Business.Role.Shelter;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import ui.ShelterArrangerRole.AdminWorkAreaJPanel;

import javax.swing.*;

/**
 * @author Zheng Fang
 */

public class ShelterArrangeRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel();
    }
}

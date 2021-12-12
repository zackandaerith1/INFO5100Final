package Business.Role.Volunteer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Volunteer.VolunteerOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.VolunteerAdminWorkArea.VolunteerAdminWorkAreaJPanel;

/**
 *
 * @author jaydenwjc
 */
public class VolunteerAdminRole extends Role {

    public VolunteerAdminRole() {
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VolunteerAdminWorkAreaJPanel(userProcessContainer, account, (VolunteerOrganization) organization, enterprise);
    }
}

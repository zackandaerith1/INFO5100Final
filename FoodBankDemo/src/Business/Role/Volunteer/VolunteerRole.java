/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Volunteer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Volunteer.VolunteerOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.VolunteerRole.VolunteerWorkAreaJPanel;

/**
 *
 * @author zhengfang
 */
public class VolunteerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VolunteerWorkAreaJPanel(userProcessContainer, account, (VolunteerOrganization)organization, enterprise);
    }
    
    
}

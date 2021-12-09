/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Shelter.ArrangementOrganization;
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


}

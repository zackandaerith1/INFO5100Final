/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RegistrationRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yibing
 */
public class RegistrationOrganization extends Organization {

    public RegistrationOrganization() {
        super(Organization.Type.Registration.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RegistrationRole());
        return roles;
    }

}

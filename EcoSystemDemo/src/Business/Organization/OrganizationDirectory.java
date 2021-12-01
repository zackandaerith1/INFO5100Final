/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author yibing
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Arrangement.getValue())) {
            organization = new ArrangementOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Registration.getValue())) {
            organization = new RegistrationOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Foodbank.AnalysisOrganization;
import Business.Organization.Foodbank.CommunicationOrganization;
import Business.Organization.Foodbank.DistributionOrganization;
import Business.Organization.Funding.AccountOrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.AnalyDepart.getValue())){
            organization = new AnalysisOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CommDepart.getValue())){
            organization = new CommunicationOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DistriDepart.getValue())){
            organization = new DistributionOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Account.getValue())){
            organization = new AccountOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
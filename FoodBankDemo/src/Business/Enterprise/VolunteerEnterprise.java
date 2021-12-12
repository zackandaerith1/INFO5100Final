/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.EcoSystem;
import Business.Profile.VolunteerDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class VolunteerEnterprise extends Enterprise {
    private static EcoSystem business;
    private VolunteerDirectory volunteerdirectory;
    private UserAccount userAccount;

    public VolunteerEnterprise(String name, EnterpriseType type) {
        super(name, type);
        
        this.volunteerdirectory = new VolunteerDirectory();
        this.userAccount = new UserAccount();
    }


    

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
        
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        VolunteerEnterprise.business = business;
    }

    public VolunteerDirectory getVolunteerdirectory() {
        return volunteerdirectory;
    }

    public void setVolunteerdirectory(VolunteerDirectory volunteerdirectory) {
        this.volunteerdirectory = volunteerdirectory;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Funding;

import Business.Organization.Organization;
import Business.Role.Funding.AccountRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class AccountOrganization extends Organization{
    private int funding;
    
    public AccountOrganization() {
        super(Organization.Type.Account.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountRole());
        return roles;
    }
    
    
}

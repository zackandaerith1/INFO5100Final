/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Profile.Donator;
import Business.Profile.DonatorDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class FundingEnterprise extends Enterprise{
    
    private DonatorDirectory Dlist;

    public FundingEnterprise(String name, EnterpriseType type) {
        super(name, type);
        this.Dlist = new DonatorDirectory();
    }

    public DonatorDirectory getDlist() {
        return Dlist;
    }

    public void setDlist(DonatorDirectory Dlist) {
        this.Dlist = Dlist;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}

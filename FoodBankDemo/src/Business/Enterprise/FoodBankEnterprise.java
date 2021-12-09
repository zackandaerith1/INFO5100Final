/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class FoodBankEnterprise extends Enterprise{

    public FoodBankEnterprise(String name, EnterpriseType type) {
        super(name, type);
    }

    FoodBankEnterprise(String name) {
        super(name,EnterpriseType.FoodBank);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}

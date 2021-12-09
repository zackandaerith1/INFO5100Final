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
 * @author yibing
 */
public class ShelterEnteriprise extends Enterprise {

    public ShelterEnteriprise(String name, EnterpriseType type) {
        super(name, type);
    }

    ShelterEnteriprise(String name) {
        super(name, EnterpriseType.Shelter);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

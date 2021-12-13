/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.Volunteer.VolunteerDirectory;
import java.util.ArrayList;

/**
 *
 * @author zhengfang
 */
public class VolunteerEnterprise extends Enterprise {

    private VolunteerDirectory volunteerDirectory;

    public VolunteerEnterprise(String name) {
        super(name, EnterpriseType.Volunteer);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {

        return null;

    }

}

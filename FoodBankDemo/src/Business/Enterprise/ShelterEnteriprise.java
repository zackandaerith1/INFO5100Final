/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Profile.ProfileDirectory;
import Business.Role.Role;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author yibing
 */
public class ShelterEnteriprise extends Enterprise {
    private static EcoSystem business;
    private ShelterDirectory shelterDirectory;
    private CoordinatorDirectory coordinatorDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    private ProfileDirectory profileDirectory;
    private MenuDirectory menuDirectory;
    private UserAccount userAccount;

    public ShelterEnteriprise(String naem, Enterprise.Type type, ShelterDirectory shelterDirectory, CoordinatorDirectory coordinatorDirectory, DeliveryManDirectory deliveryManDirectory) {
        
        this.shelterDirectory = shelterDirectory;
        this.coordinatorDirectory = coordinatorDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }

    ShelterEnteriprise(String name) {
        super(name, EnterpriseType.Shelter);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

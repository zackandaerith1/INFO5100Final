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

    public ShelterEnteriprise(String name, Enterprise.Type type) {
        super(name, EnterpriseType.Shelter);
    
        this.shelterDirectory= new ShelterDirectory();
        this.coordinatorDirectory = new CoordinatorDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.orderDirectory = new OrderDirectory();
        this.profileDirectory = new ProfileDirectory();
        this.menuDirectory = new MenuDirectory();
        this.userAccount = new UserAccount();
        
        
   
    }

    ShelterEnteriprise(String name) {
        super(name, EnterpriseType.Shelter);
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        ShelterEnteriprise.business = business;
    }

    public ShelterDirectory getShelterDirectory() {
        return shelterDirectory;
    }

    public void setShelterDirectory(ShelterDirectory shelterDirectory) {
        this.shelterDirectory = shelterDirectory;
    }

    public CoordinatorDirectory getCoordinatorDirectory() {
        return coordinatorDirectory;
    }

    public void setCoordinatorDirectory(CoordinatorDirectory coordinatorDirectory) {
        this.coordinatorDirectory = coordinatorDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public ProfileDirectory getProfileDirectory() {
        return profileDirectory;
    }

    public void setProfileDirectory(ProfileDirectory profileDirectory) {
        this.profileDirectory = profileDirectory;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

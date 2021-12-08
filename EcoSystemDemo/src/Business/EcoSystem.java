/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Organization.Organization;
import Business.Profile.ProfileDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ShelterDirectory shelterDirectory;
    private CoordinatorDirectory coordinatorDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    private ProfileDirectory profileDirectory;
    private MenuDirectory menuDirectory;
    private UserAccount userAccount;

    public EcoSystem(ShelterDirectory shelterDirectory, CoordinatorDirectory coordinatorDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.shelterDirectory = shelterDirectory;
        this.coordinatorDirectory = coordinatorDirectory;
        this.deliveryManDirectory = deliveryManDirectory;

    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
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

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        coordinatorDirectory = new CoordinatorDirectory();
        shelterDirectory = new ShelterDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        profileDirectory = new ProfileDirectory();
        orderDirectory = new OrderDirectory();
        menuDirectory = new MenuDirectory();

    }

    public boolean checkIfUserIsUnique(String userName) {

        return false;
    }

}

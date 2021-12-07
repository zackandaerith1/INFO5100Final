/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author yibing
 */
public class Menu {

    private String itemName;
    private int qty;
    private String shelterName;

    public Menu(String itemName, int qty, String shelterName) {
        this.itemName = itemName;
        this.qty = qty;
        this.shelterName = shelterName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    @Override
    public String toString() {
        return itemName;
    }

}

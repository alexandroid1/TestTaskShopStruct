package Struct;

import Struct.clothes.OuterWear;

import java.util.List;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class Shop {
    
    private List<RackForClothes> rackForClothesList;

    public Shop(List<RackForClothes> rackForClothesList) {
        this.rackForClothesList = rackForClothesList;
    }

    public List<RackForClothes> getRackForClothesList() {
        return rackForClothesList;
    }

    public void setRackForClothesList(List<RackForClothes> rackForClothesList) {
        this.rackForClothesList = rackForClothesList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                ", rackForClothesList=" + rackForClothesList +
                '}';
    }
}

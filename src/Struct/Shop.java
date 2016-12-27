package Struct;

import Struct.clothes.OuterWear;

import java.util.List;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class Shop {

    private RackForClothes rackForClothes;

    private List<RackForClothes> rackForClothesList;

    public Shop(RackForClothes rackForClothes) {
        this.rackForClothes = rackForClothes;
    }

    public Shop(List<RackForClothes> rackForClothesList) {
        this.rackForClothesList = rackForClothesList;
    }

    public RackForClothes getRackForClothes() {
        return rackForClothes;
    }

    public void setRackForClothes(RackForClothes rackForClothes) {
        this.rackForClothes = rackForClothes;
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
                "rackForClothes=" + rackForClothes +
                ", rackForClothesList=" + rackForClothesList +
                '}';
    }
}

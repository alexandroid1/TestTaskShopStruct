package Struct;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class Shop {

    private RackForClothes rackForClothes;

    public Shop(RackForClothes rackForClothes) {
        this.rackForClothes = rackForClothes;
    }

    public RackForClothes getRackForClothes() {
        return rackForClothes;
    }

    public void setRackForClothes(RackForClothes rackForClothes) {
        this.rackForClothes = rackForClothes;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "rackForClothes=" + rackForClothes +
                '}';
    }
}

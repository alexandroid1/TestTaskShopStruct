import Struct.RackForClothes;
import Struct.Shop;
import Struct.clothes.Coat;
import Struct.clothes.Coats;
import Struct.clothes.OuterWear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<RackForClothes> lstRackForClothes = new ArrayList<RackForClothes>();
        lstRackForClothes.add(new RackForClothes(new OuterWear(new Coats(new Coat("red")))));
        lstRackForClothes.add(new RackForClothes(new OuterWear(new Coats(new Coat("green")))));
        lstRackForClothes.add(new RackForClothes(new OuterWear(new Coats(new Coat("blue")))));

        Shop shop = new Shop(lstRackForClothes);
        System.out.println(shop.toString());
    }
}

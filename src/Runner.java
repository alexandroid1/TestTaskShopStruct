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
        Shop shop = new Shop(new RackForClothes(new OuterWear(new Coats(new Coat("blue")))));
        System.out.println(shop.toString());
    }
}

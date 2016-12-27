import Struct.WhoLivesIn;
import Struct.Flate;
import Struct.clothes.Dog;
import Struct.clothes.Resident;
import Struct.clothes.ResidentApartments;

public class Runner {

    public static void main(String[] args) {
        Flate flate = new Flate(new WhoLivesIn(new ResidentApartments(new Resident(new Dog("grey")))));
        System.out.println(flate.toString());
    }
}

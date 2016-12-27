package Struct.clothes;

import java.util.*;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class Coats {

    private List<Coat> coatList;

    private static final List<String> color = Arrays.asList("red", "blue", "green");

    public Coats() {

    }

    public Coats(Coat coat) {
        this.coatList = new ArrayList<>();
        coatList.add(coat);
    }

    public static List<String> getColor() {
        return color;
    }

    public List<Coat> getCoat() {
        return coatList;
    }

    public void setCoat(List<Coat> coat) {
        this.coatList = coat;
    }

    @Override
    public String toString() {
        return "Coats{" +
                "coat=" + coatList.toString() +
                '}';
    }
}

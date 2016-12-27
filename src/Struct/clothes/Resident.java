package Struct.clothes;

import java.util.*;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class Resident {

    private List<Dog> dogList;

    public List<Dog> getDogList() {
        return dogList;
    }

    private boolean hasADog = true;

    public Resident() {
    }

    public Resident(Dog dog) {
        this.dogList = new ArrayList<>();
        dogList.add(dog);
    }

    public List<Dog> getCoat() {
        return dogList;
    }

    public void setCoat(List<Dog> dog) {
        this.dogList = dog;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public boolean isHasADog() {
        return hasADog;
    }

    public void setHasADog(boolean hasADog) {
        this.hasADog = hasADog;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "dogList=" + dogList +
                ", hasADog=" + hasADog +
                '}';
    }
}

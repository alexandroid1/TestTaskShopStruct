package Struct;

import Struct.clothes.ResidentApartments;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class WhoLivesIn {

    private ResidentApartments residentApartments;

    public WhoLivesIn(ResidentApartments residentApartments) {
        this.residentApartments = residentApartments;
    }

    public ResidentApartments getResidentApartments() {
        return residentApartments;
    }

    public void setResidentApartments(ResidentApartments residentApartments) {
        this.residentApartments = residentApartments;
    }

    @Override
    public String toString() {
        return "WhoLivesIn{" +
                "residentApartments=" + residentApartments +
                '}';
    }
}

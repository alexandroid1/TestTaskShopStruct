package Struct.clothes;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class ResidentApartments {

    private SeniorCitizen seniorCitizen;
    private Resident resident;

    public ResidentApartments(SeniorCitizen seniorCitizen, Resident resident) {
        this.seniorCitizen = seniorCitizen;
        this.resident = resident;
    }

    public ResidentApartments(Resident resident) {
        this.resident = resident;
    }

    public ResidentApartments(SeniorCitizen seniorCitizen) {
        this.seniorCitizen = seniorCitizen;
    }

    public SeniorCitizen getSeniorCitizen() {
        return seniorCitizen;
    }

    public void setSeniorCitizen(SeniorCitizen seniorCitizen) {
        this.seniorCitizen = seniorCitizen;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    @Override
    public String toString() {
        return "ResidentApartments{" +
                "seniorCitizen=" + seniorCitizen +
                ", resident=" + resident +
                '}';
    }
}

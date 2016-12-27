package Struct;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class Flate {

    private WhoLivesIn whoLivesIn;

    public Flate(WhoLivesIn whoLivesIn) {
        this.whoLivesIn = whoLivesIn;
    }

    public WhoLivesIn getWhoLivesIn() {
        return whoLivesIn;
    }

    public void setWhoLivesIn(WhoLivesIn whoLivesIn) {
        this.whoLivesIn = whoLivesIn;
    }

    @Override
    public String toString() {
        return "Flate{" +
                "whoLivesIn=" + whoLivesIn +
                '}';
    }
}

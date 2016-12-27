package Struct.clothes;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class OuterWear {

    private Jackets jackets;
    private Coats coats;

    public OuterWear(Jackets jackets, Coats coats) {
        this.jackets = jackets;
        this.coats = coats;
    }

    public OuterWear(Coats coats) {
        this.coats = coats;
    }

    public OuterWear(Jackets jackets) {
        this.jackets = jackets;
    }

    public Jackets getJackets() {
        return jackets;
    }

    public void setJackets(Jackets jackets) {
        this.jackets = jackets;
    }

    public Coats getCoats() {
        return coats;
    }

    public void setCoats(Coats coats) {
        this.coats = coats;
    }

    @Override
    public String toString() {
        return "OuterWear{" +
                "jackets=" + jackets +
                ", coats=" + coats +
                '}';
    }
}

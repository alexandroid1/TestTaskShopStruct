package Struct.clothes;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class Coat {

    private String Color;

    public Coat() {
    }

    public Coat(String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Coat{" +
                "Color='" + Color + '\'' +
                '}';
    }
}

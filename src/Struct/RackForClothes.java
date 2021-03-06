package Struct;

import Struct.clothes.Coat;
import Struct.clothes.OuterWear;

import java.util.List;

/**
 * Created by Oleksandr on 27.12.2016.
 */
public class RackForClothes {

    private OuterWear outerWear;

    public RackForClothes(OuterWear outerWear) {
        this.outerWear = outerWear;
    }

    public OuterWear getOuterWear() {
        return outerWear;
    }

    public void setOuterWear(OuterWear outerWear) {
        this.outerWear = outerWear;
    }

    @Override
    public String toString() {
        return "RackForClothes{" +
                "outerWear=" + outerWear +
                '}';
    }
}

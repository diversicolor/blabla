package pl.infoshare.l12.zad1;

import java.util.Objects;

public class Chair() {

    private int numberOflegs;
    private String material;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return numberOflegs == chair.numberOflegs &&
                Objects.equals(material, chair.material);
    }

    @Override
    public int hashCode() {
        return 1;
    }


}


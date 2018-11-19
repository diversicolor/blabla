package pl.infoshare.l11;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T, K> {

    private T number;

    private List<K> somelist = new ArrayList<>();

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public void addToList(K element){
        somelist.add(element);
    }
}

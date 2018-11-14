package pl.infoshare.l10.zad3;

import java.util.ArrayList;

public class MyList<E> extends ArrayList<E> {

    @Override
    public E get(int index) {
        return super.get(0);
    }
}

package pl.infoshare.l12;

import pl.infoshare.l12.zad1.Chair;

import java.util.Map;
import java.util.TreeMap;

public class Zad1 {

    public static void main (String[] args){

        Chair ch1 = new Chair();
        Chair ch2 = new Chair();

        Map<Chair, String> furniture = new TreeMap<>();

         furniture.put(ch1, "chair 1");
         furniture.put(ch2, "chair 2");



    }
}

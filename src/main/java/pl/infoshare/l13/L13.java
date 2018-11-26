package pl.infoshare.l13;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L13 {

    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>();

        //Iteracja po mapie niekompletna

//        List<String> list = new ArrayList<>();
//        list.add("one");
//        list.add("two");
//        map.put(1, list);
//
//        for (Map.Entry<Integer, List<String>>,entry:map.entrySet()){
//
//
//                System.out.println("Dla klucza " + entry.getKey() + ":");
//
//            }
//
//    }
//
    }

    Multimap<Integer, String> multimap = HashMultimap.create();

}

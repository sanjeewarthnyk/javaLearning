package org.leetcode.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo4 {
    public static void main(String[] args) {
        List <String>str = new ArrayList<>();
        str.add("Kanishka");
        str.add("Amal");
        str.add("Lal");
        str.add("Thinuga");
        str.add("Rathnayake");

        Comparator comp = (o, t1) ->   String.valueOf(o).length()>String.valueOf(t1).length()?1:-1;

        Collections.sort(str,comp);

        System.out.println(str);

        str.forEach(s -> System.out.println(s));

    }
}

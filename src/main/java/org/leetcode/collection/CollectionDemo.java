package org.leetcode.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionDemo {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("A", 180);
        map.put("B", 19);
        map.put("C", 106);
        map.put("D", 190);
        map.put("E", 150);
        map.put("F", 130);

        Iterator itr = map.entrySet().iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

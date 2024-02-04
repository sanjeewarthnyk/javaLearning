package org.leetcode.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> arr =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int results = 0;

        //method 1
        /*for(int x: arr){
            if(x%2==0)
                results += x;
        }
        System.out.println(results);*/

        //method 2
       // arr.forEach(n-> System.out.println(n));

        /*Consumer<Integer> con = integer -> System.out.println(integer) ;

        arr.forEach(integer -> System.out.println(integer));*/
        Predicate<Integer> pre = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        /*Stream<Integer> s1 = arr.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Integer s3 = s2.reduce(0,(c, e)->c+e);

        System.out.println(s3);*/

        int resu = arr.stream()
                .filter(n -> n%2 == 0)
                .reduce(0,(c,e)->c+e);

        System.out.println(resu);
    }
}

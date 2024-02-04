package org.leetcode.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pupil{
    int age;
    String name;
    public Pupil(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CollectionDemo3 {
    public static void main(String[] args) {
        List<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil(7,"Thinuga" ));
        pupils.add(new Pupil(17,"Anish" ));
        pupils.add(new Pupil(4,"Minuga" ));
        pupils.add(new Pupil(41,"Saranga" ));

        Comparator com = (o, t1) -> {
                Pupil p1 = (Pupil) o;
                Pupil p2 = (Pupil) t1;
               return (p1.getAge() > p2.getAge())?1:-1;
            };
        Collections.sort(pupils, com);
        System.out.println(pupils);

    }
}

package org.leetcode.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable{
    int age;
    String name;
    public Student(int age, String name){
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

    @Override
    public int compareTo(Object that) {
        Student s = (Student) that;
        if (this.getAge() < s.getAge())
            return 1;
        else
            return -1;
    }
}

public class CollectionDemo2 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(7,"Thinuga" ));
        students.add(new Student(17,"Anish" ));
        students.add(new Student(4,"Minuga" ));
        students.add(new Student(41,"Saranga" ));

        Collections.sort(students);

        for(Student s: students){
            System.out.println(s.getAge());
        }




    }
}

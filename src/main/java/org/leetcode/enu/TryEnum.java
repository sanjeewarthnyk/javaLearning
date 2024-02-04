package org.leetcode.enu;


enum Status{
    failed, pending, success,
}
public class TryEnum {
    public static void main(String[] args) {

        Status s = Status.success;

        System.out.println(s+" : "+s.ordinal());

        for(Status x : Status.values()){
            System.out.println(x+" : "+x.ordinal());
        }


    }
}

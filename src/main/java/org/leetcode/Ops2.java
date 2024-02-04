package org.leetcode;

class Telephone{

    Telephone(String name, String product){
        System.out.println("In the constructor");
        this.name = name;
        this.product = product;
    }
    static{
        System.out.println("In the static block");
        network = "Optus";
    }
    String name;
    String product;
    static String network;

    void show(){
        System.out.println("Name :"+name);
        System.out.println("Product :"+product);
        System.out.println("Network :"+network);
    }

    static void showNetwork(){
        System.out.println("Network :::"+network);
    }
}

public class Ops2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.leetcode.Telephone");
        Telephone t1 = new Telephone("san", "Samsung");
        Telephone t2 = new Telephone("Pan", "apple");
        t1.show();
        t2.show();
        Telephone.showNetwork();
    }
}

package org.leetcode.threads;

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hey");
            try{
                Thread.sleep(10);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Boy...");
            try{
                Thread.sleep(10);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

        obj1.run();
        try{
            Thread.sleep(5);
        }catch (Exception e){
            System.out.println(e);
        }
        obj2.run();

    }
}

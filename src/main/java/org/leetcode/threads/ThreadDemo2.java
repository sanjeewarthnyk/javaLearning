package org.leetcode.threads;

import javafx.stage.FileChooser;

class X implements Runnable{
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

class Y implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Boy..");
            try{
                Thread.sleep(10);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) throws Exception {
        Runnable obj3 = new X();
        Runnable obj4 = new Y();

        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();
        t1.run();
        Thread.sleep(5);
        t2.run();


    }
}

package org.leetcode.threads;

class Counter{
    int i=0;
    public synchronized int count(){
        return i++;
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        Runnable obj7 = () -> {
            for(int x=0;x<10000;x++){
                c.count();
            }
        };

        Runnable obj8 = () ->{
            for(int y=0;y<10000;y++){
                c.count();
            }
        };

        Thread t1 = new Thread(obj7);
        Thread t2 = new Thread(obj8);
        t1.start();
        t2.start();
        t1.run();
        t2.run();
        t1.join();
        t2.join();

        System.out.println(c.count());


    }
}

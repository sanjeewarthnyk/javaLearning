package org.leetcode.threads;

public class ThreadDemo3 {
    public static void main(String[] args) throws Exception{
        Runnable obj5 = () -> {
                for(int i=0;i<100;i++){
                    System.out.println("Hey");
                    try{
                        Thread.sleep(10);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
        };


       Runnable obj6 = ()->{
           for(int i=0;i<100;i++){
               System.out.println("BBOOYY...");
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }

       };
        Thread t3 = new Thread(obj5);
        Thread t4 = new Thread(obj6);
        t3.start();
        t4.start();
        t3.run();
        Thread.sleep(5);
        t4.run();
    }
}

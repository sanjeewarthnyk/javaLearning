package org.leetcode.innercls;

public class Imp {
    public static void main(String[] args) {
        SUV sixW = new SUV(){
            public void sixWheeler(){
                System.out.println("Inside SixWheeler");
            }
        };

        sixW.sixWheeler();

        SUV.VipFor vip = sixW.new VipFor();

        vip.protect();

        SUV.VipFor vip2 = sixW.new VipFor();

    }

}

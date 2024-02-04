package org.leetcode.innercls;

import jdk.nashorn.internal.ir.annotations.Ignore;

public abstract class SUV extends Car{
    @Override
    public void fourWheelDrive() {
        System.out.println("In four wheel mode");
    }

    public abstract void sixWheeler();

    class VipFor{
        public void protect(){
            System.out.println("In the shield mode");
        }
    }
}



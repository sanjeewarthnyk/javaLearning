package org.leetcode.lambda;

import com.sun.tracing.dtrace.FunctionAttributes;

@FunctionalInterface
interface A{
    public void show();
}

@FunctionalInterface
interface C{
    public int returnSquare(int i);
}

class B implements A{
    @Override
    public void show() {

    }
}
public class Demo {
    public static void main(String[] args) {
        A obj1 = new B();

        A obj2 = new A() {
            @Override
            public void show() {
                System.out.println("In Implemented show anonymous class");
            }
        };
        obj2.show();

        A obj3 = () ->{
                System.out.println("In lambda exp1");
            };
        obj3.show();

        A obj4 = () -> System.out.println("In lambda exp2");
        obj4.show();

        C objC1 = i -> i*i;

        System.out.println("Square : "+objC1.returnSquare(5));
    }

}

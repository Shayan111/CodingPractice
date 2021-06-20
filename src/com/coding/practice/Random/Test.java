package com.coding.practice.Random;

public class Test
{
    public static void main(String[] args)
    {
        MyInterface obj = new MyInterfaceImpl();
        obj.performThis();
        System.out.println(obj.performThat(5));
        obj.performRandomOp();
        MyInterface.performAnotherOp();
    }
}

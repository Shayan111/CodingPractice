package com.coding.practice.Random;

public class MyInterfaceImpl implements  MyInterface
{

    @Override
    public void performThis() {
        System.out.println("Performing a random operation.");
    }

    @Override
    public String performThat(int a) {
        return "Converted " + a + " to string.";
    }

    @Override
    public void performRandomOp() {
        System.out.println("Implementing class random op");
        MyInterface.super.performRandomOp();
    }
}

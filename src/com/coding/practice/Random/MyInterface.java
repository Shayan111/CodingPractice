package com.coding.practice.Random;

public interface MyInterface
{
    void performThis();

    String performThat(int a);

    default void performRandomOp()
    {
        System.out.println("Random Op");
    }

    static void performAnotherOp()
    {
        System.out.println("Another Op");
    }

}

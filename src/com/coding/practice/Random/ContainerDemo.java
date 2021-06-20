package com.coding.practice.Random;

public class ContainerDemo
{
    public static void performOperation()
    {
        Container<String> myContainer = new Container<>();
        Container<Integer> myAnotherContainer = new Container<>();

        myContainer.addEntity("Ausaf");
        myContainer.addEntity("Shayan");
        myContainer.addEntity("Nawaz");
        myContainer.addEntity("Saim");

        myAnotherContainer.addEntity(1);
        myAnotherContainer.addEntity(2);
        myAnotherContainer.addEntity(3);
        myAnotherContainer.addEntity(4);

        for (int i = 0; i < myContainer.getContainerSize(); i++)
        {
            System.out.println(myContainer.getEntity(i));
        }

        for (int i = 0; i < myAnotherContainer.getContainerSize() ; i++)
        {
            System.out.println(myAnotherContainer.getEntity(i));
        }

    }

    public static void main(String[] args)
    {
        ContainerDemo.performOperation();
    }


}

package com.coding.practice.Random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCollections {

    public static void main(String args[])
    {
        Set<Integer> values = new HashSet<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(2);
        Integer[] ab = {22, 45,33, 66, 55, 34,22, 45,77, 77};
        values.addAll(Arrays.asList(ab));
        System.out.print(values);


    }
}

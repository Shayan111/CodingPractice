package com.coding.practice.Miscellaneous;

//WAP to input a list of integers and display only unique values.

import java.sql.SQLOutput;
import java.util.*;

public class Unique
{

    public static Set<Integer> getUniqueValues(List<Integer> numbers)
    {
        return new HashSet<>(numbers);
    }

    public static void main(String[] args)
    {
        List<Integer> values = Arrays.asList(1,2,3,3,3,4,4,5,6,7,7);
        System.out.println(Unique.getUniqueValues(values));
    }
}

package com.coding.practice.Miscellaneous;

//Wap to input a list of integers. Sort them in decreasing order of their frequency.
//If two numbers have same frequency, sort them in descending order.

import java.util.*;

public class SortFrequency
{
    public static Map<Integer, Integer> frequency;

    public List<Integer> sortInOrder(List<Integer> numbers) {
        frequency = new HashMap<>();
        for (Integer num : numbers) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
        }

        FreqComparator2 fc = new FreqComparator2();

        Set<Integer> keys = frequency.keySet();

        List<Integer> listOfKeys = new ArrayList<Integer>(keys);
        Collections.sort(numbers, fc);

        return numbers;

    }
    public static void main(String[] args)
    {
        SortFrequency fc = new SortFrequency();
        List<Integer> array = Arrays.asList(3,4,4,4,4,4,4,4,4,5,5,6,6,4,4,3,3,2,2,1,1);
        System.out.println(fc.sortInOrder(array));
        List<Integer> array2 = new ArrayList<>();
        for (Integer val : array)
        {
            if (!array2.contains(val))
            {
                array2.add(val);
            }
        }
        System.out.println(array2);
    }
}

class FreqComparator2 implements Comparator<Integer>
{
    @Override
    public int compare(Integer i1, Integer i2)
    {
        int comparision = (SortFrequency.frequency.get(i2)).compareTo(SortFrequency.frequency.get(i1));
        //System.out.println(comparision);
        if (comparision == 0)
        {
            return i2.compareTo(i1);
        }
        else
        {
            return comparision;
        }
    }
}


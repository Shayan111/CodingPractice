package com.coding.practice.Random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency
{
    public static String getMaxOccuringWord(List<String> names)
    {
        Map<String, Integer> frequency = new HashMap<>();
        for (String name : names)
        {
            if (frequency.containsKey(name))
            {
                frequency.put(name, frequency.get(name) + 1);
            }
            else
            {
                frequency.put(name, 1);
            }
        }

        for (Map.Entry<String, Integer> entry :  frequency.entrySet())
        {
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }


        int max = 0;
        String name = null;
        for (Map.Entry<String, Integer> entry : frequency.entrySet())
        {
            if (entry.getValue() > max)
            {
                name = entry.getKey();
                max = entry.getValue();
            }
        }

        return name;
    }

    public static void main(String[] args) {
        //List<String> names = Arrays.asList("Shayan", "Saim", "Ausaf", "Shayan");
        String sentence = "Shayan Saim Ausaf Shayan Ausaf Ausaf";
        String [] words = sentence.split(" ");
        List<String> names =  Arrays.asList(words);
        String max = Frequency.getMaxOccuringWord(names);
        System.out.println("Max occuring word -> " + max);
    }
}

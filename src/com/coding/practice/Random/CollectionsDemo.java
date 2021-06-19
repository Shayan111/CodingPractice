package com.coding.practice.Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsDemo
{

    public void doThis(String key)
    {
        Map<String, Integer> hashMap = new HashMap<>();
        char c = 'a';
        for (int i = 0; i < 10 ; i++)
        {
            hashMap.put(c + "", i + 1);
            c++;
        }
        hashMap.put("p", 10);

        for (Map.Entry<String, Integer> entry :  hashMap.entrySet())
        {
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }

        if (hashMap.containsKey(key))
        {
            System.out.println("Value is " + hashMap.get(key));
        }
        else
        {
            System.out.println(key + "is not present.");
        }
    }

    public static void main(String[] args) {
        CollectionsDemo c = new CollectionsDemo();
        c.doThis("io");
    }
}

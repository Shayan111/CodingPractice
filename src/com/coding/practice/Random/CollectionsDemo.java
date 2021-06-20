package com.coding.practice.Random;

import java.util.*;

public class CollectionsDemo<T>
{

    public void doThat(List<T> arraylist)
    {
        for (T entity : arraylist)
        {
            System.out.println(entity);
        }
    }
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
        CollectionsDemo<String> c = new CollectionsDemo<String>();
        //c.doThis("io");
        List<String> ar = Arrays.asList("Shayan", "Ausaf","Saim");
        List<Integer> arr = Arrays.asList(1,5,3,7,9);
        c.doThat(ar);
    }
}

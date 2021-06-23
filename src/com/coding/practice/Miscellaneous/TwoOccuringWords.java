package com.coding.practice.Miscellaneous;

//WAP to display the first two most occurring words in a sentence.

import java.util.*;

public class TwoOccuringWords
{

    public static List<String> twoMostOccurring(List<String> words)
    {

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words)
        {
            if (frequencyMap.containsKey(word))
            {
                frequencyMap.put(word, frequencyMap.get(word)+1);
            }
            else
            {
                frequencyMap.put(word, 1);
            }
        }

        List<String> mostOccurringWords = new ArrayList<>();
        String firstString = null, secondString = null;
        int freq = 0, freqTwo = 0, value;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet())
        {
            value = entry.getValue();
            if (value > freq)
            {
                freq = value;
                firstString = entry.getKey();
            }

            if (value > freqTwo && value < freq)
            {
                freqTwo = value;
                secondString = entry.getKey();
            }
        }
        mostOccurringWords.add(firstString);
        mostOccurringWords.add(secondString);
        return mostOccurringWords;
    }
    public static void main(String[] args)
    {
        String sentence = "Two Two most most most occurring words in the sentence";
        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println(TwoOccuringWords.twoMostOccurring(words));
    }
}

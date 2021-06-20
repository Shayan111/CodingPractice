package com.coding.practice.Random;

public class GCD {
    public int findGCD(int a, int b)
    {
        int gcd = 1;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args)
    {
        GCD gcd = new GCD();
        System.out.println(gcd.findGCD(14,3));
    }
}

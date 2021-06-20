package com.coding.practice.Random;

import java.util.Comparator;

public class PersonSalaryComparator implements Comparator<Person>
{
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getSalary() - p2.getSalary();
    }
}

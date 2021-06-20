package com.coding.practice.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorDemo
{
    static List<String> myList = Arrays.asList("Shayan", "Ausaf", "Saim");
    static List<Person> people = new ArrayList<>();
    String s = "";

    public static void performOp()
    {
        PersonNameComparator c1 = new PersonNameComparator();
        PersonSalaryComparator c2 = new PersonSalaryComparator();
        Collections.sort(people, c1);
        System.out.println(people);
        Collections.sort(people, c2);
        System.out.println(people);
        Collections.sort(myList);
        Collections.sort(people);
        System.out.println(myList);
        System.out.println(people);
    }

    public static void generatePeopleList()
    {
        char name = 'A';
        char contact = 'Q';
        int salary = 9;
        for (int i = 0; i < 10; i++)
        {
            Person p = new Person();
            p.setName(name + "");
            p.setContact(contact + "");
            p.setSalary(salary);
            name++;
            contact++;
            salary++;
            people.add(p);

        }
//        System.out.println(people);
    }

    public static void main(String[] args) {
        ComparableComparatorDemo.generatePeopleList();
        ComparableComparatorDemo.performOp();
    }

}

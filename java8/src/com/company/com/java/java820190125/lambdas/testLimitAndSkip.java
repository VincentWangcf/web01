package com.company.com.java.java820190125.lambdas;

import com.company.com.java.java820190125.lambdas.Bean.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class testLimitAndSkip {


    public static void main(String[] args) {
        testLimitAndSkip.testLimitAndSkip();
    }
    public static void testLimitAndSkip() {
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 10000; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<String> personList2 = persons.stream().
                map(Person::getName).limit(10).skip(3).collect(Collectors.toList());

        System.out.println(personList2);



    }
}
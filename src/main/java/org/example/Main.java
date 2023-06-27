package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> greetingsList = new ArrayList<>();
        greetingsList.add("Hello");
        greetingsList.add("Hi");
        greetingsList.add("Hey");

        Person p = new Person();
        p.setAge(25);

        Person p2 = new Person();
        p.setAge(56);

        List<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(p2);


        for (Person person : personList) {
            System.out.println(person.getAge());
        }



    }
}
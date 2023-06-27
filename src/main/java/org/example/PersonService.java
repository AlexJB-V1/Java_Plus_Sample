package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public void doSomething() {
        try {
            createPersonList(99);
        } catch (RuntimeException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public List<Person> createPersonList(int peopleCount) {
        if (peopleCount > 9) {
            throw new RuntimeException("Cannot Create a list with > 9 People");
        }
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < peopleCount ; i++) {
            Person p = new Person();
            p.setAge(i + 25);
            personList.add(p);
        }
        return personList;
    }

}

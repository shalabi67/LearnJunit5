package com.learn.junit5.facade;

import java.util.ArrayList;
import java.util.List;

public class PersonsData {
    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mohammad", "Shalabi", "123", true));
        persons.add(new Person("Yaser", "Lana", "456", false));
        persons.add(new Person("Samer", "Dana", "789", true));
        persons.add(new Person("Ahmad", "Shosho", "567", false));

        return persons;
    }
}

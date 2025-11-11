package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Person> people=getPeople();




        double avarageage=people.stream()
                .map(Person::getAge)
                .collect(Collectors.averagingDouble(n->n));




        //same last name
        String lastName="Williams";
        people.stream()
                .filter(p->p.getLastName().equalsIgnoreCase(lastName))
                .forEach(System.out::println);

        //avarage age
        double avarageAge=people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        //get just the ages in a list
        people.stream()
                .map(Person::getAge)
                .forEach(System.out::println);

        //Display the age of the oldest person in the list.
        System.out.println(people.stream()
                .max(Comparator.comparing(Person::getAge))
        );

        //  Display the age of the youngest person in the list.
        System.out.println(people.stream()
                .min(Comparator.comparing(Person::getAge))
        );

        //sort the people by age
        System.out.println(people.stream()
                .sorted(Comparator.comparing(Person::getAge))
        );





    }
    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("LeBron", "James", 39));
        people.add(new Person("Stephen", "Curry", 36));
        people.add(new Person("Kevin", "Durant", 35));
        people.add(new Person("Giannis", "Antetokounmpo", 29));
        people.add(new Person("Joel", "Embiid", 30));
        people.add(new Person("Luka", "Doncic", 25));
        people.add(new Person("Jayson", "Tatum", 26));
        people.add(new Person("Nikola", "Jokic", 29));
        people.add(new Person("Anthony", "Davis", 31));
        people.add(new Person("Jimmy", "Butler", 34));
        people.add(new Person("Kawhi", "Leonard", 32));
        people.add(new Person("Devin", "Booker", 27));

        // Duplicate last names
        people.add(new Person("Jalen", "Williams", 23));
        people.add(new Person("Grant", "Williams", 25));
        people.add(new Person("Jaden", "Ivey", 22));
        people.add(new Person("Keyontae", "Johnson", 24));
        people.add(new Person("Keldon", "Johnson", 24));
        people.add(new Person("Draymond", "Green", 34));
        people.add(new Person("Josh", "Green", 23));
        people.add(new Person("Trey", "Murphy", 24));
        return people;
    }
}

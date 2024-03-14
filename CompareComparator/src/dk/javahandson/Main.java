package dk.javahandson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(-23);
        numbers.sort(null);
        for(Number n: numbers){
            System.out.println(n);
        }

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Peter", 25));
        persons.add(new Person("John", 31));
        persons.add(new Person("Jenny", 29));
        persons.add(new Person("Jill", 29));
        persons.add(new Person("Joe", 29));
        persons.sort(
                Comparator.comparing(Person::getAge).reversed().thenComparing(Comparator.comparing(Person::getName)));

        for(Person p: persons){
            System.out.println(p);
        }
    }
}
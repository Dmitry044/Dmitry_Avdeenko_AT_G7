package homework.day7;

import java.util.Arrays;
import java.util.List;

public class Person {
    public String name;
    public int age;
    public Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        //this.sex = sex;
    }

    public enum Sex {
        MAN, WOMEN
    }

    static List<Person> people = Arrays.asList(
            new Person("Вася", 13, Person.Sex.MAN),
            new Person("Катя", 28, Person.Sex.WOMEN),
            new Person("Вова", 24, Person.Sex.MAN),
            new Person("Маша", 38, Person.Sex.WOMEN),
            new Person("Роман Петрович", 72, Person.Sex.MAN)
    );

    public static void main(String[] args) {
        int count = 0;
        for (Person person : people) {
            if (person.sex == Person.Sex.WOMEN && person.age >= 18 && person.age <= 55) {
                count++;
            } else if (person.sex == Person.Sex.MAN && person.age < 60 && person.age >= 18) {
                count++;
            }
        }
        System.out.println("Количество работоспособных людей в выборке: " + count);

        //System.out.println(people.stream().filter(x -> x.equals("WOMEN")).filter(y -> y.equals()).count());
/*

        long countAPI = people.stream().count();
        .filter(person -> (person.Sex == Person.Sex.WOMEN && person.age >= 18 && person.age <= 55)
                || (person.sex == Person.Sex.MAN && person.age < 60 && person.age >= 18))
                .count();*/
        System.out.println("Количество работоспособных людей в выборке: " + count);

    }


}

//Найти количество работоспособных людей в выборке 18-55 WOMEN, 60 лет MEN



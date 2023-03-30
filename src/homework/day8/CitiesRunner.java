package homework.day8;

import java.util.ArrayList;

public class CitiesRunner {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        int sum = cities.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println("Сумма всех букв во всех городах: " + sum);
    }
}

//Создать пустой список стрингов cities (через new ArrayList)
//Добавить в список 3 города (Минск, Москва, Берлин)
//Посчитать сумму всех буков во всех словах и вывести число в консоль

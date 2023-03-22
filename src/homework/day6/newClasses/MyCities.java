package homework.day6.newClasses;

import java.util.ArrayList;
import java.util.List;

public class MyCities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int counter = 0;
        for (String city : cities) {
            counter += city.length();
        }
        System.out.println(counter);

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + " ");
        }
    }
}

//Создать пустой список стрингов cities (через new ArrayList)
//Добавить в список 3 города (Минск, Москва, Берлин)
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки
//Посчитать сумму всех буков во всех словах и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел

package homework.day6.newClasses;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class myCars {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try (PrintWriter writer = new PrintWriter("cars.txt")) {
            for (String car : cars) {
                writer.println("\"" + car + "\"");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Iterator<String> iter = cars.iterator();
        while (iter.hasNext()) {
            String car = iter.next();
            if (car.length() > 4) {
                iter.remove();
            }
        }

        for (String car : cars) {
            System.out.println(car + " ");
        }
    }
}

//Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)
//Проитерировать список через for-each и отпечатать слова в файл cars через дефис с новой строки в кавычках
//Найти и удалить из набора авто, в названии которых больше 4 букв
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

package homework.day6.newClasses;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFigures {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");


        try (PrintWriter writer = new PrintWriter("figures.txt")) {
            for (String figure : figures) {
                writer.print(figure + "-");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int counter = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                counter++;
            }
        }
        System.out.print("Количество фигур, не содержащих букву 'и': " + counter);
        System.out.println();

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        figures.set(3, "Треугольник");

        for (String words : figures) {
            System.out.print(words + " ");
        }
    }
}


//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в файл figures через тире
//Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Вставить на 3 позицию Треугольник
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

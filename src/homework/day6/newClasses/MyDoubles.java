package homework.day6.newClasses;

import java.util.Arrays;
import java.util.List;

public class MyDoubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double doubl : doubles) {
            System.out.println(doubl + " ");
        }

        Double multiple = 1.0;
        for (Double doubl : doubles) {
            multiple *= doubl;
        }
        System.out.println("произведение всех чисел: " + multiple);

        Double sum = 0.0;
        for (Double doubl : doubles) {
            sum += doubl % 1;
        }
        System.out.println("Сумма всех дробных чисел: " + sum);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print((int) Math.floor(doubles.get(i)) + " ");
        }
    }
}

//Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль через пробел
//Посчитать произведение всех чисел и вывести результат в консоль
//найти сумму всех дробных частей и вывести результат в консоль
//Проитерировать список по индексу и вывести целые части в консоль через пробел

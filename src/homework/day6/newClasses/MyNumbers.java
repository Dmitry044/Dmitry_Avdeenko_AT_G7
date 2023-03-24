package homework.day6.newClasses;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех чисел: " + sum);

        numbers.sort(Integer::compareTo);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " ");
        }

        Collections.reverse(numbers);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}

//Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль новой строки
//Посчитать сумму всех чисел и вывести результат в консоль
//Отсортировать список по возрастанию
//Проитерировать список по индексу и отпечатать числа в консоль через пробел
//Развернуть список в обратном порядке
//Проитерировать список через for-each и отпечатать числа в консоль через пробел

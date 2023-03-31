package homework.day8;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        System.out.println("Отпечатать числа в консоль новой строки: ");
        numbers.forEach(System.out::println);

        Stream<Integer> sortedNumbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).sorted();
        System.out.println("Отсортировать и снова отпечатать в консоль с новой строки");
        sortedNumbers.forEach(System.out::println);

        Stream<Integer> sumNumbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        int sum = sumNumbers.mapToInt(Integer::intValue).sum();
        System.out.println("Сумма всех чисел: " + sum);
    }
}

//Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
//В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
//Отсортировать и снова отпечатать в консоль с новой строки
//Посчитать сумму всех чисел и вывести результат в консоль

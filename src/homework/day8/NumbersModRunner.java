package homework.day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять");
        List <String> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090)
                .filter(n->String.valueOf(n).contains("3"))
                .flatMap(n-> String.valueOf(n).chars().mapToObj(c->words.get(Character.getNumericValue(c))))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(numbersMod);
    }
}

//Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
//Отфильтровать те числа, которые содержать цифру 3
//Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки

package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class Task4CountLetters {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mama", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().map(String::length).reduce(Integer::sum).get()); //посчитать все буквы
    }
}

package classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1List {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mama", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().anyMatch("мама" :: equals));
        System.out.println(list.stream().allMatch( s -> s.contains("м"))); //все
        System.out.println(list.stream().map(y->y + "м").collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(y -> Arrays.stream(y.split("а"))).filter(s->!s.isEmpty()).collect(Collectors.toList()));

    }

}

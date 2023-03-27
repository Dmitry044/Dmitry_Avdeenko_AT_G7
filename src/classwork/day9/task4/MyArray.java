package classwork.day9.task4;

import java.util.Arrays;
import java.util.List;

public class MyArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mama", "мыла", "раму", "мама", "чисто");

        int count = 0;
        for (String word : list) {
            if ("мама".equals(word)) {
                count++;
            }
            System.out.println("количество слов мама: "+ count);
        }

        list.stream().filter(x -> x.equals("мама")).count();
        list.stream().filter("мама"::equals).count();


    }
}
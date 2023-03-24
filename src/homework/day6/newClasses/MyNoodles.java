package homework.day6.newClasses;

import java.util.ArrayList;
import java.util.List;

public class MyNoodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            System.out.print(noodle + " - ");
        }

        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace("a", "o"));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}

//Создать пустой список стрингов noodles (через new ArrayList)
//Добавить в список 4 вида макарон (стринги Hakka, Ramen, Hibachi, Schezwan)
//Проитерировать список через for-each и отпечатать слова в консоль через тире
//Заменить в каждом слове буквы "а" на букву "о"
//Проитерировать список по индексу и отпечатать слова в консоль через пробел

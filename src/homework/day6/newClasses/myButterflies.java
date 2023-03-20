package homework.day6.newClasses;

import java.util.ArrayList;
import java.util.List;

public class myButterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.println("\"" + butterfly + "\" ");
        }

        int count = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                count++;
            }
        }
        System.out.println("Количество бабочек, содержащих букву 'о': " + count);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.println(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }


    }

}

//Создать пустой список стрингов butterflies (через new ArrayList)
//Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
//Проитерировать список через for-each и отпечатать слова в консоль в кавычках
//Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Проитерировать список через for-each и отпечатать слова в консоль через перенос строки

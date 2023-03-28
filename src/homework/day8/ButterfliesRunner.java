package homework.day8;

import java.util.ArrayList;

public class ButterfliesRunner {
    public static void main(String[] args) {
        ArrayList<String> butterflies = new ArrayList<String>();

        // добавляем бабочек в список
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        // добавляем кавычки к каждому элементу
        /*for (int i = 0; i < butterflies.size(); i++) {
            butterflies.set(i, "\"" + butterflies.get(i) + "\"");*/


        butterflies.stream()
                .map(butterfly -> "\"" + butterfly + "\"")
                .filter(butterfly -> butterfly.toLowerCase().contains("a") && butterfly.toLowerCase().contains("o"))
                .forEach(System.out::println);
    }
}


//Создать пустой список стрингов butterflies (через new ArrayList)
//Добавить в список 4 бабочки (Common blue, Swallowtail, Aglais io, Common blue)
//Добавить к каждому элементу кавычки
//Оставить только те слова, которые содержат букву "a" и букву "о"
//Вывести слова в консоль с новой строки

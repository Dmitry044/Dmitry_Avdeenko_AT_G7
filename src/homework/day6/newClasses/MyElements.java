package homework.day6.newClasses;

import java.util.ArrayList;
import java.util.List;

public class MyElements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        int counter = 0;
        for (String element : elements) {
            if (element.contains(" ")) {
                counter++;
            }
        }
        System.out.println("элементов состоит более, чем из одного слова: " + counter);

        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i) + " ");
        }

        elements.add(3, "Spinner");

        elements.remove(1);
        elements.set(3, "Switch");

        for (String element : elements) {
            System.out.println(element + " ");
        }
    }
}

//Создать пустой список стрингов elements (через new ArrayList)
//Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//Проитерировать список через for-each и отпечатать слова в консоль через пробел
//Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//На 4-ю позицию добавить Spinner
//Удалить 2-й элемент списка
//Заменить 5-й элемент на Switch
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

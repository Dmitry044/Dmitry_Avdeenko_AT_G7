package homework.day6.newClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySandbox {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand weight : sandbox) {
            System.out.print(weight.getWeight() + " ");
        }
        System.out.println();

        for (Sand name : sandbox) {
            System.out.print(name.getName() + " ");
        }

        Map<Integer, Sand> sandBoxMap = new HashMap<>();

        sandBoxMap.put(1, sandbox.get(0));
        sandBoxMap.put(2, sandbox.get(1));
        sandBoxMap.put(3, sandbox.get(2));
        sandBoxMap.put(4, sandbox.get(3));

        for (int key : sandBoxMap.keySet()) {
            System.out.println(key + " ");
        }

        for (Sand sand : sandBoxMap.values()) {
            System.out.println(sand + " ");
        }

        for (Map.Entry<Integer, Sand> entry : sandBoxMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}

//Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
//Заполнить 4 объектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно
//Проитерировать список через for-each и отпечатать вес в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Создать пустую карту, где ключом является целое число, а значением объект песка
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//Проитерировать карту и отпечатать ключи в консоль
//Проитерировать карту и отпечатать значения в консоль
//Проитерировать карту и отпечатать пары ключ-значение в консоль

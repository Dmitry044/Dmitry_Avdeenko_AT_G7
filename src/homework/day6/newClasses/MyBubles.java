package homework.day6.newClasses;

import java.util.Arrays;
import java.util.List;

public class MyBubles {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")
        );

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

        int sumVolume = 0;
        for (Bubble bubble : bubbles) {
            sumVolume += bubble.getVolume();
        }
        System.out.println("Объем всех пузырей: " + sumVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println("\"" + bubbles.get(i).toString());
        }
    }
}

//Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать объемы в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Посчитать объем всех пузырей и вывести число в консоль
//Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

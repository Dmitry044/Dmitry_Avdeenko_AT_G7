package homework.day6.newClasses;

import java.util.Arrays;
import java.util.List;

public class myBird {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int count = 0;
        for (String bird : birds) {
            int vowels = countVowels(bird);
            if (vowels > 1) {
                count++;
            }
        }
        System.out.println("Количество птиц с больше одной гласной: " + count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(2, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
        System.out.println();
    }

    private static int countVowels(String str) {
        int count = 0;
        String vowels = "ауоыэяюёие";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}


//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
//Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Заменить 3-й элемент списка на Синица
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

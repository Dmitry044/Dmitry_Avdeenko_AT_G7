package homework.day8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        var birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        var result = birds.stream()
                .map(s -> s.replace('о', 'а'))
                .collect(Collectors.joining(" ")).toLowerCase()
                .replaceAll("ь", "")
                .split("б");

        Arrays.stream(result).forEach(s -> System.out.println("--" + s + "--"));
    }
}

//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//Собрать все слова в одну строку в ниждем регистре
//Убрать все символы мягкого знака
//Разбить на новые строки по букве "б"
//Отпечатать в консоль с новой строки в виде --Чайка--

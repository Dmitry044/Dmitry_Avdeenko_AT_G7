package homework.day8;

import java.util.Arrays;

public class FiguresRunner {
    public static void main(String[] args) {
        String[] figuresArray = {"Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"};
        Arrays.stream(figuresArray)
                .mapToInt(String::length)
                .filter(lenght -> lenght > 4)
                .forEach(System.out::println);

    }
}

//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Stream.of())
//Заменить каждое слово на целое число, соответствующее количеству буков в слове
//Отфильтровать числа, которые больше 4
//Отпечатать все оставшиеся числа в консоль

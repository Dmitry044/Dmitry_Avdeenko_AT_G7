package homework.day8;

import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elements.map(s -> {
                    if (s.length() % 2 == 0) {
                        return String.valueOf(s.length());
                    } else {
                        return s.replace("e", "o");
                    }
                })
                .distinct()
                .forEach(System.out::println);
    }
}

//Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
// (через Stream.of())
//Если слово содержит нечетное количество буков, то заменить в нем все буквы "e" на
// букву "o", а если четное, то заменить слово на число количества буков в этом слове
//Оставить в потоке только уникальные значения
//Отпечатать в консоль с новой строки

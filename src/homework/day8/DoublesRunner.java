package homework.day8;

import homework.day6.newClasses.Bubble;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        Stream<Integer> integer = doubles.map(Double::intValue);

        Random random = new Random();
        Stream<Integer> randomIntegers = integer.map(i -> random.nextInt(i + 1));

        // Убираем дубликаты значений
        Stream<Integer> uniqueIntegers = randomIntegers.distinct();

        // Заменяем каждое число в получившемся потоке данных новым потоком объектов Bubble
        Stream<Bubble> bubbles = uniqueIntegers.map(i -> {
            int volume = i.intValue();
            return Stream.generate(() -> new Bubble(1,"Bubble vol-" + volume)).limit(volume);
        }).flatMap(i -> i);

        // Отпечатываем каждый объект нового потока с новой строки
        bubbles.forEach(System.out::println);

        // Находим общий объем полученного потока пузырьков и отпечатываем в консоль
        int totalVolume = bubbles.mapToInt(Bubble::getVolume).sum();
        System.out.println("Total volume: " + totalVolume);

    }
}


//Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
// через (Stream.of())
//Округлить каждое число до целого
//На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с границами
// от 0 до числа из иходного потока данных
//Убрать дубликаты значений
//Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве
// равному заменяемому числу,
//создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i,
// где i - число из исходного потока
//Отпечатать в консоль каждый из обьектов нового потока с новой строки
//Найти общий обьем полученного потока пузырьков и отпечатать в консоль
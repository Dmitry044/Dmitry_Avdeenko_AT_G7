package homework.day4.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance(){
        Random random = new Random();
        int distance = random.nextInt(99)+1;
        System.out.printf("DistanceGenerator: I have generated distance with value: " + distance);
        return distance;
    }
}

//у него есть публичный статический метод generateDistance() - который генерирует случайное число
// от 1 (включая) до 100 (исключая), печатает в консоль строку "DistanceGenerator: I have generated
// distance with value: X", где Х - сгенерированное число, и возвращает это число

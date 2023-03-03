package homework.day4.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate(){
        Random random = new Random();
        int num = random.nextInt(79)+1;
        System.out.println("CoordinatesGenerator: I have generated point with value: " + num);

        return num;
    }
}

//-- class CoordinatesGenerator
//у него есть публичный статический метод generateCoordinate() - который генерирует случайное
// число от 1 (включая) до 80 (исключая), печатает в консоль строку "CoordinatesGenerator: I have
// generated point with value: X", где Х - сгенерированное число, и возвращает это число

package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection(){
        Random rand = new Random();
        int num = rand.nextInt(40)+1; //для чего +1?
        if (num <= 9) {
            return "NORTH";
        } else if (num <= 19) {
            return "SOUTH";
        } else if (num <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }

    }
}

//-- class DirectionGenerator
//у него есть публичный статический метод generateDirection() - который генерирует случайное число
// от 1 (включая) до 40 (исключая), и возвращает строку одного из 4-х значений направления, следуя логике,
// если случайное от 1 до 9 - NORTH, от 10 до 19 - SOUTH, от 20 до 29 - WEST, от 30 до 39 - EAST

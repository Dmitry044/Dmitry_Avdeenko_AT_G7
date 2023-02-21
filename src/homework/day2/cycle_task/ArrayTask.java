package homework.day2.cycle_task;

import java.util.Random;

public class ArrayTask {
    public int[] taskThreeArray() {

        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
            //System.out.print(array[i] + " ");
        }
        return array;
    }
}

//создать пустой массив типа int и размера n = 7 и заполнить его случайными
// элементами используя Random.nextInt(n)

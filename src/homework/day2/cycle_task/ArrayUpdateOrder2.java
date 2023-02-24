package homework.day2.cycle_task;

import java.util.Arrays;

public class ArrayUpdateOrder2 {
    public void taskTenUpdateOrder2(){
        int[] array = {1,2,5,3,4,6,8};

        Arrays.sort(array);

        for (int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}

//отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль

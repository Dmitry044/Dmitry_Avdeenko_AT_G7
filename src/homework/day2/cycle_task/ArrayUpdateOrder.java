package homework.day2.cycle_task;

public class ArrayUpdateOrder {
    public void taskNineUpdateOrder(){
        int[] array = {1,2,3,4,5,6,7};
        int x = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = x;

        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }





    }




}

//- поменять местами первый и последний элементы и вывести результат в консоль

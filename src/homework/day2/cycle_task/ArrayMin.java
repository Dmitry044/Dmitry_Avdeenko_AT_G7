package homework.day2.cycle_task;

public class ArrayMin {
    public int taskEightMin(){
        int[] array = {3,4,5,6,2,8,9,10};

        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min=array[i];
            }
        }
        System.out.print(min + " ");
        return min;
    }
}

//- найти минимальный элемент массива и вывести результат в консоль

package homework.day2.cycle_task;

public class ArrayPrint {
    public void taskFourPrint(){
        ArrayTask arrayTask = new ArrayTask();
        int[] newArray = arrayTask.taskThreeArray();

        for (int i = 0; i < newArray.length; i++ ){
            System.out.print(newArray[i] + " ");
        }

        //System.out.println("Array print " + Arrays.toString(arrayTask.taskThreeArray())); //второй способ


    }
}


//- пройти по массиву и вывести в консоль все элементы
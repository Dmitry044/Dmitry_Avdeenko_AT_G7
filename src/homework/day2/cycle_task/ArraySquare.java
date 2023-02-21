package homework.day2.cycle_task;

public class ArraySquare {
    public void taskSevenSquare(){
        int[] array = {1,2,3,4,5};
        
        int sq;
        for (int i: array){
            sq = i*i;
            System.out.print(sq + " ");
        }
    }
    
}

//каждый элемент массива возвести в квадрат и вывести результат в консоль
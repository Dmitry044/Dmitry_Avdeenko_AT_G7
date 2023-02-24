package classwork.day1.array;

import java.util.Random;

public class CreateArray {
    public static void main(String[] args) {
        CreateArray task = new CreateArray(); // создаю новый объект класса
        task.foo(); // вызываю метод foo
    }

    public void foo () {
        int[] array = new int[10];
        Random random = new Random(); //создаю объект для создания новых чисел
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100); //заполняю массив случайными числами (обращаюсь к массиву и потом заполняю)
            System.out.println(array[i]); // печатаю все элементы массива
        }

        int sum = 0;
        for (int i: array){
            sum = sum + i;
        }
        System.out.println("Average value is: " + sum / array.length ); // печатаю
        // среднее значение цикла (сумма всех значений делю на количество элементов в массиве)
    }
}

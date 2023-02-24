package homework.day3.array_exercise;

import java.util.Arrays;
import java.util.Calendar;

public class ArrayExercise {

    public static void main(String[] args) {
        drawCow();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = 3;
        int sum = sumEveryNthElement(arr,n);
        System.out.println(sum);

        int[] arrs = {1,2,3,4,5,6,7,8,9};
        int nn = 5;
        int[] result = reverseArrayGreaterThanN(arrs,nn);
        System.out.println(Arrays.toString(result));

        int summ = sumArrayElementsDivisibleByMonth(arr);
        System.out.println(summ);
    }


    public static int sumEveryNthElement(int[] arr, int n) {
        int sum = 0;
        for (int i = n - 1; i < arr.length; i+=n) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] reverseArrayGreaterThanN(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i = i - 1) {
            if (arr[i] > n) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static int sumArrayElementsDivisibleByMonth(int[]arr){
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%month == 0){
                sum +=arr[i];
            }
        }
        return sum;
    }


    public static void drawCow() {
        System.out.println("  ^__^");
        System.out.println("  (oo)\\_______");
        System.out.println(" (__)) \\/_\\  \\");
        System.out.println("      ||----w |\\");
        System.out.println("      ||     ||");
    }
}



//работа с массивами и консолью (делаете в 1-м классе, имя класса произвольное)
//-- написать метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого
// элемента в нем, где n - целое число, передаваемое в сигнатуру этого метода
//-- написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного
// целочисленного массива (подается на вход этого метода), которые больше, чем число n, где n - целое число,
// передаваемое в сигнатуру этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке
//-- написать метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу
// текущего месяца (массив подается в сигнатуру метода)
//-- написать метод, который "нарисует" в консоли следующий рисунок:
//
//	  ^__^
//	  (oo)\\_______
//	 (__)\ ) \/\  \
//	      ||----w |\
//	      ||     ||
//
//(при копировании текста из скайпа в блокнот оно выравняется и станет более понятным, и не мудрите,
// это простая последовательность из .println())

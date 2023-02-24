package homework.day3.array_exercise;

public class ArrayExercise {

    public static void main(String[] args) {
        drawCow();


    }




    public static int sumEveryNthElement(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
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

        for (int i = n - 1; i >= 0; --i) {
            if (arr[i] > n) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }


    public static void drawCow() {
        System.out.println("  ^__^");
        System.out.println("  (oo)\\_______");
        System.out.println(" (__)) \\/\\  \\");
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

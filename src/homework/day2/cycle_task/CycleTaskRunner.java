package homework.day2.cycle_task;

public class CycleTaskRunner {
    public static void main(String[] args) {
        
   
    CycleTaskRunner cycleTaskRunner = new CycleTaskRunner();

    WhileTask whileTask = new WhileTask();
    whileTask.taskOneWhile();
        System.out.println("\n");

    ForTask forTask = new ForTask(); //вопрос почему печатает в той же строке новый вызываемый метод????
    forTask.taskTwoFor();
        System.out.println("\n");

    //ArrayTask arrayTask = new ArrayTask();
    //arrayTask.taskThreeArray();
        //System.out.println("заполняет массив");

        System.out.print("Доп метод печати " );
        ArrayPrint arrayPrint = new ArrayPrint();
    arrayPrint.taskFourPrint();
        System.out.println("\n");

    ArrayReverse arrayReverse = new ArrayReverse();
    arrayReverse.taskFiveReverse();
        System.out.println("\n");

    ArrayIncrise arrayIncrise = new ArrayIncrise();
    arrayIncrise.taskSixIncrise();
        System.out.println("\n");

    ArraySquare arraySquare = new ArraySquare();
    arraySquare.taskSevenSquare();
        System.out.println("\n");

    ArrayMin arrayMin = new ArrayMin();
    arrayMin.taskEightMin();
        System.out.println("\n");

    ArrayUpdateOrder arrayUpdateOrder = new ArrayUpdateOrder();
    arrayUpdateOrder.taskNineUpdateOrder();
        System.out.println("\n");

    ArrayUpdateOrder2 arrayUpdateOrder2 = new ArrayUpdateOrder2();
    arrayUpdateOrder2.taskTenUpdateOrder2();
        System.out.println("\n");
    }
}

//CycleTask (для него создаем отдельный пакет cycletask и каждое подзадание делаем в отдельном классе, 
// имена классов и методов на ваше усмотрение, запускаем в отдельном классе CycleTaskRunner, 
// где создаем обьект соответствующего типа и вызываем нужный метод)
//- используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел
//- используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
//- создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
//
//- пройти по массиву и вывести в консоль все элементы
//- вывести в консоль все элементы массива в обратном порядке
//- каждый элемент массива умножить на 5 и вывести результат в консоль
//- каждый элемент массива возвести в квадрат и вывести результат в консоль
//- найти минимальный элемент массива и вывести результат в консоль
//- поменять местами первый и последний элементы и вывести результат в консоль
//- отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль

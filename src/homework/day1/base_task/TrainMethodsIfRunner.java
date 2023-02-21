package homework.day1.base_task;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(890));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(666666));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('6')); //
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(9));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(8.8));
        trainMethodsIf.returnNewBoolean(true);
    }
}

//создать класс TrainMethodsIfRunner с методом main, в котором создать обьект класса TrainMethodsIf, и отпечатать
// в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул "
// и возвращаемое значение, последний метод просто вызвать

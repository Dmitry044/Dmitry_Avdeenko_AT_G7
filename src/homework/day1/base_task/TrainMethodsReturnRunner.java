package homework.day1.base_task;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(1));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(6875756));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('8')); //значение странное печатает
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(8));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(6.6));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 7));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 8));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));
    }
}

//создать класс TrainMethodsReturnRunner с методом main, в котором создать обьект класса TrainMethodsReturn,
// и отпечатать в консоль значение, возвращаемое каждым из его методов
// в виде "метод <название метода> вернул " и возвращаемое значение

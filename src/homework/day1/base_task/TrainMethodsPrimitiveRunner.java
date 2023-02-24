package homework.day1.base_task;

public class TrainMethodsPrimitiveRunner {
    //создать класс TrainMethodsPrimitiveRunner с методом main,
    // в этом методе создать обьект класса TrainMethodsPrimitive и вызвать всего его методы

    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(1);
        trainMethodsPrimitive.printLong(1234567);
        trainMethodsPrimitive.printChar((char) 4455);
        trainMethodsPrimitive.printFloat(1.1F);
        trainMethodsPrimitive.printDouble(44.4);
        trainMethodsPrimitive.printShort((short) 9);
        trainMethodsPrimitive.printByte((byte) 1);
        trainMethodsPrimitive.printBoolean(false);

    }
}

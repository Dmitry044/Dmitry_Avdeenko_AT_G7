package classwork.day6.reader;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        /*MyReadWriter myReadWriter = new MyReadWriter();
        myReadWriter.read();
        myReadWriter.write();*/

        //MyReadWriter myReadWriter = new MyReadWriter();
        MyReadWriter.read(); //через приватный конструктор можно вызывать напрямую без создания объекта,
        // т.к метод чтения утилитарны(вспомогательный)
        MyReadWriter.write(); //объект создаем только для чего-то

    }
}

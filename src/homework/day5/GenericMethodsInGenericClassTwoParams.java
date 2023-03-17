package homework.day5;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public String genericMethodGenArgs(X first, Y second) {
        //return "I received " + 2 + "arguments of type: " + first.getClass() + " " + second.getClass();
        return String.format("I received %d arguments of type: %s class, %s class", 2, first.getClass(), second.getClass());
    }

    public void genericMethodHalfGenArgs(X first, Y second,  String string) {
        System.out.printf("I got an object of %s class and %s class and string with %s characters", first.getClass(), second.getClass(), string.length());
    }

    public void genericMethodHalfGenArgs(Y second, String string) {
        System.out.printf("I got an object of %s class and string with %s characters", second.getClass(), string.length());
    }


}


//- создать класс обобщенного типа GenericMethodsInGenericClassTwoParams<X, Y> и в нем:
//-- перегруженный метод genericMethodGenArgs, принимающий 1 или 2 аргумента переменного типа и
// возвращающий строку "I received N arguments of type: X class, Y class", где N - количество полученных
// аргументов, X и Y - название классов передаваемых аргументов
//-- перегруженный невозвратный метод genericMethodHalfGenArgs, принимающий 1 или 2 аргумента
// переменного типа и второй или третитй аргумент типа String, и печатающий в консоль
// фразу "I got an object of X class and Y class and string with N characters",
// где X - название класса передаваемых аргументов, N - количество символов в
// переданной строке, перегрузку метода сделать для вариантов параметров типа (X, String), (Y, String)
//- создать класс GenericMethodsInGenericClassTwoParamsRunner с методом main и в нем:
//-- создать обьекты типа GenericMethodsInGenericClassTwoParams <X, Y> с параметрами
// типа <String, String>, <String, Integer>, <String, Double>,  <Integer, Integer> и
// всеми типами, которые содержаться в пакете playground.essence, используя каждый из них хотя бы 1 раз
//-- вызывать каждый из методов у каждого из обьектов, в случае, если метод
// возвратный - отпечатать возвращаемое им значение в консоль
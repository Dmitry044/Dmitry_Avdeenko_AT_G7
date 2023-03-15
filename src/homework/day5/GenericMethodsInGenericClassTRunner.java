package homework.day5;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> intObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Boolean> boolObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Character> charObj = new GenericMethodsInGenericClassT<>();

        String str = "Hello World!";
        Integer num = 42;
        Double dbl = 3.14;
        Boolean bool = true;
        Character chr = 'c';

        stringObj.genericMethodOneGenArg(str);
        intObj.genericMethodOneGenArg(num);
        doubleObj.genericMethodOneGenArg(dbl);
        boolObj.genericMethodOneGenArg(bool);
        charObj.genericMethodOneGenArg(chr);

        System.out.println(stringObj.genericMethodTwoGenArgs(str, String.valueOf(num)));
        /*System.out.println(intObj.genericMethodTwoGenArgs(num, dbl));
        System.out.println(doubleObj.genericMethodTwoGenArgs(dbl, bool));
        System.out.println(boolObj.genericMethodTwoGenArgs(bool, chr));
        System.out.println(charObj.genericMethodTwoGenArgs(chr, str));*/

        stringObj.genericMethodHalfGenArgs(str, "Hello");
        intObj.genericMethodHalfGenArgs(num, "World");
        doubleObj.genericMethodHalfGenArgs(dbl, "!");
        boolObj.genericMethodHalfGenArgs(bool, "Bye");
        charObj.genericMethodHalfGenArgs(chr, "World");
    }
}


//создать класс GenericMethodsInGenericClassTRunner с методом main и в нем:
//-- создать обьекты типа GenericMethodsInGenericClassT<T> с параметрами типа String,
// Integer, Double и всеми типами, которые содержаться в пакете playground.essence
//-- вызывать каждый из методов у каждого из обьектов, в случае,
// если метод возвратный - отпечатать возвращаемое им значение в консоль

package homework.day5;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T obj) {
        System.out.println("I am an object of " + obj.getClass().getSimpleName() + " class");
    }

    public String genericMethodTwoGenArgs(T obj1, T obj2) {
        return "We are objects of " + obj1.getClass().getName() + " class and " + obj2.getClass().getName() + " class";
    }

    public void genericMethodHalfGenArgs(T obj, String str) {
        System.out.println("I got an object of " + obj.getClass().getName() + " class and string with " + str.length() + " characters");
    }
}

//-- невозвратный метод genericMethodOneGenArg, принимающий аргумент переменного типа и печатающий
// в консоль фразу "I am an object of X class", где X - название класса передаваемого аргумента
//-- метод genericMethodTwoGenArgs, принимающий 2 аргумента переменного типа и возвращающий
// строку "We are objects of X class and Y class", где X и Y - название классов передаваемых аргументов
//-- невозвратный метод genericMethodHalfGenArgs, принимающий 1 аргумент переменного типа и второй
// аргумент типа String, и печатающий в консоль фразу "I got an object of X class and string
// with N characters", где X - название класса передаваемых аргументов, N - количество символов в переданной строке

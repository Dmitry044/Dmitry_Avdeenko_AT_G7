package homework.day1.base_task;

public class TrainMethodsString {
    public void printMama(){
        System.out.println("мама мыла раму");
    }

    public void printPapa(){
        System.out.println("папа мыла раму");
    }

    public static void printString(String args){
        System.out.println(args);
    }

    public static void printMamaString(String arg){
        System.out.println("мама мыла " + arg);
        //создать невозвратный метод printMamaString, который принимает
        // на вход строку и печатает в консоль «мама мыла » и эту строку
    }
}

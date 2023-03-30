package classwork.day9.task3;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new);  //adding constructor
    }
}

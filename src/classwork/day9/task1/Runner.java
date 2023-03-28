package classwork.day9.task1;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(() -> 1.1);
        mc.justMethod(() -> {
            double pi = 3.14;
            return pi;
        });
    }
}

package classwork.day4;

public class RunnerEzh {

    public static void main(String[] args) {
        Ezh ezh = new Ezh("Max", 22);
        Ezh ezh2 = new Ezh("Max", 22);


        System.out.println("jhg".equals("asd"));
        System.out.println("jhg".equals("asD"));
        System.out.println("jhg".equalsIgnoreCase("asd"));
        System.out.println("jhg".equalsIgnoreCase("asD"));
"jhg".equals("asd");



        //doTest("yy", "error");
        //doSomething(Ezh ezh);


        if (ezh.age == ezh2.age && ezh.name.equals(ezh2.name)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test passed");
        };

        System.out.println((ezh2 == ezh)); // проверяет тот ли этот же объект
        //Ezh ezh = new Ezh("Max", 22);
        //Ezh ezh2 = ezh;


        System.out.println(ezh.toString());

        System.out.println(ezh.hashCode());
        System.out.println(ezh2.hashCode());
    }

    public static void doTest(Ezh ezh, String msg){
        if(ezh.equals(ezh)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test passed" + msg);
        }
    }

    public static void doTest(Ezh ezh, String msg, String uuu){
        if(ezh.equals(ezh)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test passed" + msg + uuu);
        }
    }

    public static void doSomething(Ezh ezh){
        if(ezh.equals(ezh)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test passed");
        }
}
}
//в консоль отображаются логи


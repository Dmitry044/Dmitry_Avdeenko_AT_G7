package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TwoArrayList {
    public static void main(String[] args) {


        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("test");
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);

        t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("test");
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);

    }
}

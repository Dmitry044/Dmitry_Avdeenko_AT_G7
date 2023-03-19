package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");
        for (String name : names) {
            System.out.println(name + " ");
        }

        names.set(1, "Оля");
        names.set(3, "Катя");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.remove("Оля");
        names.remove(3);
        for(String name : names){
            System.out.println(name + " ");
        }


    }
}

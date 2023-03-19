package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String color : colors) {
            System.out.println(color + " ");
        }
        colors.add(2, "Pink");
        colors.add(4, "Yellow");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i) + " ");
        }

        System.out.println();
        System.out.println(colors.get(0) + " " + colors.get(4));


    }
}

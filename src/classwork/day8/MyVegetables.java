package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyVegetables {
    public static void main(String[] args) {


        List<String> vegetable = new ArrayList<>();
        vegetable.add("Помидор");
        vegetable.add("Огурец");
        vegetable.add("Кабачок");
        vegetable.add("Батат");
        vegetable.add("Картошка");
        for (String name : vegetable) {
            System.out.println(vegetable + " ");
        }

        int counter = 0;
        for (String count : vegetable) {
            if (count.matches("а")) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < vegetable.size(); i++) {
            System.out.println(vegetable.get(i));
        }

        vegetable.remove("Oгурец");
        vegetable.remove(3);
        for (String veg : vegetable) {
            System.out.println(veg + " ");
        }
    }
}

package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class MyArray_list {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();

        String mama = "мама мыла раму мыла";

        String[] mamaArray = mama.split(" ");

        for (String item : mamaArray) {
            myList.add(item);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String item : myList) {
            System.out.println(item);
        }
    }
}

package classwork.day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String mama = "мама мыла раму мыла";
        String[] mamaArray = mama.split(" ");
        for (String item : mamaArray) {
            mySet.add(item);
        }
        for (String item : mySet) {
            System.out.println(item);
        }

        System.out.println();
        Iterator<String> myIterator = mySet.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}

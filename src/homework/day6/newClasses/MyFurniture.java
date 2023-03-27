package homework.day6.newClasses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFurniture {
    public static void main(String[] args) {
        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));

        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidth());
        }
        System.out.println();

        Map<Integer, Chair> furnitureMap = new HashMap<>();

        furnitureMap.put(1, furniture.get(0));
        furnitureMap.put(3, furniture.get(1));
        furnitureMap.put(6, furniture.get(2));

        for (int key : furnitureMap.keySet()) {
            System.out.println(key + " ");
        }

        for (Chair value : furnitureMap.values()) {
            System.out.println(value + " ");
        }

        for (Map.Entry<Integer, Chair> entry : furnitureMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

//Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2) и
// шириной (2, 2, 4) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
//Создать пустую карту, где ключом является целое число, а значением объект стула
//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//Проитерировать карту и отпечатать ключи в консоль
//Проитерировать карту и отпечатать значения в консоль
//Проитерировать карту и отпечатать пары ключ-значение в консоль

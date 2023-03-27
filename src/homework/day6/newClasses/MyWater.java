package homework.day6.newClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyWater {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );

        for(Water watter : water){
            System.out.println(watter.getColor() + " " + watter.getSmell());
        }


    }
}

//Создать список воды (класса Water) water из 3 объектов воды с цветом (Прозрачная, Прозрачная, Мутная) и
// запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки


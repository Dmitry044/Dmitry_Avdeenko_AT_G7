package homework.day5;

import homework.day4.playground.essence.craft.air.Aircraft;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Rocket;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> twoStringObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stingIntObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stingDoubleObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> twoIntObj = new GenericMethodsInGenericClassTwoParams<>();


        GenericMethodsInGenericClassTwoParams<Rocket, Copter> rocketCopterObj = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(rocketCopterObj.genericMethodGenArgs(new Rocket(66, "roket"),
                new Copter(88, "copter")));

        rocketCopterObj.genericMethodHalfGenArgs(new Rocket(66, "roket"),
                new Copter(88, "copter"), "New row");

        rocketCopterObj.genericMethodHalfGenArgs(new Copter(66,"roket"),
                "second row");




    }


}


//- создать класс GenericMethodsInGenericClassTwoParamsRunner с методом main и в нем:
//-- создать обьекты типа GenericMethodsInGenericClassTwoParams <X, Y> с параметрами
// типа <String, String>, <String, Integer>, <String, Double>,  <Integer, Integer> и
// всеми типами, которые содержаться в пакете playground.essence, используя каждый из них хотя бы 1 раз
//-- вызывать каждый из методов у каждого из обьектов, в случае, если метод возвратный -
// отпечатать возвращаемое им значение в консоль

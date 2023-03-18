package homework.day5;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.essence.craft.air.Aircraft;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.craft.field.Car;
import homework.day4.playground.essence.craft.field.Moped;
import homework.day4.playground.essence.craft.field.Motorbike;
import homework.day4.playground.essence.craft.field.Vehicle;
import homework.day4.playground.essence.craft.hand.*;
import homework.day4.playground.essence.creatures.Animal;
import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.essence.creatures.Insect;
import homework.day4.playground.essence.creatures.Vertebrata;
import homework.day4.playground.essence.creatures.playground.*;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> twoStringObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stingIntObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stingDoubleObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> twoIntObj = new GenericMethodsInGenericClassTwoParams<>();


        GenericMethodsInGenericClassTwoParams<Rocket, Copter> rocketCopterObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Aircraft, Plane> aircraftPlaneObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Moped> carMopedObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Vehicle> motorbikeVehileObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> bottleCanObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Container, Mug> containerMugObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Storable, Rideable> storableRideableObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Transportable, Beetle> transportableBeetleObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> carrotChamomileObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Flower> crocodileFlowerObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Maylily> flyMaylilyObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mosquito, Pigeon> mosquitoPigeonObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plant, Potato> plantPotatoObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> radishRavenObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Vegetable> roseVegetableObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Animal, Crawlable> animalCrawlableObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Insect, Vertebrata> insectVertebrataObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Flyable, Matter> flyableMatterObj = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(rocketCopterObj.genericMethodGenArgs(new Rocket(66, "rocket"),
                new Copter(88, "copter")));

        rocketCopterObj.genericMethodHalfGenArgs(new Rocket(66, "rocket"),
                new Copter(88, "copter"), "New row");

        rocketCopterObj.genericMethodHalfGenArgs(new Copter(66, "rocket"),
                "second row");

        System.out.println(aircraftPlaneObj.genericMethodGenArgs(new Copter(77, "Aircraft"), new Plane(33, "plane")));
        aircraftPlaneObj.genericMethodHalfGenArgs(new Copter(77, "Aircraft"),
                new Plane(33, "plane"), "New row");
        aircraftPlaneObj.genericMethodHalfGenArgs(new Plane(7, "plane"), "add row");

        System.out.println((carMopedObj.genericMethodGenArgs(new Car(2, "car"), new Moped(4, "moped"))));
        carMopedObj.genericMethodHalfGenArgs(new Car(44,"opel"), new Moped(33, "moped"), "add string");
        carMopedObj.genericMethodHalfGenArgs(new Moped(2,"MG"), "add new string");



    }


}


//- создать класс GenericMethodsInGenericClassTwoParamsRunner с методом main и в нем:
//-- создать обьекты типа GenericMethodsInGenericClassTwoParams <X, Y> с параметрами
// типа <String, String>, <String, Integer>, <String, Double>,  <Integer, Integer> и
// всеми типами, которые содержаться в пакете playground.essence, используя каждый из них хотя бы 1 раз
//-- вызывать каждый из методов у каждого из обьектов, в случае, если метод возвратный -
// отпечатать возвращаемое им значение в консоль

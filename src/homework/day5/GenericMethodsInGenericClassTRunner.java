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

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> intObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Boolean> boolObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Character> charObj = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Aircraft> aircraftObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> planeObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> carObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> vehicleObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottleObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> containerObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Storable> storableObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rideable> rideableObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Transportable> transportableObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetleObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodileObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flower> flowerObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plant> plantObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radishObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vegetable> vegetableObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Animal> animalObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crawlable> crawlableObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Insect> insectObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vertebrata> vertebrataObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flyable> flyableObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Matter> matterObj = new GenericMethodsInGenericClassT<>();


        aircraftObj.genericMethodOneGenArg(new Copter(223, "Mi8 Aircraft"));
        aircraftObj.genericMethodTwoGenArgs(new Plane(3452, "Boeing 837 Aircraft"),
                new Rocket(7623, "Super Heavy Aircraft"));
        aircraftObj.genericMethodHalfGenArgs(new Copter(223, "Mi8 Aircraft"), "Aircraft");
        copterObj.genericMethodOneGenArg(new Copter(007, "Mi8 Copter"));
        copterObj.genericMethodTwoGenArgs(new Copter(223, "Mi8 Aircraft"),
                new Copter(227, "Mi88 Aircraft"));
        copterObj.genericMethodHalfGenArgs(new Copter(224, "Mi9 Aircraft"), "Copter");
        planeObj.genericMethodOneGenArg(new Plane(3452, "Boeing 837 Plane"));
        planeObj.genericMethodTwoGenArgs(new Plane(3434, "Boeing 34343 Plane"),
                new Plane(4343, "Boeing 4343 Plane"));
        planeObj.genericMethodHalfGenArgs(new Plane(4444, "Boeing 4444 Plane"), "Plane");
        rocketObj.genericMethodOneGenArg(new Rocket(7623, "Super Heavy Rocket"));
        rocketObj.genericMethodTwoGenArgs(new Rocket(7623, "Super Heavy Rocket"),
                new Rocket(7777, "Super Heavy Rocket"));
        rocketObj.genericMethodHalfGenArgs(new Rocket(7623, "Super Heavy Rocket"), "Rocket");
        carObj.genericMethodOneGenArg(new Car(223, "Lada Car"));
        carObj.genericMethodTwoGenArgs(new Car(214, "Moskvich Car"), new Car(222, "Opel Car"));
        carObj.genericMethodHalfGenArgs(new Car(214, "Volvo Car"), "Volvo");
        mopedObj.genericMethodOneGenArg(new Moped(3452, "Honda EM1 837 Moped"));
        mopedObj.genericMethodTwoGenArgs(new Moped(3453, "Suzuki EM1 837 Moped"),
                new Moped(3454, "Honda EM1 837 Moped"));
        mopedObj.genericMethodHalfGenArgs(new Moped(3453, "Suzuki EM1 837 Moped"), "Moped");
        motorbikeObj.genericMethodOneGenArg(new Motorbike(7623, "Suzuki GSX-R1000 Motorbike"));
        motorbikeObj.genericMethodTwoGenArgs(new Motorbike(7623, "Suzuki GSX-R1000 Motorbike"),
                new Motorbike(7623, "Suzuki GSX-R1000 Motorbike"));
        motorbikeObj.genericMethodHalfGenArgs(new Motorbike(7623, "Suzuki GSX-R1000 Motorbike"), "motorbike");
        vehicleObj.genericMethodOneGenArg(new Motorbike(7623, "Suzuki GSX-R1000 Vehicle"));
        vehicleObj.genericMethodTwoGenArgs(new Motorbike(7623, "Suzuki GSX-R1000 Vehicle"),
                new Motorbike(7623, "Suzuki GSX-R1000 Vehicle"));
        vehicleObj.genericMethodHalfGenArgs(new Motorbike(7623, "Suzuki GSX-R1000 Vehicle"), "Motorbike");
        bottleObj.genericMethodOneGenArg(new Bottle(11, "Bottle"));
        bottleObj.genericMethodTwoGenArgs(new Bottle(100, "Bottle"), new Bottle(50, "Bottle"));
        bottleObj.genericMethodHalfGenArgs(new Bottle(11, "Bottle"), "Milk");
        canObj.genericMethodOneGenArg(new Can(30, "Pepsi"));
        canObj.genericMethodTwoGenArgs(new Can(30, "Pepsi Medium"), new Can(30, "PepsiMax"));
        canObj.genericMethodHalfGenArgs(new Can(30, "Pepsi"), "Pepsi");
        containerObj.genericMethodOneGenArg(new Mug(88, "Mug"));
        containerObj.genericMethodTwoGenArgs(new Mug(88, "Mug"), new Bottle(44, "Mug small"));
        containerObj.genericMethodHalfGenArgs(new Mug(66, "Mug L"), "Mug");
        mugObj.genericMethodOneGenArg(new Mug(22, "Mug"));
        mugObj.genericMethodTwoGenArgs(new Mug(22, "MugTwo"), new Mug(22, "MugThree"));
        mugObj.genericMethodHalfGenArgs(new Mug(22, "Mug"), "Mug Print");
        storableObj.genericMethodOneGenArg(new Bottle(123, "Kefir"));
        storableObj.genericMethodTwoGenArgs(new Bottle(123, "Kefir"), new Can(123, "Juice"));
        storableObj.genericMethodHalfGenArgs(new Bottle(123, "Kefir"), "kefir");
        rideableObj.genericMethodOneGenArg(new Moped(56, "Java"));
        rideableObj.genericMethodTwoGenArgs(new Moped(56, "Java"), new Car(100, "BMW"));
        rideableObj.genericMethodHalfGenArgs(new Moped(56, "Java"), "Rideable");
        transportableObj.genericMethodOneGenArg(new Car(33, "Fiat"));
        transportableObj.genericMethodTwoGenArgs(new Car(33, "Fiat"), new Car(33, "Fiat"));
        transportableObj.genericMethodHalfGenArgs(new Car(33, "Fiat"), "Transportable");
        beetleObj.genericMethodOneGenArg(new Beetle(1, "zzz"));
        beetleObj.genericMethodTwoGenArgs(new Beetle(1, "zzz"), new Beetle(1, "zzz"));
        beetleObj.genericMethodHalfGenArgs(new Beetle(1, "zzz"), "zzzzz");
        carrotObj.genericMethodOneGenArg(new Carrot(33, "carrot"));
        carrotObj.genericMethodTwoGenArgs(new Carrot(133, "carrot"), new Carrot(233, "carrot"));
        carrotObj.genericMethodHalfGenArgs(new Carrot(33, "carrot"), "carrot");
        chamomileObj.genericMethodOneGenArg(new Chamomile(44, "flower"));
        chamomileObj.genericMethodTwoGenArgs(new Chamomile(44, "flower"),
                new Chamomile(44, "flower"));
        chamomileObj.genericMethodHalfGenArgs(new Chamomile(44, "flower"), "Chamomile");
        crocodileObj.genericMethodOneGenArg(new Crocodile(567, "crocodile"));
        crocodileObj.genericMethodTwoGenArgs(new Crocodile(567, "crocodile"),
                new Crocodile(567, "crocodile"));
        crocodileObj.genericMethodHalfGenArgs(new Crocodile(567, "crocodile"), "Crocodile");
        flowerObj.genericMethodOneGenArg(new Rose(60, "Red rose"));
        flowerObj.genericMethodTwoGenArgs(new Rose(60, "Red rose"), new Rose(60, "Red rose"));
        flowerObj.genericMethodHalfGenArgs(new Rose(60, "Red rose"), "Rose xxl");
        flyObj.genericMethodOneGenArg(new Fly(9, "fly"));
        flyObj.genericMethodTwoGenArgs(new Fly(9, "fly"), new Fly(9, "fly"));
        flyObj.genericMethodHalfGenArgs(new Fly(9, "fly"), "Fly");
        maylilyObj.genericMethodOneGenArg(new Maylily(22, "Malily"));
        maylilyObj.genericMethodTwoGenArgs(new Maylily(22, "Malily"),
                new Maylily(22, "Malily"));
        maylilyObj.genericMethodHalfGenArgs(new Maylily(22, "Malily"), "maylily");
        mosquitoObj.genericMethodOneGenArg(new Mosquito(22, "Mosquito"));
        mosquitoObj.genericMethodTwoGenArgs(new Mosquito(22, "Mosquito"),
                new Mosquito(22, "Mosquito"));
        mosquitoObj.genericMethodHalfGenArgs(new Mosquito(22, "Mosquito"), "mosquito");
        pigeonObj.genericMethodOneGenArg(new Pigeon(44, "Pigeon"));
        pigeonObj.genericMethodTwoGenArgs(new Pigeon(44, "Pigeon"), new Pigeon(44, "Pigeon"));
        pigeonObj.genericMethodHalfGenArgs(new Pigeon(44, "Pigeon"), "pigeon");
        plantObj.genericMethodOneGenArg(new Carrot(55, "plant"));
        plantObj.genericMethodTwoGenArgs(new Carrot(55, "plant"), new Carrot(55, "plant"));
        plantObj.genericMethodHalfGenArgs(new Carrot(55, "plant"), "plant print");
        potatoObj.genericMethodOneGenArg(new Potato(33, "Potato brown"));
        potatoObj.genericMethodTwoGenArgs(new Potato(33, "Potato brown"),
                new Potato(33, "Potato brown"));
        potatoObj.genericMethodHalfGenArgs(new Potato(33, "Potato brown"), "potato");
        radishObj.genericMethodOneGenArg(new Radish(7, "redis"));
        radishObj.genericMethodTwoGenArgs(new Radish(7, "redis"), new Radish(7, "redis"));
        radishObj.genericMethodHalfGenArgs(new Radish(7, "redis"), "Radish");
        ravenObj.genericMethodOneGenArg(new Raven(8, "Raven"));
        ravenObj.genericMethodTwoGenArgs(new Raven(8, "Raven"), new Raven(8, "Raven"));
        ravenObj.genericMethodHalfGenArgs(new Raven(8, "Raven"), "raven");
        roseObj.genericMethodOneGenArg(new Rose(99, "Yellow"));
        roseObj.genericMethodTwoGenArgs(new Rose(99, "Yellow"), new Rose(99, "Yellow"));
        roseObj.genericMethodHalfGenArgs(new Rose(99, "Yellow"), "rose");
        vegetableObj.genericMethodOneGenArg(new Carrot(11, "orange"));
        vegetableObj.genericMethodTwoGenArgs(new Potato(99, "Yellow"), new Radish(99, "Yellow"));
        vegetableObj.genericMethodHalfGenArgs(new Potato(99, "Yellow"), "vegetable");
        animalObj.genericMethodOneGenArg(new Pigeon(2, "bug"));
        animalObj.genericMethodTwoGenArgs(new Pigeon(2, "bug"), new Pigeon(2, "bug"));
        animalObj.genericMethodHalfGenArgs(new Pigeon(2, "bug"), "Animal");
        crawlableObj.genericMethodOneGenArg(new Beetle(5, "crawlable"));
        crawlableObj.genericMethodTwoGenArgs(new Beetle(5, "crawlable"), new Beetle(5, "crawlable"));
        crawlableObj.genericMethodHalfGenArgs(new Beetle(5, "crawlable"), "Crawlable");
        insectObj.genericMethodOneGenArg(new Mosquito(3, "Insect"));
        insectObj.genericMethodTwoGenArgs(new Mosquito(3, "Insect"), new Mosquito(3, "Insect"));
        insectObj.genericMethodHalfGenArgs(new Mosquito(3, "Insect"), "Insect");
        vertebrataObj.genericMethodOneGenArg(new Crocodile(55, "Vertbrata"));
        vertebrataObj.genericMethodTwoGenArgs(new Crocodile(55, "Vertbrata"),
                new Crocodile(55, "Vertbrata"));
        vertebrataObj.genericMethodHalfGenArgs(new Crocodile(55, "Vertbrata"), "Vertebrata");
        flyableObj.genericMethodOneGenArg(new Rocket(777, "Flyable"));
        flyableObj.genericMethodTwoGenArgs(new Rocket(777, "Flyable"), new Rocket(777, "Flyable"));
        flyableObj.genericMethodHalfGenArgs(new Rocket(777, "Flyable"), "Print flyable");
        matterObj.genericMethodOneGenArg(new Copter(55, "matter"));
        matterObj.genericMethodTwoGenArgs(new Copter(55, "matter"), new Copter(55, "matter"));
        matterObj.genericMethodHalfGenArgs(new Copter(55, "matter"), "matter");




        String str = "Hello World!";
        Integer num = 42;
        Double dbl = 3.14;
        Boolean bool = true;
        Character chr = 'c';

        stringObj.genericMethodOneGenArg(str);
        intObj.genericMethodOneGenArg(num);
        doubleObj.genericMethodOneGenArg(dbl);
        boolObj.genericMethodOneGenArg(bool);
        charObj.genericMethodOneGenArg(chr);

        System.out.println(stringObj.genericMethodTwoGenArgs(str, String.valueOf(num)));
        /*System.out.println(intObj.genericMethodTwoGenArgs(num, Integer.valueOf());
        System.out.println(doubleObj.genericMethodTwoGenArgs(dbl, bool));
        System.out.println(boolObj.genericMethodTwoGenArgs(bool, chr));
        System.out.println(charObj.genericMethodTwoGenArgs(chr, str));*/

        stringObj.genericMethodHalfGenArgs(str, "Hello");
        intObj.genericMethodHalfGenArgs(num, "World");
        doubleObj.genericMethodHalfGenArgs(dbl, "!");
        boolObj.genericMethodHalfGenArgs(bool, "Bye");
        charObj.genericMethodHalfGenArgs(chr, "World");
    }
}


//создать класс GenericMethodsInGenericClassTRunner с методом main и в нем:
//-- создать обьекты типа GenericMethodsInGenericClassT<T> с параметрами типа String,
// Integer, Double и всеми типами, которые содержаться в пакете playground.essence
//-- вызывать каждый из методов у каждого из обьектов, в случае,
// если метод возвратный - отпечатать возвращаемое им значение в консоль

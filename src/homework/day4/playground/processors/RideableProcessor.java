package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable){
        String direction = DirectionGenerator.generateDirection();
        rideable.drive(direction);
        System.out.println("Rideable " + rideable.getClass().getSimpleName() + " was driven to " + direction);
    }

    public void runRideable(Rideable rideable, String direction){
        rideable.drive(direction);
        System.out.println("Rideable " + rideable.getClass().getSimpleName() + "was driven to " + direction);
    }
}

//class RideableProcessor
//у него есть перегруженный публичный невозвратный метод:
//runRideable(Rideable rideable) - принимает обьект ездящего и вызывает у него метод drive,
// которому передает случайное направления, которое генерируется вызовом метода generateDirection()
// из утилиты DirectionGenerator
//runRideable(Rideable rideable, String direction) - принимает обьект ездящего и строку направления,
// и вызывает у первого метод drive, которому передает строку направления, переданную в качестве аргумента

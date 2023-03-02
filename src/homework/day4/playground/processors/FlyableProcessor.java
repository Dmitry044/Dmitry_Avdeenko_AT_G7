package homework.day4.playground.processors;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable){
        String direction = DirectionGenerator.generateDirection();
        flyable.fly(direction);
    }

    public void runFlyable(Flyable flyable, String direction){
        flyable.fly(direction);
    }
}

//-- package playground.processors
//-- class FlyableProcessor
//у него есть перегруженный публичный невозвратный метод:
//runFlyable(Flyable flyable) - принимает обьект летающего и вызывает у него метод fly,
// которому передает случайное направления, которое генерируется вызовом метода generateDirection()
// из утилиты DirectionGenerator
//runFlyable(Flyable flyable, String direction) - принимает обьект летающего и строку направления,
// и вызывает у первого метод fly, которому передает строку направления, переданную в качестве аргумента

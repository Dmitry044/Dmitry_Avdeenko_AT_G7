package homework.day4.playground.essence.creatures.playground;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.creatures.Insect;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        //System.out.println("Fly " + name + " is flying");
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + name + " and I am flying to " + direction);
    }
}

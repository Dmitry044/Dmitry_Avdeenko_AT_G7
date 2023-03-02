package homework.day4.playground.essence.creatures.playground;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.creatures.Insect;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String name) {
        super(mass, name);
    }
    @Override
    public void fly() {
        System.out.println("Mosquito " + name + " is flying");
    }
}

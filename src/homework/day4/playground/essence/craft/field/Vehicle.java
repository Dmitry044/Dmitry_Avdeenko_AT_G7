package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public void move() {
        System.out.println("Vehicle " + name + " is moving");
    }*/

    @Override
    public int move(int pointA, int pointB) {
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + name + " and I am moving from "
                + pointA + " to " + pointB);
        return pointB - pointA;
    }

    @Override
    public void ride() {
        System.out.println("Vehicle " + name + " is riding");
    }
}

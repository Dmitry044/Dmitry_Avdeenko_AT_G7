package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {

    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + name + " and I am flying to " + direction);
        //System.out.println("Aircraft " + name + " is flying");
    }



    @Override
    public int move(int pointA, int pointB) {
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + name + " and I am moving from "
                        + pointA + " to " + pointB);
        return pointB - pointA;
    }

    /*@Override
    public void move() {
        System.out.println("Aircraft " + name + " is moving");
    }*/

}

//принимает 2 целых числа и печатает в консоль фразу "I am N, my name is M and I am moving from point A to point B",
// где N - название класса соответствующего обьекта, М - значение name обьекта, А и В - числа,
// подставляемые из значения передаваемых аргументов, и возвращает целое число,
// являющееся разницей В и А

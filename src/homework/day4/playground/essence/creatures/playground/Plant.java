package homework.day4.playground.essence.creatures.playground;

import homework.day4.playground.essence.Matter;

public abstract class Plant extends Matter {

    protected String name;

    public Plant(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

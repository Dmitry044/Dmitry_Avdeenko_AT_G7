package homework.day4.playground.essence.craft.hand;

public class Bottle extends Container implements Storable{

    public Bottle(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store() {
        System.out.println("Bottle " + name + " is stored");

    }
}

package homework.day4.playground.essence.craft.hand;

public class Can extends Container implements Storable{
    public Can(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store() {
        System.out.println("Can " + name + " is stored");
    }
}

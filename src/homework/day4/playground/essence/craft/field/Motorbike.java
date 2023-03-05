package homework.day4.playground.essence.craft.field;

public class Motorbike extends Vehicle{
    public Motorbike(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I amd driving to %s", getClass().getSimpleName(), name, direction);

        //принимает строку направления движения и печатает в консоль фразу "I am N, my name is M and
        // I amd driving to D", где N - название класса соответствующего обьекта,
        // М - значение name обьекта, D - строка, подставляемая из значения передаваемого аргумента
    }
}

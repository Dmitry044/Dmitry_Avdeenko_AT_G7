package homework.day4.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    //разобраться что сюда добавить

    public void eat(Insect food){
        System.out.printf("I am %s and I am eating %s", name, food.getName());
    }
}

package homework.day4.playground.essence.creatures.playground;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.essence.creatures.Insect;


public class Beetle extends Insect implements Crawlable {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home){
        int familyMembers = home.getMass() / mass;
        if(familyMembers > 0){
            System.out.printf("I am %s and I will nest there with %s my family members!", name, familyMembers);
        } else {
            System.out.println("This carrot is too small for nesting");
        }
    }

    @Override
    public void crawl() {
        System.out.printf("Beetle " + name + " is crawling");
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units",
                getClass().getSimpleName(), name, direction, distance);
        System.out.println("vz-vz-vzz-zz..");
    }
}

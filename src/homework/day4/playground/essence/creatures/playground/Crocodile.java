package homework.day4.playground.essence.creatures.playground;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.essence.creatures.Vertebrata;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl() {
        System.out.printf("Crocodile " + name + " is crawling");
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s , my name is %s and I am crawling to %s for %s units",
                getClass().getSimpleName(), name, direction, distance);
        System.out.println("wr-wr-wrr-r..");
    }
}



package homework.day4.playground.runners;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.essence.creatures.Insect;
import homework.day4.playground.essence.creatures.Vertebrata;
import homework.day4.playground.essence.creatures.playground.Beetle;
import homework.day4.playground.essence.creatures.playground.Crocodile;
import homework.day4.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl() {
            }
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlableProcessor.runCrawlable(crawlableCrocodile);
        crawlableProcessor.runCrawlable(crawlableBeetle);
        //crawlableProcessor.runCrawlable(vertebrataCrocodile); //выяснить почему не принимает объект
        //crawlableProcessor.runCrawlable(insectBeetle);
        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(aBeetle);

        crawlableProcessor.runCrawlable(crawlableBeetle, "никуда");
        crawlableProcessor.runCrawlable(crawlableBeetle, "налево");

        crawlableProcessor.runCrawlable(crawlableCrocodile, "назад", 37);

        crawlableProcessor.runCrawlable(anonymousCrawlable, "вниз", 37);

    }
}

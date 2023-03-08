package homework.day4.playground.processors;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.utils.DirectionGenerator;
import homework.day4.playground.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable){
        String direction = DirectionGenerator.generateDirection();
        int distance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction,distance);
    }

    public void runCrawlable(Crawlable crawlable, String direction){
        int distance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, distance);
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance){
        crawlable.crawl(direction, distance);

    }


}

//class CrawlableProcessor
//
//у него есть перегруженный публичный невозвратный метод:
//runCrawlable(Crawlable crawlable) - принимает обьект ползающего и вызывает у него метод crawl,
// которому передает случайное направление, генерируемое вызовом метода generateDirection()
// из утилиты DirectionGenerator, и случайную дистанцию, генерируемую вызовом метода generateDistance()
// из утилиты DistanceGenerator

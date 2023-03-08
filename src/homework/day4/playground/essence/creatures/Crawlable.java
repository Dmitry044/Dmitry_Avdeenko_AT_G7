package homework.day4.playground.essence.creatures;

public interface Crawlable {
    void crawl();

    void crawl(String direction, int distance);
}

//- принимает строку направления движения и целое число растояния, и печатает в консоль
// фразу "I am N, my name is M and I am crawling to D for F units",
// где N - название класса соответствующего обьекта, М - значение name обьекта,
// D и F - значения передаваемых аргументов, при этом после проползания крокодил издает
// в консоль "wr-wr-wrr-r..", а жук "vz-vz-vzz-zz.."



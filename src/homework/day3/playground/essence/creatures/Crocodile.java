package homework.day3.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units\n", this.getClass().getSimpleName(),
                getName(), direction, distance);
        System.out.println("wr-wr-wrr-r..");
    }
}

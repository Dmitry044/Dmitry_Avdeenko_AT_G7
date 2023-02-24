package project.composition;

public class SparklingWater extends Water {
    private Bubble[] bubbles;

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }
    public void degas() {
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null){
                bubbles[i].cramp();
                bubbles[i] = null;
            }
        }
    }
}


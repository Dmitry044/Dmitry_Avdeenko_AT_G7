package project.boxing;

import project.composition.Bubble;
import project.composition.SparklingWater;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume){
        this.volume = volume;
        this.water = new SparklingWater();
        Bubble[] bubbles = new Bubble [(int) (1000 * volume)];
        for (int i = 0; i < bubbles.length; i++){
            bubbles[i] = new Bubble();
        }
        water.pump(bubbles);
    }

    public void open(){
        water.degas();
    }
}

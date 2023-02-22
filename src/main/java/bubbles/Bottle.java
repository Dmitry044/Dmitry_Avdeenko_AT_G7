
package bubbles;

public class Bottle {
    private double volume;
    private Water water;

    public Bottle(double volume, Water water){
        this.volume = volume;
        this.water = water;
    }

    public double getVolume() {
        return volume;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void open(){
        if(water instanceof SparklingWater){
            SparklingWater sparklingWater = (SparklingWater) water;
            sparklingWater.degas();
        } else {
            System.out.println("This is basic water");
        }
    }

}

//- создать класс Bottle
//- у него есть обьем
//- есть вода
//- есть метод open(), который вызывает метод degas() в газировке
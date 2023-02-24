package project.boxing;

import project.composition.Bubble;
import project.composition.SparklingWater;
import project.composition.Water;

public class Bottle {
    private double volume;
    //private SparklingWater water;
    private Water water;

    public Bottle(double volume){
        this.volume = volume;
        int numBubbles = (int)(volume*1000);
        Bubble[] bubbles = new Bubble [numBubbles];
        for (int i = 0; i < numBubbles; i++){
            bubbles[i] = new Bubble();
        }
        this.water = new Water(bubbles);
    }

    public void open(){
        this.water.setOpened(true);
    }

    public void warm(int temperature){
        this.water.setTemperature(temperature);
    }

    public Water getWater(){
        return this.water;
    }

    public void setWater(Water water){
        this.water = water;

    }
}


//Bottle:
//------ содеждит приватные поля double volume, Water water
//------ содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
//------ есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
//
//------ есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
//------ есть публичный метод Water getWater() возвращающий обьект воды
//------ есть публичный метод setWater(Water water) добавляющий новый обьект воды
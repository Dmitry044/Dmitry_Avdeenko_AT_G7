
package bubbles;

public class SparklingWater extends Water {
    public Bubble[] bubbles;

    public SparklingWater(String color, String transparent, String smell, double temprature, Bubble[] bubbles) {
        super(color, transparent, smell, temprature);
        this.bubbles = bubbles;
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }
    public void degas() {
        int bubblesToRemove = bubbles.length / 10;
        for (int i = 0; i < bubblesToRemove; i++) {
            bubbles[i].cramp();
        }
    }

    @Override
    public void drink() {
    }
}



//- создать класс SparklingWater, являющийся дочерним Water
//- у газировки есть пузырьки
//- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- 1 литр воды содержит 10 тыс пузырьков
//- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
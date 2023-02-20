package bubbles;

public class Bubbles {
    private double volume;
    private String gas;

    public Bubbles(double volume, String gas){
        this.volume = 0.3;
        this.gas = gas;
    }

    public void cramp(){
        System.out.println("Cramp");
    }


}

//2. BubbleTask (для него создаем отдельный пакет bubbles)
//- создать класс Bubble
//- у пузырька должен быть обьем, газовый состав
//- он должен уметь лопаться с выводом в консоль «Cramp!»
//- обьем пузырька постоянный и равен 0.3 мм2,
// а газовый состав переменный в зависимости от образующего газа и задается в конструкторе класса

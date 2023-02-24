package homework.day1.base_task;

public class Bee {
    String gender;
    long weight;

    public Bee(){
        this.gender = "boy";
        this.weight = 120;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public long getWeight(){
        return weight;
    }
    public void setWeight(long weight){
        this.weight = weight;
    }

    public void printBeeDetails(){
        System.out.println("Я легче лося в " + (500/weight) + " раз");
    }



}

//- создать класс Bee и в нем
//-- строковое поле gender
//-- длинное целочисленное поле weight
//-- конструктор, принимающий пол и массу и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printBeeDetails, который делит 500 кг на массу пчелы
// и печатает в консоль информацию о ней в виде "Я легче лося в <> раз"

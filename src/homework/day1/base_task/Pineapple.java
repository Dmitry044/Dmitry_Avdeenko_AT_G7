package homework.day1.base_task;

public class Pineapple {
    String grade;
    double heatCapacity;

    public Pineapple(){
        this.grade = "first";
        this.heatCapacity = 100;
    }

    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public double getHeatCapacity(){
        return heatCapacity;
    }
    public void setHeatCapacity(double heatCapacity){
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails(){
        if (heatCapacity >= 2140){
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }
    }




}

//- создать класс Pineapple и в нем
//-- строковое поле grade
//-- дробное числовое поле heatCapacity
//-- конструктор, принимающий сорт и теплоемкость и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printPineappleDetails, который сравнивает теплоемкость ананаса с 2140 и если она больше,
// то печатает в консоль "Я ананас, теплоемкость которого больше, чем у ветчины",
// в противном случае печатает в консоль "В ветчине тепла запасется больше :("

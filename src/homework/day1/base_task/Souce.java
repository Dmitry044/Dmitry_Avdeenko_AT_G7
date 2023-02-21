package homework.day1.base_task;

public class Souce {
    String name;
    String color;

    public Souce(){
        this.name = "Ketchup";
        this.color = "red";
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void printSouceDetails(){
        System.out.println("Это соус " + name + " " + color + " цвета");
    }
}

//- создать класс Souce и в нем
//-- строковое поле name
//-- строковое поле color
//-- конструктор, принимающий имя и цвет и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printSouceDetails, \
// который печатает в консоль информацию о соусе в виде "Это соус <имя соуса> <цвет соуса> цвета"

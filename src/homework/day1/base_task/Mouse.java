package homework.day1.base_task;

public class Mouse {

    public String name;
    public int age;

    public Mouse(){
        this.name = "TOM";
        this.age = 3;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails(){
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет");
    }


}

//- создать класс Mouse и в нем
//-- строковое поле name
//-- целочисленное поле age
//-- конструктор, принимающий имя и возраст и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printMouseDetails, который печатает в консоль информацию
// о мыши в виде "Я мышь, меня зовут <имя мыши> и мне <возраст мыши> лет"

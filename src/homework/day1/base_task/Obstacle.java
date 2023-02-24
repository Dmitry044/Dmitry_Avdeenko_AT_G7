package homework.day1.base_task;

public class Obstacle {
    String description;
    String severity;

    public Obstacle(){
        this.description = "bug";
        this.severity = "critical";
    }

    public String getDescription(){
        return description = description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getSeverity(){
        return severity = severity;
    }
    public void setSeverity(String severity){
        this.severity = severity;
    }

    public void printObstacleDetails(){
        System.out.println("Возникло " + severity + " препятствиие " + description);
    }

}

//- создать класс Obstacle и в нем
//-- строковое поле description
//-- строковое поле severity
//-- конструктор, принимающий описание и важность и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printObstacleDetails, который печатает в консоль информацию
// о трудности в виде "Возникло <важность> препятствиие <описание препятствия>"

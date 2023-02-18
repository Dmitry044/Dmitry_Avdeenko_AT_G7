package bubbles;

public abstract class Water {
    private String color;
    private String transparent;
    private String smell;
    private double temprature;

    public Water(String color, String transparent, String smell, double temprature) {
        this.color = color;
        this.transparent = transparent;
        this.smell = smell;
        this.temprature = temprature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparent() {
        return transparent;
    }

    public void setTransparent(String transparent) {
        this.transparent = transparent;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public double getTemprature() {
        return temprature;
    }

    public void setTemprature(double temprature) {
        this.temprature = temprature;
    }

    public abstract void drink();


}

//- создать абстрактный класс Water
//- у воды есть такие характеристики, цвет, прозрачность, запах, температура

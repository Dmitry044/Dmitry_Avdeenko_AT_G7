package project.composition;

public class Water {
    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public Water(Bubble[] bubbles) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setOpened(boolean b) {
    }
}


//Water:
//------ содеждит приватные поля String color = "no", String transparency = "transparent",
// String smell = "no", int temperature = 0
//------ содеждит геттеры и сеттеры ко всем полям

package homework.day6.newClasses;

import java.util.Objects;

public class Bubble {
    private int volume;
    private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bubble bubble = (Bubble) o;
        return volume == bubble.volume && name.equals(bubble.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}

//В отдельном пакете подготовить следующие классы обьектов (все поля private, конструктор с
// инициализацией всех полей, переписанные тустринг, хеш-код, иквалз, геттеров и сеттеров на каждое поле):
//-- Bubble (поля int volume, String name)
//-- Person (поля int age, String name)
//-- Water (поля String color, String smell)
//-- Sand (поля int weight, String name)
//-- Chair (поля int height, int width)

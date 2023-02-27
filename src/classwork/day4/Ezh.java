package classwork.day4;

import java.util.Objects;

public class Ezh {
    String name;
    int age;

    public Ezh(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "My age is " + this.name + "name " + this.age ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ezh ezh = (Ezh) o;
        return age == ezh.age && Objects.equals(name, ezh.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

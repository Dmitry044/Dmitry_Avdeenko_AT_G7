package homework.day4.playground.essence.creatures.playground;

import homework.day4.playground.essence.creatures.Insect;

public class Beetle extends Insect {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home){
        int familyMembers = home.getMass() / mass; //разобраться почему не берет массу морковки
        if(familyMembers > 0){
            System.out.printf("I am %s and I will nest there with %s my family members!", name, familyMembers);
        } else {
            System.out.println("This carrot is too small for nesting");
        }



    }


}

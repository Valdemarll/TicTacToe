package Task1;

import java.lang.reflect.Field;

public class Animal implements Comparable{
    int age;
    String species;
    Animal(int age, String species){
        this.age = age;
        this.species = species;
    }

    @Override
    public boolean compare(Object object){
        if (object instanceof Animal){
            if (((Animal) object).age == this.age){
                if (((Animal) object).species == this.species){
                    return true;
                }
            }
        }
        return false;
    }
}

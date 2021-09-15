package Task1;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Human implements Comparable{
    int age;
    String name;
    String nationality;
    Human(int age, String name, String nationality){
        this.age = age;
        this.name = name;
        this.nationality = nationality;
    }

    @Override
    public boolean compare(Object object){
        if (object instanceof Human){
            if (((Human) object).age == this.age){
                if (((Human) object).name == this.name){
                    if (((Human) object).nationality == this.nationality){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}

package Task1;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(17, "Vasiliy", "russian");
        Human human2 = new Human(17, "Vasiliy", "russian");

        System.out.println(human1.compare(human1));

        Animal animal1 = new Animal(3, "cat");
        Animal animal2 = new Animal(4, "cat");

        System.out.println(animal1.compare(animal2));
        System.out.println(animal2.compare(human1));
    }
}

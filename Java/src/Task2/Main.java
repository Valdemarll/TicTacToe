package Task2;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {new Programmer(), new Fireman(), new Doctor()};

        for (int i = 0; i < workers.length; i++){
            System.out.println(workers[i].work());
        }
    }
}

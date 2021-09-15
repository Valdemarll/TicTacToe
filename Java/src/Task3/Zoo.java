package Task3;

public class Zoo {
    Animal[] zoo;
    public Zoo(Animal[] zoo){
        this.zoo = zoo;
    }

    public String printAnimals(){
        String result = "";
        for (int i = 0; i < this.zoo.length; i++){
            result += this.zoo[i].name + "\n";
        }
        return result;
    }

    public String printHerbivoreAnimals(){
        String result = "";
        for (int i = 0; i < this.zoo.length; i++){
            if (this.zoo[i].herbivore){
                result += this.zoo[i].name + "\n";
            }
        }
        return result;
    }

    public String printFleshEatingAnimals(){
        String result = "";
        for (int i = 0; i < this.zoo.length; i++){
            if (this.zoo[i].fleshEating){
                result += this.zoo[i].name + "\n";
            }
        }
        return result;
    }
}

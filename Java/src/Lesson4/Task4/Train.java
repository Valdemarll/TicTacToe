package Lesson4.Task4;

public class Train {
    Wagon[] wagons;
    Train(Wagon[] wagons){
        this.wagons = wagons;
    }

    public int allPassengerCount(){
        int count = 0;
        for (int i = 0; i < this.wagons.length; i++){
            count += this.wagons[i].passengerCount;
        }
        return count;
    }

    public int trainPassengerCount(){
        int count = 0;
        for (int i = 0; i < this.wagons.length; i++){
            if (this.wagons[i].name != "Locomotive") {
                count += this.wagons[i].passengerCount;
            }
        }
        return count;
    }

    public int staffPassengerCount(){
        int count = 0;
        for (int i = 0; i < this.wagons.length; i++){
            if (this.wagons[i].name == "Locomotive") {
                count += this.wagons[i].passengerCount;
            }
        }
        return count;
    }

    public int coupePassengerCount(){
        int count = 0;
        for (int i = 0; i < this.wagons.length; i++){
            if (this.wagons[i].name == "CoupeWagon") {
                count += this.wagons[i].passengerCount;
            }
        }
        return count;
    }

    public int plackartPassengerCount(){
        int count = 0;
        for (int i = 0; i < this.wagons.length; i++){
            if (this.wagons[i].name == "Plackart") {
                count += this.wagons[i].passengerCount;
            }
        }
        return count;
    }
}

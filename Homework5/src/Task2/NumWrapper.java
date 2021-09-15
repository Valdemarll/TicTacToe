package Task2;

public class NumWrapper {
    Number number;
    NumWrapper(Number num){
        this.number = num;
    }

    public int getNum(){
        if (this.number == null){
            return 0;
        }else {
            return this.number.num;
        }
    }

}

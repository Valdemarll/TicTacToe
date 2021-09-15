package Task4;

public class Calculator {
    public int calc(int x, int y, AddCalc addCalc){
        return addCalc.calc(x, y);
    }
    public int calc(int x, int y, SubCalc subCalc){
        return subCalc.calc(x, y);
    }
    public int calc(int x, int y, MultiplyCalc multiplyCalc){
        return multiplyCalc.calc(x, y);
    }
    public int calc(int x, int y, DivCalc divCalc){
        return divCalc.calc(x, y);
    }
}

package pl.infoshare.l11.zad1_2;

public class MathOperation implements FundMathOp {


    @Override
    public <T extends Number> double add(T a, T b) {
        return a + b;
    }

    @Override
    public <T extends Number> double divide(T a, T b) {
        return a / b;
    }
    @Override
    public <T extends Number> double substract(T a, T b) {
        return a - b;
    }

    @Override
    public <T extends Number> double multiply(T a, T b) {
        return a * b;
    }
}

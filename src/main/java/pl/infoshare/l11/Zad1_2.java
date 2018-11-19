package pl.infoshare.l11;

import pl.infoshare.l11.zad1_2.FundMathOp;
import pl.infoshare.l11.zad1_2.MathOperation;

public class Zad1_2 {

    public static void main (String[] args){

        FundMathOp mathOp = new MathOperation();

        System.out.println(mathOp.add(5,5));
        System.out.println(mathOp.divide(6,7));
        System.out.println(mathOp.multiply(9,10));
        System.out.println(mathOp.substract(10,5));


    }

}

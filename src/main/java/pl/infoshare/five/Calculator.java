package pl.infoshare.five;

public class Calculator {



    public int divide (int num1, int num2){

        if(num2 == 0) return 0;

        return num1/num2;
    }

    public int add (int num1, int num2){

        return num1 + num2;
    }

    public int substract (int num1, int num2){

        return num1 - num2;
    }

    public int multiply (int num1, int num2){

        return num1*num2;
    }
}

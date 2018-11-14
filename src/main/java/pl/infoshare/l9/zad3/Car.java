package pl.infoshare.l9.zad3;

public class Car {

    public String color;
    public boolean engine = false;

    public void startEngine(){

        engine = true;

    }
    public void printColor (String color){
        System.out.println("Auto jest koloru: " + color );
    }

}

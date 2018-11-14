package pl.infoshare.l10.zad1;

public abstract class Animal {

    public boolean live(){

        return true;
    }


    public void eat(){

        System.out.println("omnomnomnom");

    }

    public abstract void makeSound ();


}

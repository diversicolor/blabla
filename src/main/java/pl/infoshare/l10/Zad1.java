package pl.infoshare.l10;

import pl.infoshare.l10.zad1.Animal;
import pl.infoshare.l10.zad1.Cat;
import pl.infoshare.l10.zad1.Dog;

public class Zad1 {

    public static void main(String[] args){

        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println("Cat make sound: "); cat.makeSound();
        System.out.println("Dog make sound: "); dog.makeSound();

    }

}

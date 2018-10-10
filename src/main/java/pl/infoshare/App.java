package pl.infoshare;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /*
       Pierwsze zajecia
        */

        String name = "Karol";
        String lastName = "Mazanowski";

        byte age = 26;
        String city = "Rypin";

        System.out.println(name + " " + lastName);


        System.out.println(age + "\t" + city);

        /*
        Rzutowanie
         */

        double a = (double) 5;
        System.out.println(a);
        double b = 2.34;
        double c = 10.506;

        double result = b/c;

        System.out.println(result);
        System.out.println("Wynik to: " + b/c);

        /*
        Instrukcja warunkowa
         */

        byte age1 = 18;


        if (age1 >= 20 && age1 <= 30)
        {
            System.out.println("Jestes pelnoletni");
        }
        else if (age1 == 26 || age1 == 28)
        {
            System.out.println("Masz 26 lub 28 lat");
        }
        else{
            System.out.println("Masz ponizej 20 lat");
        }

        int agePrim = 20;

        switch (agePrim){
            case 20:{
                System.out.println("Wiek jest rowny 20");
                break;
            }
            case 30:{
                System.out.println("Wiek jest rowny 30");
                break;

            }
            default:{
                System.out.println("Wiek jest inny");
                break;
            }

    }
    }

}

package pl.infoshare;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        /*
        Zadanie 1
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int numberFromKeyboard = scanner.nextInt();
        System.out.println("Floatig-point number version: " + (double) numberFromKeyboard);

        /*
        Zadanie 2
        */


        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = scanner1.nextInt();

        if (userAge >= 18 && userAge < 123) {
            System.out.println("You are of age.");
        } else if (userAge > 123) {
            System.out.println("You are incredible old!");
        } else {
            System.out.println("You are underage.");
        }

        /*
        Zadanie 3
         */

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Login: ");
        String login = scanner2.nextLine();
        System.out.print("Password: ");
        String password = scanner2.nextLine();

        String user0 = "admin";
        String user1 = "user1";
        String user2 = "user2";

        String password0 = "hasło";
        String password1 = "hasło1";
        String password2 = "hasło2";


        if (login.equals(user0))
        {
            if (password.equals(password0))
            {
            System.out.println("You have logged in as an admin");
            }
        }
        if (login.equals(user1))
        {
            if (password.equals(password1))
            {
                System.out.println("You have logged in as user1");
            }
        }
        if (login.equals(user2))
        {
            if (password.equals(password2))
            {
                System.out.println("You have logged in as user2");
            }
        }



    }



}

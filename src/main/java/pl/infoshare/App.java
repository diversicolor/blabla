package pl.infoshare;


import java.util.Random;

import javax.sound.midi.Soundbank;

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
        Zadanie 1



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int numberFromKeyboard = scanner.nextInt();
        System.out.println("Floatig-point number version: " + (double) numberFromKeyboard);

        /*
        Zadanie 2



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



        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Login: ");
        String login = scanner2.nextLine();
        System.out.print("Password: ");
        String password = scanner2.nextLine();

        String user0 = "admin";
        String user1 = "user1";
        String user2 = "user2";


        /*
        Instrukcja warunkowa

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



    } */
       /*
    Zadanie 1

       int [] array = new int[6];

       array[0] = 5;
       array[1] = 7;
       array[2] = 0;
       array[3] = 3;
       array[4] = 5;
       array[5] = 6;

       System.out.println("Elementary: " + array [0] + " " + array [2] + " " + array [4]);

       */


       /*
       Zadanie 2


       for(int i =1 ; i < 11 ; i++)
       {
           System.out.println(i);
       }
       for(int i =1 ; i < 1001 ; i++)
       {
           System.out.println(i);
       }
       */


       /*
       for ( int i = 1000 ; i > 0 ; i-= 2
       ){

           System.out.println(i);
       }
        */

       /*int[] arrayFor = new int[1000];

       for (int i = 0 ; i < 1000 ; i ++){
           arrayFor[i] = i + 1;
       }

       for (int element : arrayFor){
           System.out.println(element);
       }
*/
      /* int[][]array2D = new int[10][10]; //super przyklad wyjasniajacy tablice 2D

       for (int i = 0; i < array2D.length ; i++){
           System.out.print("I'm in row no. " + i + " ");
           for (int j = 0 ; j < array2D.length ; j++){
               System.out.print("I'm in column no. " + j + " ");
           }
           System.out.println();
       }
*/
      /*
      for (int i = 0 ; i < 10 ; i++){
          for (int j = 0 ; j < 10; j++){

          }
      }
*/
//zadanie 1 lekcja 3
        /*
      int [] array = new int[11];
        Random radnom = new Random();
        int randomInt = radnom.nextInt(100 ) + 1;
      for (int i = 0 ; i < array.length ; i++){
          array[i] = radnom.nextInt(100) + 1;

      }

      for(int i = 0; i < array.length ; i++){
          if(i % 2 != 0) System.out.println("Index no. " + i + "\tvalue: " + array[i]);
      }


        System.out.println("________________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
*/
//zadanie 2 lekcja 3
        /*

        char [][] star = new char [10][10];
      for(int i = 0; i < star.length; i++){
          for(int j = 0; j < star.length; j++) {
              star[i][j] = '*';
          }
      }
      for(int i = 0; i < star.length; i++) {
          for (int j = 0; j < star.length; j++) {
              if (i % 2 == 0) System.out.print(star[i][j]);
              else System.out.print(" ");
          }
          System.out.println();
      }
*/
// Zadanie 3 Lekcja 3

        int winningNumber = new Random().nextInt( 10) + 1;

        Scanner guess = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj liczbe od 1 do 10");
            int number = guess.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Podales liczbe z innego przedzialu");
            }

            if (number == winningNumber) {
                System.out.println("Wygrales!");
                break;
            }
            else System.out.println("Graj dalej");

        }







    }



}

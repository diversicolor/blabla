package pl.infoshare;


import sun.font.ScriptRun;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

import javax.sound.midi.Soundbank;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

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
/*
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
*/
/*
        Scanner askOfNumber = new Scanner(System.in); //nowy obiekt pytajacy o numer

        System.out.print("Please, enter six number from 1 to 49: ");

        int [] userNumbers = new int[6]; //tablica 'teoretycznie' przechowujaca liczby


        int choices = 0;

        do{
            userNumbers[choices] = askOfNumber.nextInt();
            choices++;

        } while (choices < 6);

        if(userNumbers.length <=6) {
            int [] drawnNumbers = new int[6];
            Random lottery  = new Random();

            System.out.print("Drawn number are: ");
            for(int i = 0; i<6; i++) {

                drawnNumbers[i] = lottery.nextInt(49) + 1;
                System.out.print(drawnNumbers[i] + " ");

            }

            System.out.println();


            int winningNumbers = 0;

            for(int i = 0; i < drawnNumbers.length; i++) {
                for (int j = 0; j < userNumbers.length; j++) {

                    if (drawnNumbers[i] == userNumbers[j]) {

                        System.out.println("You lucky! : " + drawnNumbers[i]);
                        winningNumbers++;

                    }

                }
            }
            System.out.println("Numbers of right choices: "+ winningNumbers);




        }
*/
        //Zadanie 1 lekcja 4 22.10.2018
        /*
        String names [] = new String[5];
        names[0] = "Mirek";
        names[1] = "Krystyna";
        names[2] = "Mariusz";
        names[3] = "Bozena";
        names[4] = "Janusz";
        PrintWriter saveNames = new PrintWriter("./names.txt");
        for(int i = 0; i < names.length; i++) {

            saveNames.println(names[i] + "\n");

        }
        saveNames.close();
        */

        //Zadanie 2 lekcja 4 22.10.2018
        /*

        System.out.print("Enter your name and surname: ");
        Scanner readName = new Scanner(System.in);
        String UserNames = readName.nextLine();
        String UserNames1 = readName.nextLine();
        String UserNames2 = readName.nextLine();



        PrintWriter saveUserNames = new PrintWriter("./UserNames.txt");
        saveUserNames.println(UserNames);
        saveUserNames.println(UserNames1);
        //saveUserNames.append(UserNames2);// dodaje a nie nadpisuje jak println
        saveUserNames.close();
        */

        //Zadanie 3 lekcja 4 22.10.2018

        //Zadanie 4 lekcja 4 22.10.2018

/*
        Scanner takesText = new Scanner(System.in);

        System.out.println("Enter something: ");

        String text = takesText.nextLine();
        PrintWriter reverse = new PrintWriter("./Reverse.txt");
        //reverse.print(new StringBuilder(text).reverse().toString());
        String reversText = "";
        char[] letters = text.toCharArray();
        for(int i = letters.length - 1; i >= 0; i--){
            reversText += letters[i];
        }

        reverse.print(reversText);
        reverse.close();
*/
/*
        int a = 1000;
        byte b = (byte) a;

        System.out.println(a + "\n" + b);

        String username = "admin1";

        switch (username){
            case "admin2" : {
                System.out.println("Siema");
                break;
            }
            case "admin1" :
            case "admin" : {
                System.out.println("Tu cos sie dzieje, jezeli admin");
                break;
            }
            default: {
                System.out.println("Nie jestes adminem");
            }
        }
*/
        //Zadanie 4 lekcja 4 22.10.2018

        /*
        Scanner takesText = new Scanner(System.in);

        System.out.println("Enter something: ");

        String text = takesText.nextLine();
        PrintWriter reverse = new PrintWriter("./Reverse.txt");
        //reverse.print(new StringBuilder(text).reverse().toString());
        String reversText = "";
        char[] letters = text.toCharArray();
        for(int i = letters.length - 1; i >= 0; i--){
            reversText += letters[i];
        }

        reverse.print(reversText);
        reverse.close();
        */
//****************************************ZADANIA DOMOWE***************************************************************
        //Zadanie 5 22.10.18

        Files.move(Paths.get("D:\\ProgramowanieJava\\blabla\\Reverse.txt"),
            Paths.get("C:\\Users\\Gokiburi\\Desktop\\Reverse.txt"),
                StandardCopyOption.REPLACE_EXISTING);
        Files.copy(Paths.get("C:\\Users\\Gokiburi\\Desktop\\Reverse.txt"),
                Paths.get("C:\\Users\\Gokiburi\\Desktop\\ReverseCopy.txt"),
                StandardCopyOption.REPLACE_EXISTING);

        File Reverse = new File("C:\\Users\\Gokiburi\\Desktop\\Reverse.txt");
        Scanner inReverse = new Scanner(Reverse);
        String sentence = inReverse.nextLine();

        PrintWriter backToNormal = new PrintWriter("C:\\Users\\Gokiburi\\Desktop\\ReverseCopy.txt");
        backToNormal.print(new StringBuilder(sentence).reverse().toString());

        backToNormal.close();

    //Praca domowa

        URL homeWork = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(homeWork.openStream()));

        Files.createFile(Paths.get("./TXT.txt"));

        String onlineTxt;
        PrintWriter save = new PrintWriter("./TXT.txt");
        int numbersOfLine = 0;
        while ((onlineTxt = bufferedReader.readLine()) != null)
        {
            System.out.println(onlineTxt);
            save.println(onlineTxt);
            numbersOfLine++;
        }
        save.close();


        BufferedReader splittingColumns = new BufferedReader(new FileReader("./TXT.txt"));
        String lines = splittingColumns.readLine();
        String[] columns = lines.split("            ");

        int eachLines = 0
        while(eachLines < numbersOfLine && eachLines > 8) {

            columns = lines.split("            ");
            eachLines++;
        }
        System.out.println(columns[1]);



























    }
}

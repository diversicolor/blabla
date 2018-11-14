package pl.infoshare.l2.zad3;

import java.util.Scanner;


public class ReadInput {
    private Scanner scanner = new Scanner(System.in);


    public String readLogin(){

        System.out.print("Provide your login: ");

        return scanner.nextLine();
    }

    public String readPass(){

        System.out.print("Provide you pass: ");

        return scanner.nextLine();



    }

    public void hidePass(String txt){

        char [] password = txt.toCharArray();
        for(int i = 0; i < password.length; i++){

            password[i] = '*';
        }
    }




}

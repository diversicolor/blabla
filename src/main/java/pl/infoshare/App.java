package pl.infoshare;

import pl.infoshare.six.User;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws IOException {


// Zad 1
//        System.out.print("Provide username: ");
//        String username = readUserInput();
//
//        System.out.print("Provide password: ");
//        String password = readUserInput();
//
//        User user = new User(username, password);
//
//        System.out.println("Created new user: " + user.getUsername() + " " + "with password: " + user.getPassword());
//    }
//
//    private static String readUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//}

     //Zad 2

//        User user1 = generateUserFromUserInput();
//        User user2 = generateUserFromUserInput();
//
//        saveToFile(user1, user2);
//
//        List<String> userList = Files.readAllLines(Paths.get("./ex2.txt"));
//
//        User[]userArray = new User[userList.size()];
//
//        for(int i = 0; i <userArray.length; i++){
//            userArray[i] = generateUserFromFileInput(userList.get(i));
//        }
//
//        for (User user:userArray) {
//            System.out.println("Username: " + user.getUsername() + "\t" + "Password: " + user.getPassword());
//        }
//
//    }
//    private static User generateUserFromFileInput(String lineFromFile){
//        String[] userSplitted = lineFromFile.split(";");
//        return new User(userSplitted[0], userSplitted [1]);
//    }
//
//
//    private static void saveToFile(User... users) throws FileNotFoundException {
//        PrintWriter printWriter = new PrintWriter("./ex2.txt");
//        for (User user: users){
//            printWriter.append(user.getUsername() + ";" + user.getPassword() + "\n");
//        }
//        printWriter.close();
//
//    }
//
//    private static User generateUserFromUserInput (){
//        return new User(getFiedlFromUserInput("username"), getFiedlFromUserInput("password"));
//    }
//
//    private static String getFiedlFromUserInput (String field){
//
//        System.out.print("Provide " + field + ": ");
//        return readUserInput();
//    }
//
//
//    private static String readUserInput() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//}
    //Zad 3

        ReapeatConsole();

        String userChoice = readUserInput();

        ReadSelection(userChoice);

    }





    private static void ReadSelection(String option ) throws IOException {

        switch (option){

            case "1":{
                User user1 = generateUserFromUserInput();
                User user2 = generateUserFromUserInput();
                saveToFile(user1, user2);

                break;
            }
            case "2":{
                List<String> userList = Files.readAllLines(Paths.get("./ex3.txt"));

                User[]userArray = new User[userList.size()];

                for(int i = 0; i <userArray.length; i++){
                    userArray[i] = generateUserFromFileInput(userList.get(i));
                }

                for (User user:userArray) {
                    System.out.println("Username: " + user.getUsername() + "\t" + "Password: " + user.getPassword());
                }
                break;
            }
            default: {
                System.out.println("Error");
                break;
            }
        }

    }

    private static void ReapeatConsole() throws IOException {

        do {
            Console();
        }
        while();
    }




    private static void Console(){

        System.out.println("     MENU     ");
        System.out.println("Chose on of follow options" + "\n" + "1. Add new user" + "\n" + "2. Display users");
        System.out.print("1 or 2?: ");
    }
    private static User generateUserFromFileInput(String lineFromFile){
        String[] userSplitted = lineFromFile.split(";");
        return new User(userSplitted[0], userSplitted [1]);
    }


    private static void saveToFile(User... users) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("./ex3.txt");
        for (User user: users){
            printWriter.append(user.getUsername() + ";" + user.getPassword() + "\n");
        }
        printWriter.close();

    }

    private static User generateUserFromUserInput (){
        return new User(getFiedlFromUserInput("username"), getFiedlFromUserInput("password"));
    }

    private static String getFiedlFromUserInput (String field){

        System.out.print("Provide " + field + ": ");
        return readUserInput();
    }


    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}





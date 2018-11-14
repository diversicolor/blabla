package pl.infoshare.l2.zad3;


public class UserInformationValidator {



    public void checkInput (String login, String password){
         String admin = "admin";
         String adminPass = "admin1";
         String user = "user";
         String userPass = "user1";

        if( admin.equals(login) && adminPass.equals(password)){

            System.out.println("You logged as admin.");

        }
        else if(user.equals(login) && userPass.equals(password)){

            System.out.println("You logged as user.");
        }
        else{

            System.out.println("Access denied.");
        }


    }


}

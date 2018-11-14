package pl.infoshare.l2.zad2;

public class InputHandler {


    public void displayMassege() {
        System.out.print("Please provide your age: ");
    }

    public void handlerUserAge(byte userAge) {

        if (userAge >= 18 && userAge <= 123) {
            System.out.println("You are of age.");
        } else if (userAge > 123) {

            wrongAge();

        } else {
            System.out.println("You are underage.");
        }
    }

    private void wrongAge() {
        System.out.println("Please provide your age correctly.");
        displayMassege();
        InputReader inputReader = new InputReader();
        ifWrongAge(inputReader.readUserAge());
    }

    private void ifWrongAge(byte userAge){
        if (userAge >= 18 && userAge <= 123) {
            System.out.println("You are of age.");
        } else if (userAge > 123) {

            System.out.println("You provide wrong age. Closing the program.");

        } else {
            System.out.println("You are underage.");
        }
    }
}

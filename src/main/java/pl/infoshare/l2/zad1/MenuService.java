package pl.infoshare.l2.zad1;

public class MenuService {

    InputReader inputReader = new InputReader();

    private void displayOrder(){
        System.out.print ("Enter an integer: ");

    }

    private void displayMessage(int field) {
        System.out.println("Floatig-point number version: " + (double)field);

    }

    public void start(){

        displayOrder();
        displayMessage(inputReader.readUserInput());
    }


}

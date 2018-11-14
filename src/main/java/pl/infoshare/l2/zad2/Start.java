package pl.infoshare.l2.zad2;

public class Start {

    private InputReader inputReader = new InputReader();
    private InputHandler inputHandler = new InputHandler();

    public void start() {

        inputHandler.displayMassege();
        inputHandler.handlerUserAge(inputReader.readUserAge());

    }
}

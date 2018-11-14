package pl.infoshare.l2.zad3;

public class MenuStart {

    public void start(){

        UserInformationValidator userInformationValidator = new UserInformationValidator();
        ReadInput readInput = new ReadInput();

        userInformationValidator.checkInput(readInput.readLogin(),readInput.readPass());
        readInput.hidePass(readInput.readPass());

    }

}

package pl.infoshare.second_class.zad2;

import java.util.Scanner;

public class InputReader {

    public byte readUserAge(){

        Scanner readAge = new Scanner(System.in);
        return readAge.nextByte();

    }
}

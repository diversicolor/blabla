package pl.infoshare.l13.zad2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;




public class Zad2 {
    public static void main(String[] args) throws IOException {


        URL url = new URL("https://norvig.com/big.txt");
        long start = System.currentTimeMillis();

        Scanner s = new Scanner(url.openStream());

        List<String> lines = new ArrayList<>();

        while (s.hasNext()) {
            lines.add(s.nextLine());
        }

        System.out.println("Time to read the book: " + ((System.currentTimeMillis() - start) / 1000) + "s");

        System.out.println(lines.size());

        lines.stream().filter(p -> !p.equals("\n"))
                .map(p -> {
                    String a = p.replaceAll("\\.", "");
                    a = a.replaceAll(",", "");
                    return a.split(" ").length;
                })
                .collect(Collectors.toList());
        //  System.out.println(number);


    }
}

package pl.infoshare.l11;

public class Lekcja11 {

    public static void main (String[] args){

        Car car = new Ikarus();
        Bus bus = new Ikarus();
        Ikarus ikarus = new Ikarus();

        System.out.println(car.refuel(20.0));

        bus.stampTheTicket("Ulgowy");

        ikarus.honkTheHorn();

        Bus a = (Ikarus) bus;
        System.out.println(a);


    }


}

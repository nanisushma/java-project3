package day11;

public class SuperMarketCounterApp {

    public static void main(String[] args) {


        Door door1 = new Door();
        Door door2 = new Door();
        Door door3 = new Door();
        Door door4 = new Door();

        door1.incrementCounter();
        door1.incrementCounter();
        door1.incrementCounter();

        door2.decrementCounter();
        door3.decrementCounter();

        System.out.println(Door.getCounter());

        door4.decrementCounter();

        System.out.println(Door.getCounter());

    }
}

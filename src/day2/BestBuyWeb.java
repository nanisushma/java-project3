package day2;

public class BestBuyWeb {

    public static void main(String[] args) {

        Laptop macbook = new Laptop();

        macbook.setBrand("ios");
        macbook.setColor("gray");
        macbook.setConnectivity("wireless");
        macbook.setSize(13.5);
        macbook.setProcessorModel("1.1ghz");
        macbook.setOperatingSystem("mac os");
        macbook.setStorageCapacity(256);
        macbook.setSpeed(2152);

        System.out.print(macbook.getBrand());
        System.out.print(macbook.getColor());
        System.out.print(macbook.getConnectivity());
        System.out.print(macbook.getSize());
        System.out.print(macbook.getProcessorModel());
        System.out.print(macbook.getOperatingSystem());
        System.out.print(macbook.getStorageCapacity());
        System.out.print(macbook.getSpeed());




    }
}

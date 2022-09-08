package day2;

public class EbayWebApp {

    public static void main(String[] args) {

        Laptop macBookAir = new Laptop();

        macBookAir.setBrand("Ios");
        macBookAir.setColor("blue");
        macBookAir.setSize(13.5);
        macBookAir.setProcessorModel("intel 5");
        macBookAir.setStorageCapacity(512);
        macBookAir.setConnectivity("wireless");
        macBookAir.setPrice(1450);
        macBookAir.setSpeed(2215);
        macBookAir.setOperatingSystem("mac os");

        System.out.print(macBookAir.getBrand());
        System.out.print(macBookAir.getColor());
        System.out.print(macBookAir.getSize());
        System.out.print(macBookAir.getProcessorModel());
        System.out.print(macBookAir.getStorageCapacity());
        System.out.print(macBookAir.getConnectivity());
        System.out.print(macBookAir.getPrice());
        System.out.print(macBookAir.getSpeed());
        System.out.print(macBookAir.getOperatingSystem());






    }
}

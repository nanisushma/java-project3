package day2;

public class Laptop {


    //States
    private String brand;
    private String color;
    private double size;
    private float price;
    private String screenType;
    private String processorModel;
    private String operatingSystem;
    private double speed;
    private int storageCapacity;
    private String connectivity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }


    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    //Behaviour (Amazon)

    //-Add to Cart
    //-Review
    //-Share a link
    //-Buy Now
    //-Like Dislike
    //-Payment Plan
    //- Payment Method
    //- Tracking System
}
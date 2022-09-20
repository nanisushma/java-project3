package day19;

public class Employee {

    private String name;
    private int age;
    private String address;
    private double salary;

    public Employee () {
        System.out.println("Employee Constructor called");
    }

    public Employee(String name, int age, String address, double salary) {
        System.out.println("Employee Parameterized Constructor Called");
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        System.out.println("Employee get salary");
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

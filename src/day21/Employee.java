package day21;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }



    public double getSalary() {
        return salary;}

    public void setSalary(double salary) {
        this.salary = salary;}

    @Override
    public void getDescription() {}
}




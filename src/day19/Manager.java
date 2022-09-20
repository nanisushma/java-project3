package day19;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, int age, String address, double salary) {
        super(name, age, address, salary);
        System.out.println("Manager parameterized constructor called ");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {this.bonus = bonus;}

    protected double getTotalSalary() {
        double totalSalary = getSalary() + bonus;
        return totalSalary;

    }


    }





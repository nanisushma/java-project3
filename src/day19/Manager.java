package day19;

public sealed class Manager extends Employee permits Executive {

    private double bonus;

    public Manager(String name, int age, String address, double salary) {
        super(name, age, address, salary);
       // System.out.println("Manager parameterized constructor called ");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {this.bonus = bonus;}

     @Override
    public double getSalary() {
         System.out.println("Manager get salary");
        double totalSalary = super.getSalary() + bonus ;
        return totalSalary;

    }

    public void fireEmployee(){

    }


    }





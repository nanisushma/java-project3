package day19;

public final class Executive extends Manager {


    private double shares;

    public Executive(String name, int age, String address, double salary, double shares) {
        super(name, age, address, salary);
        this.shares = shares;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }


    @Override

    public double getSalary(){

        double totalSalary = super.getSalary() + shares;
        return totalSalary;


    }


    public void fireEmployee() {
    }

    public void fireManager() {
    }
}


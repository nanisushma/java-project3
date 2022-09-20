package day19;

public class OfficeApp {

    public static void main(String[] args) {



        Employee employee = new Employee();

        employee.getName();
        employee.getAge();
        employee.getAddress();
        employee.getSalary();



        Manager manager = new Manager();

        manager.getName();
        manager.getAge();
        manager.getAddress();
        manager.getSalary();

        manager.getBonus();



    }
}

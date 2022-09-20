package day19;

public class OfficeApp {

    public static void main(String[] args) {

      Employee employee = new Employee("A", 22, "Resul",400);

       Manager manager = new Manager("A",23,"Test",5000);
       manager.setBonus(1000);

       System.out.println(manager.getSalary());

    }


}

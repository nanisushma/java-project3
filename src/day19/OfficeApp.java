package day19;

public class OfficeApp {

    public static void main(String[] args) {

      Employee employee = new Employee("A", 22, "Resul",400);
      System.out.println(employee.getSalary());

       Manager manager = new Manager("A",23,"Test",5000);
       manager.setBonus(1000);
       System.out.println(manager.getSalary());

       manager.fireEmployee();

       Executive executive = new Executive("A",23,"Test",5000,1000);
       executive.setBonus(2000);
       executive.setShares(1000);

       System.out.println(executive.getSalary());

       executive.fireEmployee();
       executive.fireManager();


       Programmer programmer = new Programmer("B",20,"Test",500);



    }


}

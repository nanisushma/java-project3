package day19;

public class OfficeApp {

    public static void main(String[] args) {

     String a = "test";
     a = "Another Test";

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


       // Polymorphism

        Employee employee1 = new Manager("A",23,"Test",5000);
     ((Manager)employee1).setBonus(1000);
        employee1.getSalary();

        // employee1).setBonus(1000);

        if (employee1 instanceof Executive){
         ((Executive) employee1).setBonus(1000);
        }
        if (employee1 instanceof Manager){
         ((Manager) employee1).setBonus(1000);
        }

        //Manager manager1 = new Employee("A", 23,"Test", 5000),

        Employee[] employees = new Employee[4];
        employees[0] = employee;
        employees[1] = manager;
        employees[2] = executive;
        employees[3]  = programmer;

        employees[1].getSalary();





    }


}

package day10;

public class EmpolyeeWeb {

    public static void main(String[] args) {

       Employee employee1 = new Employee();

       employee1.setName("Sushma Karki");
       employee1.setAge(32);
       employee1.setAddress("Hawaii Honolulu");
       employee1.setSocialSecurityNumber(1234567);
       employee1.setFatherFullName("Hari Bahadur Karki");
       employee1.setMaritalStatus("Married");
       employee1.setIdNumber(135632);


       System.out.println(employee1.getName());
       System.out.println(employee1.getAge());
       System.out.println(employee1.getAddress());
       System.out.println(employee1.getSocialSecurityNumber());
       System.out.println(employee1.getFatherFullName());
       System.out.println(employee1.getMaritalStatus());
       System.out.println(employee1.getIdNumber());



       Employee employee = new Employee("Sushma Karki",32,"Hawaii Honolulu",1234567,"Single",135632);
       Employee employee2 = new Employee("Sushma Karki",32,"Hawaii Honolulu",1234567,"Hari Bahadur Karki","Single",135632);






    }
}

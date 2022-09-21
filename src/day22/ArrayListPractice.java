package day22;

import day21.Employee;
import day4.Teacher;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>(10);

        System.out.println(names);

        names.add(0,"Sushma");
        names.add(3,"Ajay");
        names.add(4,"Dilisha");
        names.add(2,"Palisha");
        names.add(1,"Susan");

        System.out.println(names);

      //  names.addAll(names);

        // System.out.println(names);

       // names.remove(2);
        //System.out.println(names);

        names.remove("Guest");
        System.out.println(names);

        //ArrayList<Teacher> teacherList = new ArrayList<>();

        //teacherList.add(new Teacher());

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("AB","Test","7788679"));
        employeeList.add(new Employee("ABC","Test","7788679"));
        employeeList.add(new Employee("ABCD","Test","7788679"));

        System.out.println(employeeList);

       // employeeList.remove(1);

        //System.out.println(employeeList);
        employeeList.remove(new Employee("ABC","Test","7788679"));
        System.out.println(employeeList);









    }
}

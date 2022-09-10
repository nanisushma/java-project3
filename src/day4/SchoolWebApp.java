package day4;

public class SchoolWebApp {


    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setName("A");
        student1.setAge(12);
        student1.setStudentclass(6);
        student1.setRollnumber(1);
        student1.takeLeave();


        System.out.print(student1.getName());
        System.out.print(student1.getAge());
        System.out.print(student1.getStudentclass());
        System.out.print(student1.getRollnumber());
       // System.out.print(student1.gettakeleave);


        Teacher teacher1 = new Teacher();

        teacher1.setName("B");
        teacher1.setAge(30);
        teacher1.setSubject("Computer");
        teacher1.takeLeave();

        System.out.print(teacher1.getName());
        System.out.print(teacher1.getAge());
        System.out.print(teacher1.getSubject());
        //System.out.print(teacher1.gettakeleave);


    }
}

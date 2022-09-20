package day21;

public class SchoolApp {

    public static void main(String[] args) {

       // Person person = new Person( "A","Test","9849018753");

        Student ram = new Student("A","Test","9849018753",1,8);
        Student ram1 = new Student("A","Test","9849018753",2,8);

        //ram.toString();
        //System.out.println(ram.toString());

        System.out.println(ram == ram1); // true, true
        System.out.println(ram.equals(ram1));

    }
}

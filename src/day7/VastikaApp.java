package day7;

public class VastikaApp {

    public static void main(String[] args) {

        // StudentStatus studentstatus = new StudentStatus(); cannot create objects

        System.out.print(StudentStatus.ENROLLED.name());
        System.out.print(StudentStatus.IN_TRAINING.name());


        System.out.print(StudentStatus.ENROLLED.ordinal());
        System.out.print(StudentStatus.IN_TRAINING.ordinal());
        System.out.print(StudentStatus.ASSIGNED.ordinal());
        System.out.print(StudentStatus.PLACED.ordinal());
    }
}

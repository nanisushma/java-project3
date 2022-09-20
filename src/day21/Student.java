package day21;

import java.util.Objects;

public class Student extends Person{

    private int rollNumber;
    private int studentClass;

    public Student(String name, String address, String phoneNumber, int rollNumber, int studentClass) {
        super(name, address, phoneNumber);
        this.rollNumber = rollNumber;
        this.studentClass = studentClass;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getStudentClass() {
        return studentClass;
    }

    @Override
    public void getDescription() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ",address=" + super.getAddress()+
                ",phoneNumber=" + super.getPhoneNumber()+
                ",rollNumber=" + rollNumber+
                ",student=" + studentClass +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && studentClass == student.studentClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, studentClass);
    }
}

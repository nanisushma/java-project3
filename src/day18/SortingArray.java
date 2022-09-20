package day18;

import day4.Student;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        String[] countries = {"USA", "NEPAL", "INDIA", "CHINA"};
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));

        Student[] students = new Student[4];
        students[1] = new Student(10,5);
        students[2] = new Student(1,1);
        students[3] = new Student(5,5);
        students[4] = new Student(3,5);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

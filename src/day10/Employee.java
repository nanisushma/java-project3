package day10;

public class Employee {

    private String name = "Sushma Karki";
    private int age = 32;
    private String address = "Hawaii Honolulu";
    private float socialSecurityNumber = 1234567;
    private String fatherFullName = "Hari Bahadur Karki";
    private String maritalStatus = "Married";
    private int idNumber = 135632;



    // Parameterizes Constructor//Overloading


    public Employee(String name, int age, String address, float socialSecurityNumber, String maritalStatus, int idNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.maritalStatus = maritalStatus;
        this.idNumber = idNumber;
    }


    public Employee(String name, int age, String address, float socialSecurityNumber, String fatherFullName, String maritalStatus, int idNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fatherFullName = fatherFullName;
        this.maritalStatus = maritalStatus;
        this.idNumber = idNumber;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(float socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFatherFullName() {
        return fatherFullName;
    }

    public void setFatherFullName(String fatherFullName) {
        this.fatherFullName = fatherFullName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}

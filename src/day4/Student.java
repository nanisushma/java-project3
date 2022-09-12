package day4;

public class Student extends Person {

    private int rollnumber;
    private int studentclass;

    private boolean isSelected;


    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(int studentclass) {
        this.studentclass = studentclass;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}



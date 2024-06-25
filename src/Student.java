import java.util.ArrayList;
import java.util.List;

public class Student {

    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public List<Double> grades = new ArrayList<>();

    public Student(String fname, String lname, int indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    public void addGrade(double grade) {
        if (grades.size() == 20) {
            System.out.println("Student already has a maximum of 20 grades");
            return;
        }
        grades.add(grade);
    }

    public double calculateAverage() {
        try {
            grades.get(0);
        } catch(IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Student should have at least one grade");
        }
        double sum = 0.0;
        int i;
        for (i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / i;
    }
}

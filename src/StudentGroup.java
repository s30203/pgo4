import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Integer> students;

    public StudentGroup(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(int indexNumber) {
        students.add(indexNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("a", "b", 1, "c", "d");
        student.addGrade(4);
        student.addGrade(5);
        System.out.println(student.calculateAverage());
        StudentGroup studentGroup1 = new StudentGroup("group1");
        studentGroup1.addStudent(student.indexNumber);

        System.out.println(studentGroup1.students.getFirst());
    }
}
package GradingSysteminJava;

public class CalculationandIDSearcher {

    public StudentRecord[] calculateGrades(StudentRecord[] students) {
        for (StudentRecord student : students) {
            boolean passed = student.getGrade() >= 60.0;
            student.setPassed(passed);
        }
        return students;
    }
}
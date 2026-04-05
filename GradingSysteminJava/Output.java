package GradingSysteminJava;

public class Output {

    public void printStudents(StudentRecord[] students) {
        System.out.println("Student Records:");
        for (StudentRecord student : students) {
            System.out.printf("Name: %s, ID: %d, Grade: %.2f, Status: %s%n",
                    student.getName(),
                    student.getId(),
                    student.getGrade(),
                    student.isPassed() ? "Passed" : "Failed");
        }
    }
}

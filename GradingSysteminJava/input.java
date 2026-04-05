package GradingSysteminJava;

import java.util.Scanner;
public class input {

    public StudentRecord[] readStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        StudentRecord[] students = new StudentRecord[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String studentName = sc.nextLine();

            System.out.println("Enter ID for student " + (i + 1) + ":");
            int studentId = sc.nextInt();

            System.out.println("Enter grade for student " + (i + 1) + ":");
            double studentGrade = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            students[i] = new StudentRecord(studentName, studentId, studentGrade);
        }

        return students;
    }
    
}

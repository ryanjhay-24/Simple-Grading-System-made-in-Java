package GradingSysteminJava;

public class Main {
    public static void main(String[] args) {
        input inputReader = new input();
        StudentRecord[] students = inputReader.readStudents();

        CalculationandIDSearcher searcher = new CalculationandIDSearcher();
        StudentRecord[] processedStudents = searcher.calculateGrades(students);

        Output output = new Output();
        output.printStudents(processedStudents);
    }
}
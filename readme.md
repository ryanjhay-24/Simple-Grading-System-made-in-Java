# Student Grading System in Java

A simple Java console application to collect student names, student IDs, and grades from user input, calculate pass/fail status, and print results.

## How it works

1. `input.java` prompts the user for the number of students, then reads each student's name, ID, and grade.
2. `CalculationandIDSearcher.java` evaluates each student's grade and marks whether they passed.
3. `Output.java` displays the student information with name, ID, grade, and pass/fail status.
4. `Main.java` connects the steps and runs the application.

## Example usage

- Run `Main.java`.
- Enter how many students you want to add.
- Provide each student's name, ID, and numeric grade.
- The program prints each student's record and whether they passed.

## Notes

- Passing is currently defined as a grade of 60 or higher.
- The application uses a `StudentRecord` class to store and pass student data between components.

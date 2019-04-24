package Exercise.Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] students = scanner.nextLine().split(" ");
            String firstName = students[0];
            String lastName = students[1];
            Double grade = Double.parseDouble(students[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        studentList.stream().sorted((grade1, grade2) -> Double.compare(grade2.getGrade(), grade1.getGrade()))
                .forEach(student -> {
                    System.out.println(student);
                });
    }
}

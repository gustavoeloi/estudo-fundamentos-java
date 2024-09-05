package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Student student = new Student();

        System.out.println("Enter with the name of student: ");
        student.setName(scanner.nextLine());

        student.setFirstGrade(scanner.nextDouble());
        student.setSecondGrade(scanner.nextDouble());
        student.setThirdGrade(scanner.nextDouble());

        System.out.println(student);
        scanner.close();
    }
}

package application;

import entities.StudentGrade;

import java.util.Locale;
import java.util.Scanner;

public class StudentApproved {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scanner.nextInt();

        StudentGrade[] students = new StudentGrade[n];


        for(int i = 0; i < students.length; i++){
            System.out.printf("Digite o nome do %da aluno: ", i + 1);
            String name = scanner.next();
            scanner.nextLine();
            System.out.print("\nDigite a primeira nota: ");
            double firstGrade = scanner.nextDouble();
            System.out.print("\nDigite a segunda nota: ");
            double secondGrade = scanner.nextDouble();

            students[i] = new StudentGrade(name, firstGrade, secondGrade);
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < students.length; i++) {
            if(students[i].averageGrade() >= 6.0) {
                System.out.println(students[i].getName());
            }
        }

        scanner.close();

    }
}

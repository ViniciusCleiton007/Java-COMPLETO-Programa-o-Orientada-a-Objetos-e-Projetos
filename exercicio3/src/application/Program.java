package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.Grade1 = sc.nextDouble();
		student.Grade2 = sc.nextDouble();
		student.Grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f\n", student.notaFinal());
		
		if (student.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.resultado());
		} else {
			System.out.println("PASS");
		}

		
		sc.close();
	}

}

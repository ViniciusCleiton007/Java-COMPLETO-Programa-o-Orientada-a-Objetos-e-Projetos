package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee  emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		
		System.out.println();
		System.out.println("Which percetage to   increasesalary? ");
		double percetage = sc.nextDouble();
		emp.IncreaseSalary(percetage);
		
		System.out.println();
		System.out.println("Update data: " + emp);
		
		sc.close();

	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		switch (n) {
		case 1: {
			Employee emp = new Employee();
			emp.setSalary(sc.nextDouble());
			emp.raiseSalary();
			System.out.println(String.format("%.2f", emp.getSalary()));
			break;
		}
		case 2: {
			Employee emp = new Employee();
			emp.setSalary(sc.nextDouble());
			emp.vacationSalary();
			System.out.println(String.format("%.2f", emp.getVacation()));
			break;
		}
		case 3: {
			Employee emp = new Employee();
			emp.setSalary(sc.nextDouble());
			emp.setThirtheenthSalary(sc.nextDouble());
			System.out.println(String.format("%.2f", emp.getThirtheenthSalary()));
			break;
		}
		case 4: {
			System.out.println("Programa encerrado.");
			break;
		}
		default:
			break;
		}
		
		sc.close();
	}

}

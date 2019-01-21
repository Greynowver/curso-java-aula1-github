package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		System.out.println("Guerra Empreendimentos: ");
		Locale.setDefault(Locale.US);
		List<Employee> listEmployee = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int numeroRegistros = sc.nextInt();
		
		for (int i = 0; i<numeroRegistros; i++ ) {
			System.out.println("Employee #" + (i + 1));
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			listEmployee.add(new Employee(id, name, salary));
			}
		
		System.out.println("Enter the emplyee id that will have salary encrease: ");
		int procuraId = sc.nextInt();
		Employee emp = listEmployee.stream().filter(x -> x.getId() == procuraId).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextInt();
			emp.increaseSalary(percentage);
		}
		
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : listEmployee) {
			System.out.println(obj);
		}
			
		
		sc.close();
		
		
		
	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Progran {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<Employee>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("Emplyoee #" + (i + 1) + ":\n");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while( hasId(list, id)) {
				System.out.println("Id already taken! Try agian: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int idSalary = sc.nextInt();
		//outro modo de buscar na lista 
		//Employee emp = list.stream().filter(x -> x.getidSalary() == id).findFirst().orElse(null);

		Integer pos = position(list, idSalary);
		/* se usar o primeiro metedo mudar
		if (emp == null)		 */
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
			//se usar o primeiro metodo só chamar emp no lugar da list.get(pos) "emp.increaseSalary(percent);"
		}
		System.out.println();
		System.out.print("List of employees:");
		/* Neste laço subistituir a variavel "emp" por "e"
		 * for (Employee e : list) {
			System.out.println();
		}*/
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}

	// usando waper classe "Integer" para no final returnar "null"
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
	}

}

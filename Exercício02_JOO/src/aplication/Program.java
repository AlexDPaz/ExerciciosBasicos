package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		/*
		 * azer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empl = new Employee();
		System.out.print("Name: " );
		empl.name = sc.nextLine();
		System.out.print("Gross salary: $ " );
		empl.grossSalary = sc.nextDouble();
		System.out.print("Tax: $ " );
		empl.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + empl);
		
		System.out.println("Which percentage to increase salary?: ");
		double percetagem = sc.nextDouble();
		empl.increaseSalary(percetagem);
		
		System.out.println("Update data: " + empl);
	
		sc.close();
		

	}

}

package Exercicios_fixação;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*
		 * Fazer um programa que leia o número de um funcionário,
		 *  seu número de horas trabalhadas, o valor que recebe por
		 *  hora e calcula o salário desse funcionário. A seguir,
		 *   mostre o número e o salário do funcionário, com duas casas
		 *   decimais.
		 */
		
		int numFun = sc.nextInt();
		double numHoras = sc.nextDouble();
		double valorHora = sc.nextDouble();
		
		double salario = numHoras * valorHora;
		
		System.out.println("Numero funcionario: " + numFun);
		System.out.printf("Salario funcionario: $ %.2f%n ", salario);
		
		
		sc.close();

	}

}

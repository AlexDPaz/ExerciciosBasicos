package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aprovados;

public class ProblemaAprovados {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Aprovados[] vect = new Aprovados[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("\nDigite nome, primeira e segunda nota do %o aluno: \n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Nota 1º: ");
			double nota1 = sc.nextDouble();
			System.out.print("Nota 2º: ");
			double nota2 = sc.nextDouble();
			vect[i] = new Aprovados(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados: ");
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			soma = (vect[i].getNota1() + vect[i].getNota2()) / 2;
			
			if (soma >= 6.0) {
				System.out.printf("%s\n", vect[i].getNome());
			}
		}

		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class Problema_alturas {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Alturas[] vect = new Alturas[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			// colocar um (sc.nestLine) pra consumir uma linhas por causa no (sc.nextInt)
			// anterior.
			sc.nextLine();
			// estanciar variaveis temporaria
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Alturas(nome, idade, altura);
		}
		
		// percorrer o vetor e somar todas as alturas e o resultado soma tirar a mendia 
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}
		double media = soma / vect.length;
		System.out.printf("Altura média: %.2f%n", media);
		
		//calcular a porcentagem da de menores de 16 anos
		double menorDeIdade = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
			menorDeIdade++;
			}
		}
		menorDeIdade = (menorDeIdade * 100.0) / n;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", menorDeIdade);
		
		// percorrer o vetor e imprimir nomes das pessoa menos de 16 anos
		for (int j = 0; j < vect.length; j++) {
			if (vect[j].getIdade() < 16) {
				System.out.printf("%s\n", vect[j].getNome());
			}
		}

		sc.close();

	}

}

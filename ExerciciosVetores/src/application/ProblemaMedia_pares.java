package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMedia_pares {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		int pares = 0;
		int soma = 0;
		double media = 0.0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				soma = soma +vect[i];
				pares++;
			}
		}
	// nesse caso comparei se o numero era par se nao imprimir que nao era.
			if ( pares == 0) {
				System.out.println("NENHUM NUMERO PAR");
			}
			else {
				// e depois fazer a media dos numeros pares se caso tiver numeros pares.
				media = soma / pares;
				System.out.printf("MEDIA DOS PARES = %.1f%n", media);
			}
		
		sc.close();

	}

}

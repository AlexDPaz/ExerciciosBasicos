package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNumeros_pares {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int vect[] = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero:");
			vect[i] = sc.nextInt();
		}

		System.out.print("\nNUMEROS PARES:");
		int pares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				// usado o (%d = Inteiro) para indicar numero inteiro. 
				System.out.printf("\n %d", vect[i]);
				pares++;
			}
		}
		
		// usado (\n) no começo para quebra de linha.
		System.out.print("\nQUANTIDADE DE PARES = " + pares);

		sc.close();

	}

}

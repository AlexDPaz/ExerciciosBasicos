package application;

import java.util.Locale;
import java.util.Scanner;

public class Problema_soma_vetor {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double vect[] = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		// laço criado pra imprimir os valor que foram inseridos.
		System.out.print("VALORES = " );
		for (int i=0; i<vect.length; i++) {
			System.out.printf(" %.2f%n", vect[i]);
		}
	
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		
		System.out.printf("SOMA =  %.2f%n" , soma); 
		
		double media = soma / n;

		System.out.printf("A média é : %.2f%n", media);

		sc.close();
	}

}

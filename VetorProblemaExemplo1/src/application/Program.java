package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Numero de vetores: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		System.out.println("Ensira a altura");
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		System.out.printf("A média é : %.2f%n", media);
		
		sc.close();

	}

}

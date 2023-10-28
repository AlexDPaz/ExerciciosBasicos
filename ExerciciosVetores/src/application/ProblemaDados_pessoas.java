package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDados_pessoas {

	public static void main(String[] args) {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Altura da %da pessoa: \n", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: \n", i + 1);
			genero[i] = sc.next().charAt(0);
		}

		double menorAltura = altura[0];
		double maiorAltura = altura[0];

		for (int i = 1; i < vect.length; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];

			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}

		System.out.printf("Menor altura = %.2f%n ", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);

		int mulheres = 0;
		int homens = 0;
		double mediaAlturasF = 0.0;

		for (int i = 0; i < vect.length; i++) {
			if (genero[i] == 'M') {
				homens++;
			} else {
				mulheres++;
				mediaAlturasF += altura[i];
			}
		}

		mediaAlturasF /= mulheres;

		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturasF);
		System.out.println("Numero de homens = " + homens);

		sc.close();
	}

}

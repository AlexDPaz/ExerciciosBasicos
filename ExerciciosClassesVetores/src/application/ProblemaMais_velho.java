package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaisVelho;

public class ProblemaMais_velho {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		MaisVelho[] vect = new MaisVelho[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %d a pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new MaisVelho(nome, idade);
		}

		int maioridade = 0;
		int posicaomaior = 0;

		for (int i = 1; i < n; i++) {
			if (vect[i].getIdade() > maioridade) {
				maioridade = vect[i].getIdade();
				posicaomaior = i;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s\n", vect[posicaomaior].getNome());

		sc.close();

	}

}

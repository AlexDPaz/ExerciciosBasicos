package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e
		 *  dizer se este número é par ou ímpar.
		 */
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();

	}

}

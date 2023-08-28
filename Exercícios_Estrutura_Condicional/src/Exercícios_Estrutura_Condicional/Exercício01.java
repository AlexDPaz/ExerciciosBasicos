package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, 
		 * e depois dizer se este número é negativo ou não.
		 */
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		if (n < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}
		sc.close();

	}

}

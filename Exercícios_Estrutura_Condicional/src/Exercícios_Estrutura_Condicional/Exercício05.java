package Exercícios_Estrutura_Condicional;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o 
		 * código de um item e a quantidade deste item. A seguir, 
		 * calcule e mostre o valor da conta a pagar.
		 */
		Scanner sc = new Scanner (System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double total;
		
		if (cod == 1 ) {
			total = qtd * 4.0;
		}
		else if (cod == 2 ) {
			total = qtd * 4.50;
		}
		else if (cod == 3 ) {
			total = qtd * 5.00;
		}
		else if (cod == 4) {
			total = qtd * 2.00;
		}
		else {
			total = qtd * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}

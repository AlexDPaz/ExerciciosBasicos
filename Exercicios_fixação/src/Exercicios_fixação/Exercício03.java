package Exercicios_fixação;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D.
		 *  A seguir, calcule e mostre a diferença 
		 *  do produto de A e B pelo produto de C e D 
		 *  segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int DIF = (A * B - C * D);
		
		System.out.println("Diferença= " + DIF);
		
		sc.close();
	}

}

package entities;

import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {
		// Fazer um programa para ler três números inteiros e mostrar na tela o maior
		// deles.
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter three numbers:"); int a = sc.nextInt(); int b =
		 * sc.nextInt(); int c = sc.nextInt(); if (a > b && a > c) {
		 * System.out.println("Higher = " + a); } else if (b > c && a < b ) {
		 * System.out.println("Higher = " + b); } else { System.out.println("Higher = "
		 * + c); } sc.close(); }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}

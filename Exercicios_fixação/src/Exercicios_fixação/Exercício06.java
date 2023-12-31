package Exercicios_fixação;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
		 *  A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
		 */
		Scanner sc  = new Scanner (System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTri = (A * C) / 2;
		double areaCir = Math.PI * (C * C);
		double areaTra = (A + B) / 2 * C;
		double areaQua = B * B;
		double areaRet = A * B;
		
		System.out.printf("TRIANGULO: %.2f%n", areaTri);
		System.out.printf("CIRCULO: %.2f%n", areaCir);
		System.out.printf("TRAPEZIO: %.2f%n", areaTra);
		System.out.printf("QUADRADO: %.2f%n", areaQua);
		System.out.printf("RETRANGULO: %.2f%n", areaRet);
		
		
		sc.close();

	}

}

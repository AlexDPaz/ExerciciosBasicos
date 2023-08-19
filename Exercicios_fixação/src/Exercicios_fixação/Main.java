package Exercicios_fixação;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * altura;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA= %.2f%n", area);
		System.out.printf("PRECO= %.2f%n ", preco);
		
		
		sc.close();
		

		


	}

}

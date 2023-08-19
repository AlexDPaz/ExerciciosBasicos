package Exercicios_fixação;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.
		*/
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("Soma= "+ soma);
		
		sc.close();
	}

}

package Entrada_de_dados_emJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digito: " + x);
		
		sc.close();

	}

}

package processamento_de_dados;

public class Exemplos {

	public static void main(String[] args) {
		
		//Exemplo 1 
		/*
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//Exemplo 2
		/*
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		*/
		// Exemplo 3
		
		/*double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		System.out.println();
		*/
		
		// Exemplo 3
		
		/*float b, B, h, area;
		b = 6f;
		B = 8f;
		h = 5f;
		area = (b + B) / 2f * h;
		System.out.println(area);
		*/
		
		//Exemplo 4
		/*
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = a / b;
		System.out.println(resultado);
		*/
		
		/*Exemplo 4  
		 
		 * Casting
		 
		É a conversão explícita de um tipo para outro.
		É necessário quando o compilador não é capaz de “adivinhar” que o
		resultado de uma expressão deve ser de outro tipo.
		*/

		/*
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double)a / b; // usar a variavel para fazer o casting 
		System.out.println(resultado);
		System.out.println();
		*/
		
		//Exemplo 5
		
		double a;
		int b;
		a = 5.0;
		b = (int) a; // usar int para fezer a converção de double para int 
		System.out.println(b);

	}

}

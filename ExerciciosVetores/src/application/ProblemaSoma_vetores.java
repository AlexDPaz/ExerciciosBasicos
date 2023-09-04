package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSoma_vetores {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int vect[] = new int[n];
		
		int vectA[] = new int[n];
		int vectB[]= new int[n];
		int vectC[] = new int[n];
		
		System.out.println("Digite os valores do vetor A:" );
		for (int i = 0; i < vect.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:" );
		for (int i = 0; i < vect.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vect.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		   for (int i=0; i<n; i++) {
		    	System.out.printf("%d\n", vectC[i]);
		    }
		
		
		sc.close();
	}

}

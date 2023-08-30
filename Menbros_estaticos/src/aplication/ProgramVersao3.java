package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorVersao3;

public class ProgramVersao3 {

	public static void main(String[] args) {
		
		// Versão 3: classe Calculator com método estático
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius:  ");
		double radius = sc.nextDouble();

		double c = CalculatorVersao3.circuference(radius);
		double v = CalculatorVersao3.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n ", CalculatorVersao3.PI);

		sc.close();

	}

}

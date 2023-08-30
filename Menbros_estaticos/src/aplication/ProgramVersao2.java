package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorVersao2;

public class ProgramVersao2 {

	public static void main(String[] args) {
		
		//• Versão 2: classe Calculator com membros de instância.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalculatorVersao2 calc = new CalculatorVersao2();

		System.out.println("Enter radius:  ");
		double radius = sc.nextDouble();

		double c = calc.circuference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n ", calc.PI);

		sc.close();

	}

}

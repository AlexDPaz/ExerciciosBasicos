package util;

public class CalculatorVersao3 {
	
	// Versão 3: classe Calculator com método estático

	public static final double PI = 3.14159;

	public static double circuference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}

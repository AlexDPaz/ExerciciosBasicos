package util;

public class CalculatorVersao2 {

	// • Versão 2: classe Calculator com membros de instância.

	public final double PI = 3.14159;

	public double circuference(double radius) {
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}

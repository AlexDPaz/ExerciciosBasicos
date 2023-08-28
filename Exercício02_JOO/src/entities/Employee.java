package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public double increaseSalary(double porcentage) {
		return grossSalary += grossSalary * porcentage / 100.00;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary()); 
	}
}

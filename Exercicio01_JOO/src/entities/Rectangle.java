package entities;

public class Rectangle {
	
	
	public double b;
	public double h;
	
	public double area() {
		return b * h;
	}
	
	public double perimeter() {
		return 2 * ( b + h);
	}
	
	public double diagonal() {
		return Math.sqrt((b * b) + (h * h));
	}
	

}

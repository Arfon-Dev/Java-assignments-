package Triangle_methods;

import java.util.Scanner;

public class TriangleAreaCalculator {
	private double base;
	private double height;
	private double area;
	
	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		base = scanner.nextDouble();
		System.out.println("Enter the height of the triangle");
		height = scanner.nextDouble();
		
		scanner.close();
		
	}
	public void calculateArea() {
		area = 0.5 * base * height;
	}
	
	public void displayArea() {
		System.out.printf("the area the triangle is %.2f square units%n4", area);
	}

	public static void main(String[] args) {
		TriangleAreaCalculator calculator = new TriangleAreaCalculator();
		calculator.getInput();
		calculator.calculateArea();
		calculator.displayArea();
	}
}

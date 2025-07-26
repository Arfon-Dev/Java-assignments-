package java_methods;

import java.util.Scanner;

public class methods {
	public void findMininMax() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the first number: ");
	double num1 = scanner.nextDouble();
	System.out.println("Enter the second number: ");
	double num2 = scanner.nextDouble();
	System.out.println("Enter the third number: ");
	double num3 = scanner.nextDouble();
	
	double smallest = num1;
	double largest = num1;
	
	if (num2 < smallest) {
		smallest = num2;
	}
	
	if (num3 < smallest) {
		smallest = num3;
	}
	if (num2 > largest) {
		largest = num2;
	}
	
	if (num3 > largest) {
		largest = num3;
	}
	
	System.out.println("Smallest number" + smallest);
	System.out.println("largest number" + largest);
	System.out.println("is your largest number" + largest +" and? Smallest" + smallest);
	
	scanner.close();
	}
	public static void main(String[] args) {
		methods obj = new methods();
		obj.findMininMax();
	}
}


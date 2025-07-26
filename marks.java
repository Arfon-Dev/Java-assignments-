package java_marks;

import java.util.Scanner;

public class marks {
	public void findAverage() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter marks for java programming: ");
		double unit1 = scanner.nextDouble();
		System.out.println("Enter marks for networking: ");
		double unit2 = scanner.nextDouble();
		System.out.println("Enter marks for maths: ");
		double unit3 = scanner.nextDouble();
		
		double Average = (unit1 + unit2 + unit3 / 3.0);
		
		
		System.out.println(" marks for java programming  is: " + unit1);
		System.out.println("marks for networking is: " + unit2);
		System.out.println("marks for maths is: " + unit3);
		System.out.printf("marks for Average is: %.2f%n", Average);
		
		
		scanner.close();
	}
		public static void main(String[] args) {
			marks obj = new marks();
			obj.findAverage();
		}
}

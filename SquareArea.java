package mixed_method;

import java.util.Scanner;

public class SquareArea {
	private String message;
	
	public SquareArea(String msg) {
		this.message = msg;
	}
	//Non-static method
	public void displayMessage()  {
		System.out.println("Non-static method output: " + message);
	}
	
     //static method 1
	public static double computeSquare(double number) {
		return number * number;
	}
	
	//static method
	public static String checkEvenOdd(int number) {
		return (number % 2 == 0) ? "even" : "odd";
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//create instance
		SquareArea area = new SquareArea("hello, this is the new area");
		
		area.displayMessage();
		
		//use static method 1
		System.out.println("Enter a new number to compute its square: ");
		double number = scanner.nextDouble();
		System.out.println("Square of" + number + " is: " + computeSquare(number));
		
		//use static method 2
		System.out.println("Enter an integer to checks if it even or odd");
		int num2 = scanner.nextInt();
		System.out.println(num2 + " is " + checkEvenOdd(num2));
		
		scanner.close();
	}
	
	

}

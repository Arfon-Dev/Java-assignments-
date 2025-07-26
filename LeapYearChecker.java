package Leap_Year;

import java.util.Scanner;

public class LeapYearChecker {
	public void checkLeapYear () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scanner.nextInt();
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year == 0);
		
		if (isLeapYear) {
			System.out.println("The year " + year + "is a leap year");
			
		} else {
			System.out.println("The year " + year + " is not a leap year");
		}
		
		scanner.close();
		}
			public static void main(String[] args) {
				LeapYearChecker obj = new LeapYearChecker();
				obj.checkLeapYear();
			}
	}


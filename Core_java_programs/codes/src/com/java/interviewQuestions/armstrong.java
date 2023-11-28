package com.java.interviewQuestions;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the lower bound of the interval: ");
	        int lowerBound = scanner.nextInt();

	        System.out.print("Enter the upper bound of the interval: ");
	        int upperBound = scanner.nextInt();

	      

	        System.out.println("Armstrong numbers in the interval " + lowerBound + " to " + upperBound + ":");
	        
	        for (int number = lowerBound; number <= upperBound; number++) {
	            int originalNumber = number;
	            int n = 0;
	            int result = 0;

	            // Count the number of digits in 'number'
	            while (originalNumber != 0) {
	                originalNumber /= 10;
	                ++n;
	            }

	            originalNumber = number;
	            
	            while (originalNumber != 0) {
	                int digit = originalNumber % 10;
	                result += Math.pow(digit, n);
	                originalNumber /= 10;
	            }

	            if (result == number) {
	                System.out.println(number);
	            }
	        }
	}

}

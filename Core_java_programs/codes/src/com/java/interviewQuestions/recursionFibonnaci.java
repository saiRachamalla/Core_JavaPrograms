package com.java.interviewQuestions;

import java.util.Scanner;

public class recursionFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc=new Scanner(System.in);
		        int n = sc.nextInt(); // Change this value to generate the first n Fibonacci numbers
		        System.out.println("Fibonacci Series (first " + n + " numbers):");
		        for (int i = 0; i < n; i++) {
		            System.out.print(fibonacci(i) + " ");
		        }
		    }

		    public static int fibonacci(int n) {
		        if (n <= 1) {
		            return n;
		        } else {
		            return fibonacci(n - 1) + fibonacci(n - 2);
		        }
	}

}

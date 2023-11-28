package com.programs.interview;
import java.util.Scanner;
public class evenprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2) {
        	System.out.println("no even primes with in specified range");
        }
        else if(n>=2) {
        	System.out.println("even prime is"+2);
        }
	}

}

package com.java.interviewQuestions;
import java.util.Scanner;
public class perferctNumber13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
		
		if(sum==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
	}

}

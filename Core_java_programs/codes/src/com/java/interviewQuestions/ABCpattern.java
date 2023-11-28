package com.java.interviewQuestions;
import java.util.Scanner;
public class ABCpattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		char a='A';
		for(int j=n-1;j>=i;j--) {
			System.out.print(a+" ");
			a=(char)(a+1);
		}
		System.out.println();
	}
	for(int i=0;i<n;i++) {
		char a='A';
		for(int j=0;j<=i;j++) {
			System.out.print(a+" ");
			a=(char)(a+1);
		}
		System.out.println();
	}
   }
}
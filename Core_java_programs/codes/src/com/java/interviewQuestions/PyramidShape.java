package com.java.interviewQuestions;
import java.util.Scanner;
public class PyramidShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				for(int j=n;j>i;j--) {
					System.out.print(" ");
				}System.out.print("");
				for(int j=0;j<=i;j++) {
					System.out.print("* ");
				}System.out.println();
	}
	}
}

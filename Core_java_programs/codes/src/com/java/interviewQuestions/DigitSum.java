package com.java.interviewQuestions;
import java.util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a>0) {
			int remainder=a%10;
			sum=sum+remainder;
			a=a/10;
		}
		System.out.println(sum);
	}

}

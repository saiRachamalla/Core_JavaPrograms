package com.java.interviewQuestions;
import java.util.Scanner;
public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<end;i++) {
			System.out.print(s.charAt(i));
		}
		
	}

}

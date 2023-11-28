package com.java.interviewQuestions;
import java.util.Scanner;
public class startsWithJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		System.out.println("enter substring");
		String k=sc.next();
		System.out.println(k);
		String l=s.substring(0,k.length());
		if(k.compareToIgnoreCase(l)==0) {
			System.out.println("yes");
		}
	}
}
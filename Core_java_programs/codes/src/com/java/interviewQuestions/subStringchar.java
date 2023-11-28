package com.programs.interview;
import java.util.Scanner;
public class subStringchar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int start=sc.nextInt();
	int end=sc.nextInt();
	for(int i=start;i<end;i++) {
		System.out.print(s.charAt(i));
	}
	
}
}

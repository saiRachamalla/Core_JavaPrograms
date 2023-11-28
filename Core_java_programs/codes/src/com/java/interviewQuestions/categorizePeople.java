package com.programs.interview;

import java.util.Scanner;

public class categorizePeople  {
	static void categorise(int age) {
		if(age<12) {
			System.out.println("the person belonngs to child category");
		}
		else if(age>=13 && age<20) {
			System.out.println("the person belonngs to teen category");
		}
		else if(age>=20 && age<=59) {
			System.out.println("the person belonngs to adult category");
		}
		else {
			System.out.println("the person belongs to older actegory");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    categorise(n);
		
	}

}

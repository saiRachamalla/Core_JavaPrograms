package com.programs.interview;
import  java.util.Scanner;
public class forenheit {

	float conversion(int f) {
	        float c=((f-32)*5)/9;
	        return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperture in foreignheit");
        int f=sc.nextInt();
        forenheit f1=new forenheit();
        System.out.println(f1.conversion(f));
	}

}

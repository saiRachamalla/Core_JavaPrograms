package com.java.interviewQuestions;
import java.util.Scanner;
public class celsiusToforenheit {
	float conversion(int f) {
        float c=((f-32)*5)/9;
        return c;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter temperture in foreignheit");
        int f=sc.nextInt();
        celsiusToforenheit f1=new celsiusToforenheit();
        System.out.println("celsius temperature is "+f1.conversion(f));

	}

}

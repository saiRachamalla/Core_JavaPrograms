package com.java.interviewQuestions;
import java.util.Scanner;
public class reverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String r=sc.next();
        StringBuilder s=new StringBuilder(r);
        System.out.println(s.reverse());
	}

}

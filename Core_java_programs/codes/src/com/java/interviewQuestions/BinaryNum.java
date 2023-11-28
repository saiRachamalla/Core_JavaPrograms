package com.java.interviewQuestions;
import java.util.Scanner;
public class BinaryNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String k="";
        while(number>0) {
        	if(number%2==0) {
        		k=k+'0';
        		number=number/2;

        	}
        	else {
        		k=k+'1';
        		number=number/2;

        	}
        }
        StringBuilder s=new StringBuilder(k);
        System.out.println(s.reverse());
	}

}

package com.java.interviewQuestions;
import java.util.Scanner;
public class pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<i;j++) {
        		if((i+j)%2==0) {
        			System.out.print("0");
        		}
        		else {
        			System.out.print("1");
        		}
        	}System.out.println();
        }
	}

}

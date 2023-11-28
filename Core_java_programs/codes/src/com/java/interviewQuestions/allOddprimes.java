package com.java.interviewQuestions;
import java.util.Scanner;
public class allOddprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        if(n<3) {
	        	System.out.println("no odd prime");
	        }
	        else {
	        	for(int i=3;i<=n;i++) {
	        		int count=0;
	        		for(int j=1;j<=i;j++) {
	        			if(i%j==0) {
	        				count++;
	        			}
	        		}
	        		if(count==2) {
	        			System.out.println(i);
	        		}
	        }
	        
	        	
	        }
	}

}

package com.java.interviewQuestions;
import java.util.Scanner;
public class sumofPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		int k=0;
		 if(n>1) {
	        	for(int i=2;i<=n;i++) {
	        		int count=0;
	        		for(int j=1;j<=i;j++) {
	        			if(i%j==0) {
	        				count++;
	        			}
	        		}
	        		if(count==2) {
	        			arr[k]=i;
	        			k++;
	        		
	        		}
	        	}
		 }
		 for(int i=0;i<arr.length;i++) {
			 sum=sum+arr[i];
		 }
		 System.out.println(sum);
	}
}

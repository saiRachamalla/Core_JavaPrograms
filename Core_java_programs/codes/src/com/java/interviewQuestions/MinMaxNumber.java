package com.java.interviewQuestions;
import java.util.Scanner;
public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter no of elements");
	        int s=sc.nextInt();
	        int a[]=new int[s];
	        for(int i=0;i<a.length;i++) {
	        	a[i]=sc.nextInt();	
	        }
	         int min = a[0],max=a[0];
	         for(int i=1;i<a.length;i++) {
	        	 if(a[i]>max) {
	        		 max=a[i];
	        	 }
	        	 if(a[i]<min) {
	        		 min=a[i];
	        	 }
	         }
	         System.out.println("mininum is "+min);
	         System.out.println("maximum is "+max);
	        
	}

}

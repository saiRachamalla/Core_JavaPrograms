package com.java.interviewQuestions;
import java.util.Scanner;
public class sorting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number");
	       int n=sc.nextInt();
	       int a[]=new int[n];
	       int sor[]=new int[n];
	       for(int i=0;i<n;i++) {
	    	   a[i]=sc.nextInt();
	       }
	       int min=a[0];
	       int k=0;
	       for(int i=0;i<a.length;i++) {
	    	   for(int j=i+1;j<a.length;j++) {
	    		   if(a[i]>=a[j]) {
	    			 int temp=a[i];
	    			   a[i]=a[j];
	    			   a[j]=temp;
	    		   }
	    		   
	    	   }
	       }
	       for(int i=0;i<a.length;i++) {
	    	   System.out.println(a[i]);
	       }
	}

}

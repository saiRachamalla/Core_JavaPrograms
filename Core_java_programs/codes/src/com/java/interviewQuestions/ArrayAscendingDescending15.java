package com.java.interviewQuestions;
import java.util.Scanner;
public class ArrayAscendingDescending15 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size value:");
    int n=sc.nextInt();
    System.out.println("enter the array:");
    int a[]=new int[n];
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<n/2;i++) {
    	for(int j=i+1;j<n/2;j++) {
    	if(a[i]>a[j]) {
    		int temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    	}
    }
    }
    for(int i=n/2;i<n;i++) {
    	for(int j=i+1;j<n;j++) {
    		if(a[i]<a[j]) {
    			int temp1=a[i];
    			a[i]=a[j];
    			a[j]=temp1;
    		}
    	}
    }
    for(int i=0;i<n;i++) {
    	System.out.println(a[i]);
    }
}
}
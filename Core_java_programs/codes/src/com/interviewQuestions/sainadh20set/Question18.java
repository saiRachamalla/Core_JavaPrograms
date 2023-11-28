package com.interviewQuestions.sainadh20set;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        	
        }
        for(int j=0;j<a.length;j++) {
        for(int i=0;i<a.length-1;i++) {
        	if(a[i]==0) {
        		int temp=a[i];
        		a[i]=a[i+1];
        		a[i+1]=temp;
        	}
        }}
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        	
        }
        
	}

}

package com.java.interviewQuestions;
import java.util.Scanner;
public class sumProductfinal12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size:");
    int n=sc.nextInt();
    System.out.println("enter the array:");
    int a[]=new int[n];
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    int sum=0;
    int product=1;
    for(int i=0;i<a.length;i++) {
    	if(a[i]%2!=0) {
    		sum=sum+a[i];
    	}
    	else
    	{
    		product=product*a[i];
    	}
    }
    System.out.println(sum);
    System.out.println(product);
    int f=sum+product;
    System.out.println(f);
	}
}

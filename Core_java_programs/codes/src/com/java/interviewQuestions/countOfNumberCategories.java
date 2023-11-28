package com.programs.interview;

import java.util.Scanner;

public class countOfNumberCategories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int positivecount=0;
		int negativecount=0;int oddcount=0;int evencount=0;int zerocount=0;
		System.out.println("enter no of elements of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positivecount++;
			}
		    if(arr[i]<0) {
				negativecount++;
			}
			if(arr[i]==0) {
				zerocount++;
			}
			if(arr[i]%2==0) {
				evencount++;
			}
			if(arr[i]%2==1) {
				oddcount++;
			}
		}
		System.out.println("positive numbers count is "+positivecount);
		System.out.println("negative numbers count is "+negativecount);
		System.out.println("zero numbers count is "+zerocount);
		System.out.println("odd numbers count is "+oddcount);
		System.out.println("even numbers count is "+evencount);
	}

}

package com.programs.interview;

import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int secondmax;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		max=0;//max=Integer.MIN_VALUE;
		secondmax=0;//secondmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			else if(arr[i]>secondmax && arr[i]!=max) {
				secondmax=arr[i];	
			}
		}
		System.out.println(secondmax);
	}

}

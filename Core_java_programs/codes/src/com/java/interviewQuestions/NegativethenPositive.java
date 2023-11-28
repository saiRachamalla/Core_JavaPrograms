package com.java.interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class NegativethenPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}

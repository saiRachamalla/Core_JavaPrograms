package com.java.interviewQuestions;
import java.util.Scanner;
public class arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr1[j]=arr[i];
			j++;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}

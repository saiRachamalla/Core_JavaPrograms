package com.java.interviewQuestions;

import java.util.Scanner;
import java.util.Arrays;
public class removeSpecifiedElemtsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int arr[]=new int[n];
		String arr2[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("enter element");
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				arr2[i]=" ";
			}
			else {
				arr2[i]=Integer.toString(i);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]!=" ") {
			System.out.println(arr2[i]+" ");}
		}

	}

}

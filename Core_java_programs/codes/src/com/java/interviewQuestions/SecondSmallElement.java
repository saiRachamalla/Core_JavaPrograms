package com.java.interviewQuestions;
import java.util.Scanner;
public class SecondSmallElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int secondmin;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		min=Integer.MAX_VALUE;
		secondmin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin=min;
				min=arr[i];
			}
			else if(arr[i]<secondmin && arr[i]!=min) {
				secondmin=arr[i];	
			}
		}
		System.out.println(secondmin);

	}

}

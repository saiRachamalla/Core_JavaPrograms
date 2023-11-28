package com.java.interviewQuestions;
import java.util.*;
public class ArrContainOnlyODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements ");
		int a=sc.nextInt();
		System.out.println("enter elemts of an aray");
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("array conrain only odd numbers");
		}
		else {
			System.out.println("array also contain even numbers");
		}
		
	}

}

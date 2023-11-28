package com.programs.interview;
import java.util.Scanner;
public class commonElementsBetweenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements 1st array");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		String three="";
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter no of elements 2nd array");
		int m=sc.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for(int i=0;i<m;i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					break;
					}
			}
		}

		}
	}



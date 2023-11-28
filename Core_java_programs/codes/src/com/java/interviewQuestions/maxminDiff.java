package com.java.interviewQuestions;

import java.util.Scanner;

public class maxminDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int k=0;
		int l=0;
		int m=0;
		int p=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxdiff=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
                int diff=Math.abs(arr[i]-arr[j]);
                if(diff>maxdiff) {
                	maxdiff=diff;
                	k=arr[i];
                	l=arr[j];
                }
			}
		}
		System.out.println(maxdiff+" this is max differece and its pairs");
		System.out.println(k);
		System.out.println(l);
		int mindiff=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
                int diff=Math.abs(arr[i]-arr[j]);
                if(diff<mindiff) {
                	mindiff=diff;
                	m=arr[i];
                	p=arr[j];
                }
			}
		}
		System.out.println(mindiff+" this is min differece and its pairs");
		
		System.out.println(m);
		System.out.println(p);
		
		

	}

}

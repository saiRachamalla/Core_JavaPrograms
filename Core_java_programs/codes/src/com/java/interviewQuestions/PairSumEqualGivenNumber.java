package com.java.interviewQuestions;
import java.util.Scanner;
public class PairSumEqualGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println("enter sum");
		int s=sc.nextInt();
		int k=0;
		int l=0;
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
                sum=arr[i]+arr[j];
                if(sum==s) {
                	k=arr[i];
                	l=arr[j];
                	System.out.print(k+" ");
            		System.out.println(l);
                }
			}
		}
		
	}

}

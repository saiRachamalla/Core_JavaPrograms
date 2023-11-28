package com.java.datastructures;

import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>max) {
        		secondmax=max;
        		max=arr[i];
        		}
        	else if(arr[i]>secondmax && arr[i]!=max) {
        		secondmax=arr[i];
        	}
        }
        System.out.println("first max is "+max);
        System.out.println("second max is "+secondmax);
	}

}

package com.java.datastructures;
import java.util.Scanner;
public class ArraySpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        	if(arr[i]<min) {
        		min=arr[i];
        	}
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(max-min);
	}

}
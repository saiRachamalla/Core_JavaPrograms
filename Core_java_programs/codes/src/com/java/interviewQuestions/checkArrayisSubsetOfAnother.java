package com.java.interviewQuestions;

import java.util.Scanner;

public class checkArrayisSubsetOfAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of superset");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++) {
        	arr1[i]=sc.nextInt();
        }
        System.out.println("enter number of subset");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++) {
        	arr2[i]=sc.nextInt();
        }
        
//        for(int i=0;i<arr1.length;i++) {
//        	System.out.print(arr1[i]+" ");
//        }
//        for(int i=0;i<arr2.length;i++) {
//        	System.out.print(arr2[i]+" ");
//        }
        int count=0;
        for(int i=0;i<arr2.length;i++) {
       	    for(int j=0;j<arr1.length;j++) {
       	    	if(arr2[i]==arr1[j]) {
       	    		count++;
       	    	}
       	    }
       	}
        if(count==arr2.length) {
        	System.out.println("yes it is a subset of another array");
        }
        else {
        	System.out.println("No it isnnot a subset of another array");
        }
        
	}

}

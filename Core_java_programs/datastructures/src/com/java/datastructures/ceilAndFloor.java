package com.java.datastructures;

import java.util.Scanner;

public class ceilAndFloor {

	public static int ceil(int arr[],int k) {
		 int low=0;int high=arr.length-1;int mid=0;
	        while(low<=high) {
	        	mid=(low+high)/2;
	        	if(arr[mid]==k) {
	        		return arr[mid];
	        	}
	        	else if(k<arr[mid]) {
	        		high=mid-1;
	        		
	        	}
	        	else if(k>arr[mid]) {
	        		low=mid+1;
	        		
	        	}
	        }
	        if(low<arr.length) {
	        return arr[low];}
	        else {
	        	return -1;
	        }
	}

	public static int floor(int arr[], int k) {
		 int low=0;int high=arr.length-1;int mid=0;
	        while(low<=high) {
	        	mid=(low+high)/2;
	        	if(arr[mid]==k) {
	        		return arr[mid];
	 
	        	}
	        	else if(k<arr[mid]) {
	        		high=mid-1;
	        		
	        	}
	        	else if(k>arr[mid]) {
	        		low=mid+1;
	        		
	        	}
	        }
	        if(high>=0) {
	        return arr[high];}
	        else {
	        	return -1;
	        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        }
        System.out.println("enter element to find ceil and floor");
        int k=sc.nextInt();
        
        System.out.println(floor(arr,k));
        System.out.println(ceil(arr,k));}
	
}



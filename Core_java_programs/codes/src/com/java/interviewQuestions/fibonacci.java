package com.programs.interview;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int k=sc.nextInt();
		int arr[]=new int[k];
		if(k==1) { 
		arr[0]=0;
		}
		else if(k==2) {
			 
			arr[0]=0;
			arr[1]=1;
		}
		else {
			arr[0]=0;
			arr[1]=1;
			for(int i=2;i<k;i++) {
				int temp=arr[i-1]+arr[i-2];
				arr[i]=temp;
			
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(arr[i]);
		}
		

	}

}

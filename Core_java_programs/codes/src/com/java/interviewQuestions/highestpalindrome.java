package com.programs.interview;
import java.util.Scanner;
public class highestpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements in an array");
        int m=sc.nextInt();
        int arr[]=new int[m];
        int arr1[]=new int[m];
        for(int i=0;i<m;i++) {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++) {
        	int r,sum=0,temp;    
        	  int n=arr[i];//It is the number variable to be checked for palindrome  
        	  
        	  temp=n;    
        	  while(n>0){    
        	   r=n%10;  //getting remainder  
        	   sum=(sum*10)+r;    
        	   n=n/10;    
        	  }    
        	  if(temp==sum) {
        		  arr1[i]=sum;
        	  }
        	     
        	  else   { 
        	       }   
        }
        int max=0;
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]>max) {
        		max=arr[i];
        	}
        }
        System.out.println(max);
	}

}

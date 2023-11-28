package com.programs.interview;
import java.util.Scanner;
public class mergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first array size");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("enter second array size");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        
        int arr3[]=new int[m+n];
        System.out.println("enter first array elements");
        for(int i=0;i<n;i++) {
        	
        	arr1[i]=sc.nextInt();
        }
        System.out.println("enter second array elements");
        for(int i=0;i<m;i++) {
        	arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	arr3[i]=arr1[i];
        }
        int k=0;
        for(int j=n;j<m+n;j++) {
        	arr3[j]=arr2[k];
        	k++;
        }
        System.out.println("merging of two arrays");
        for(int i=0;i<arr3.length;i++) {
        	System.out.print(arr3[i]+" ");
        }
	}

}

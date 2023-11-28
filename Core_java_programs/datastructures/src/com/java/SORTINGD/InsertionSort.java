package com.java.SORTINGD;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("sai");
//		int n=sc.nextInt();
//        int k[] = new int[n];
//        for(int i=0;i<n;i++)
//        {
//        	k[i]=sc.nextInt();
//        }
		int k[]= {20,5,40,60,10,30};
			for(int j=1;j<k.length;j++) {
			   if(k[j]<k[j-1]) {
//				  for(int m=j;m>0;m--) {
//					if(k[m]<k[m-1]) {
//							int temp=k[m];
//							k[m]=k[m-1];
//							k[m-1]=temp;
//					}
//				  } or
				   for(int m=j;m>0 && k[m]<k[m-1];m--) {
								int temp=k[m];
								k[m]=k[m-1];
								k[m-1]=temp;
					  }
				   
				  for(int l=0;l<k.length;l++)
			        {
			        System.out.print(k[l]+" ");;
			        }
				System.out.println();
			   }
			
			
		}
	
	}

}

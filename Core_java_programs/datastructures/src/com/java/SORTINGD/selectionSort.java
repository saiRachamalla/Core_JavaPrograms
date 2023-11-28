package com.java.SORTINGD;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int k[] = new int[n];
        for(int i=0;i<n;i++)
        {
        	k[i]=sc.nextInt();
        }
       // int temp[]=new int[n];
        for(int i=0;i<k.length;i++) {
        	int mini=k[i];
        	for(int j=i;j<k.length;j++) {
        		if(k[j]<mini) {
        			mini=k[j];
        			int t=k[i];
            		k[i]=mini;
            		k[j]=t;
        		}  
        	}
        	 for(int l=0;l<k.length;l++) {
           	   System.out.print(k[l]+" ");
              }
        	 System.out.println();
        }
//        for(int l=0;l<k.length;l++) {
//     	   System.out.print(k[l]+" ");
//        }

	}

}

package com.java.SORTINGD;

import java.util.Scanner;

public class BUBBLESORT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int k[] = new int[n];
        for(int i=0;i<n;i++)
        {
        	k[i]=sc.nextInt();
        }
        for(int i=0;i<k.length-1;i++) {
        	for(int j=0;j<k.length-i-1;j++) {
        		if(k[j]>k[j+1]) {
        		   int temp=k[j];
        		   k[j]=k[j+1];
        		   k[j+1]=k[j];
        		}
        	}
        	  
               
        }
        for(int l=0;l<k.length;l++) {
        	   System.out.print(k[l]+" ");
           }
	}

}

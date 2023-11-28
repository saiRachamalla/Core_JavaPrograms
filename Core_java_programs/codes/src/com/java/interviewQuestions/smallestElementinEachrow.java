package com.java.interviewQuestions;
import java.util.Scanner;
public class smallestElementinEachrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size");
        int n=sc.nextInt();
        System.out.println("enter column size");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("enter elements");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		matrix[i][j]=sc.nextInt();
        	}
        }
        for(int i=0;i<n;i++) {
        	int min=Integer.MAX_VALUE;
        	for(int j=0;j<m;j++) {
        		if(matrix[i][j]<min) {
        			min=matrix[i][j];
        		}
        	}
        	System.out.println("row"+i+"min elemnet is "+min);
        	System.out.println();
        }
	}

}

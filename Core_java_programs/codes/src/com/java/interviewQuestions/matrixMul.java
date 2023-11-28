package com.java.interviewQuestions;

import java.util.Scanner;

public class matrixMul {
    int[][] matrixmul(int[][] mat1,int size) {
    	Scanner sc=new Scanner(System.in);
    	int [][]mat2=new int[size][size];
    	int [][]mat3=new int[size][size];
    	System.out.println("enter matrix 2 elemnts");
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		mat2[i][j]=sc.nextInt();
        	}
        }
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		for(int k=0;k<size;k++) {
        			mat3[i][j]+=mat1[i][k]*mat2[k][j];
        		}
        		
        	}
        }
		return mat3;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [][]mat1=new int[size][size];
        System.out.println("enter matrix 1 elemnts");
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		mat1[i][j]=sc.nextInt();
        	}
        }
        
        matrixMul m=new matrixMul();
        System.out.println("matrix mul");
         int fin[][]= m.matrixmul(mat1,size);
         for(int i=0;i<size;i++) {
         	for(int j=0;j<size;j++) {
         		System.out.print(fin[i][j]);
         	}
         	System.out.println();
         }
         
	}

}

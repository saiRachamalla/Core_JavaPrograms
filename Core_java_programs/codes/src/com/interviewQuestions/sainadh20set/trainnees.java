package com.interviewQuestions.sainadh20set;
import java.util.Scanner;
public class trainnees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of traines");
		int traines=sc.nextInt();
		System.out.println("enter number of rounds");
		int rounds=sc.nextInt();
		int mat[][]=new int[rounds][traines];
		for(int i=0;i<rounds;i++) {
			for(int j=0;j<traines;j++) {
				mat[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<rounds;i++) {
			for(int j=0;j<traines;j++) {
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
		int averages[]=new int[traines];
		int count=0;
		for(int i=0;i<rounds;i++) {
			int sum=0;
			for(int l=0;l<traines;l++) {
			for(int j=0;j<traines;j++) {
				if(j==l) {
					sum+=mat[j][i];
				}
			}
			}
			averages[count]=sum;
			System.out.println(averages[count]);
			count++;
		}
		int max=0;
		for(int i=0;i<averages.length;i++) {
			if(averages[i]>=max) {
				max=averages[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<averages.length;i++) {
			if(averages[i]>=max)
				System.out.println("traine"+(i+1));
			}
		}
		
	
}

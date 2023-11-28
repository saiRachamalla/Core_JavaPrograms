package com.java.interviewQuestions;
import java.util.Scanner;
public class findMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//       for(int i=0;i<n;i++) {
		//    	  System.out.println(a[i]);
		//       }
		for (int i = 0; i < a.length; i++) {

			max = Math.max(max, a[i]);

		}
		int a2[]=new int[max];
		for(int i=0;i<a2.length;i++) {    	  
			a2[i]=i+1;
			//    	   System.out.println(a2[i]);       
		}
		for(int i=0;i<a2.length;i++) {
			int flag=1;
			for(int j=0;j<a.length;j++) {

				if(a2[i]!=a[j]) {
					flag=0;
				}
				else {
					flag=1;
					break;
				}
			}if(flag==0) {
				System.out.print(a2[i]+" ");
			}


		}

	}

}

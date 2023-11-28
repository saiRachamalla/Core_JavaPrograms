package com.java.interviewQuestions;

import java.util.Scanner;

public class missingANDduplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		int missing[]=new int[n];
		int miss=0;
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
			//System.out.println(a2[i]);       
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
			 }
			 if(flag==0) {
				missing[miss]=a2[i];
				miss++;
			}
            
		}
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < missing.length; i++) {

			
			if(missing[i]!=0) {
			min = Math.min(min, missing[i]);}

		} 
		
		System.out.println(min+" is minimum positive missing integer");

		int len[]=new int[a.length];
	    for(int i=0;i<a.length;i++) {
	    	len[i]=1;
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[i]==a[j]) {
	    			a[j]=0;
	    			len[i]+=1;
	    		}
	    		
	    	}
	    }
	    
	    for(int i=0;i<len.length;i++) {
			if(a[i]==' '||a[i]==0) {

			}
			else {
				System.out.print(a[i]+"----"+len[i]+"\n");}
			}
	    for(int i=0;i<len.length;i++) {
	    	if(len[i]>1) {
	    		System.out.print(a[i]+" is repeating integer");
	    	}
	    }
		 System.out.println("repating number");
			}

}

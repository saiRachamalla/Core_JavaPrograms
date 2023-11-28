package com.java.basic;
import java.util.Scanner;
public class addbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int bin1=sc.nextInt();
        int bin2=sc.nextInt();
        int sum[]=new int[20];
        int r=0,i=0;
        while(bin1!=0 || bin2!=0) {
        	sum[i++]=(int)((bin1%2 +bin2%2+r)%2);
        	r=(int)((bin1%2 +bin2%2+r)/2);
        	bin1=bin1/10;
        	bin2=bin2/10;
        }
        if(r!=0) {
        	sum[i++]=r;
        }
        for(int i1=i-1;i1>=0;i1--) {
        	System.out.println(sum[i1]);
        }
        
	}

}

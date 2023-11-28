package com.java.interviewQuestions;
import java.util.Scanner;
public class Digitfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s1=Integer.toString(a);
		System.out.println(s1);
		char Arr[]=s1.toCharArray();
	    int len[]=new int[Arr.length];
	    for(int i=0;i<s1.length();i++) {
	    	len[i]=1;
	    	for(int j=i+1;j<s1.length();j++) {
	    		if(Arr[i]==Arr[j]) {
	    			Arr[j]=0;
	    			len[i]+=1;
	    		}
	    		
	    	}
	    }
	    for(int i=0;i<len.length;i++) {
			if(Arr[i]==' '||Arr[i]==0) {

			}
			else {
				System.out.print(Arr[i]+"----"+len[i]+"\n");}
			}
	}

}

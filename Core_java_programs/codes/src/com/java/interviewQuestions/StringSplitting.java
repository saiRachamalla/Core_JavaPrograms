package com.java.interviewQuestions;
import java.util.Scanner;
public class StringSplitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String arr[]=new String[s.length()];
    for(int i=0;i<s.length();i++) {
    	String s3="";
    	int j=0;
    	if(s.charAt(i)>=65 && s.charAt(i)<=90) {
    		arr[j]=s.charAt(i)+s3;
    		j++;
    	}
    	else {
    		s3+=s.charAt(i);
    	}
    	System.out.print(s3);
    	System.out.println();
    	s3="";
    }
    
}
}

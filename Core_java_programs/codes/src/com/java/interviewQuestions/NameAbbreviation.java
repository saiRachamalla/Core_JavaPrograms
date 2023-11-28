package com.java.interviewQuestions;
import java.util.Scanner;
public class NameAbbreviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p="";
        String s3="";
        int c=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		c+=1;
        	}
        }
        String arr[]=new String[c+1];
        int j=0;String s2="";
        for(int i=0;i<s.length();i++) {
        	
        	if(s.charAt(i)==' ') {
        		arr[j]=s2;
        		
        		j++;
        		s2="";
        	}
        	else {
        		s2=s2+s.charAt(i);
        		
        	}
        	arr[j]=s2;
        }
       
        
        for(int i=0;i<arr.length-1;i++) {
        	s3+=arr[i].charAt(0)+".";
        }
        
        System.out.println(s3+arr[c]);
	}

}

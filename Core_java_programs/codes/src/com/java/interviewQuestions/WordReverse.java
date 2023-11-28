package com.java.interviewQuestions;
import java.util.Scanner;
public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		c+=1;
        	}
        }
        String ar[]=new String[c+1];
        String dummy="";
        int j=0;
        for(int i=s.length()-1;i>=0;i--) {
        	if(s.charAt(i)==' ') {
        		ar[j]=dummy;
        		j++;
        		dummy="";
        		
        	}
        	else {
        		dummy=dummy+s.charAt(i);
        	}
        	ar[j]=dummy;
        }
        for(int i=ar.length-1;i>=0;i--) {
        	System.out.print(ar[i]+" ");
        }
        
	}

}

package com.java.interviewQuestions;
import java.util.Scanner;
public class Toggle {
	public static void main(String[] args) {
		
	
	   Scanner sc=new Scanner(System.in);
       System.out.println("enter a string ");
       String s=sc.next();
       String s2="";
       for(int i=0;i<s.length();i++) {
       	char aChar = s.charAt(i);
           if (65 <= aChar && aChar<=90){
               aChar = (char)( (aChar + 32) ); 
               s2+=aChar;
           }
           else {
           	 aChar = (char)( (aChar - 32) ); 
                s2+=aChar;
           }
       	
       }
       System.out.println(s2);
	}
}


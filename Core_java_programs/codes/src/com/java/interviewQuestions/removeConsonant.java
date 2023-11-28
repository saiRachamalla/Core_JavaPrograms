package com.programs.interview;

import java.util.Scanner;

public class removeConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s2="";
       for(int i=0;i<s1.length();i++) {
    	   if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='e'|| s1.charAt(i)=='u') {
    		   s2+=s1.charAt(i);
    	   }
       }
       System.out.println(s2);
	}

}

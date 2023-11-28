package com.java.interviewQuestions;
import java.util.Scanner;
public class Spaceremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') 
				s2=s2+s.charAt(i);
			else
				s2=s2+"";
		}
		 System.out.println(s2); 
	}

}

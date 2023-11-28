package com.java.interviewQuestions;
import java.util.Scanner;
public class removeCharfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          String s=sc.next();
          char c=sc.next().charAt(0);
          String res="";
          for(int i=0;i<s.length();i++) {
        	  if(s.charAt(i)!=c) {
        		  res+=s.charAt(i);
        	  }
          }
          System.out.println(res);
	}

}

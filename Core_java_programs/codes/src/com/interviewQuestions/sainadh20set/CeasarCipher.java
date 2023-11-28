package com.interviewQuestions.sainadh20set;
import java.util.Scanner;
public class CeasarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.nextLine();
        System.out.println("enter key value");
        int n=sc.nextInt();
        String ceasar="";
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		ceasar+=s.charAt(i);
        	}
        	else {
        		ceasar+=(char)(s.charAt(i)+n);
        	}
        }
        System.out.println(ceasar);
	}

}

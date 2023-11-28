package com.java.interviewQuestions;
import java.util.Scanner;
public class numbersAndCharactersseparate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String num="";
		String ch="";
		for(int i=0;i<s.length();i++) {
			int k=s.charAt(i);
			if(k>47 && k<58) {
				num+=s.charAt(i);
			}
			else {
				ch+=s.charAt(i);
			}
		}
		System.out.println(num);
		System.out.println(ch);
		}

}

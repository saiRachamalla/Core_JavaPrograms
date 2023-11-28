package com.java.interviewQuestions;

	import java.util.*;
	public class SplitastringUppercaseoccured3 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			String arr[]=new String[s.length()];
			for(int i=0;i<s.length();i++) {
				String s3="";
//				int j=0;
				if(s.charAt(i)>=65 && s.charAt(i)<=90) {
//					arr[j]=arr[i]+s.charAt(i);
					System.out.println(" ");
					s3+=s.charAt(i);
//					j++;
				}
				else
				{
					s3+=s.charAt(i);
				}
				System.out.print(s3);
				s3="";
			}
			System.out.println();
//			Scanner sc=new Scanner (System.in);
//			System.out.println("enter the string:");
//			String s=sc.nextLine();
//			char[] str=s.toCharArray();
	//
//			for(int i=0;i<str.length;i++) {
	//
//				if(str[i]>='A' && str[i]<='Z') {
//					str[i]=(char)(str[i]);
//					if(i>=0) {
//						System.out.print("");
//						System.out.print(" "+str[i]);
//						
//					}
//				}
//				else {
//					System.out.print(str[i]);
//				}
//			}System.out.println();
		}
	}


package com.programs.interview;
import java.util.Scanner;
public class duplicateChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] str=s.toCharArray();
		int len[]=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			len[i]=1;
			for(int j=i+1;j<s.length();j++) {
				if(str[i]==str[j]) {
					str[j]=0;
					len[i]++;}
				else {

				}
			}

		}
		for(int i=0;i<len.length;i++) {
			if(len[i]>1) {
				System.out.println(str[i]);
			}
		}


	}


}

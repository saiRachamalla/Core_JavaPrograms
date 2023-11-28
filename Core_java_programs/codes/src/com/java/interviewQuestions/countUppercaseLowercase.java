package com.programs.interview;
import java.util.*;
public class countUppercaseLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int uppercount=0;
        int lowercount=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)>=65 && s.charAt(i)<=90 ) {
        		uppercount++;
        	}
        	else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
        		lowercount++;
        	}
        }
        System.out.println("uppercase character count is "+uppercount);
        System.out.println("lowercase character count is "+lowercount);
        
	}

}

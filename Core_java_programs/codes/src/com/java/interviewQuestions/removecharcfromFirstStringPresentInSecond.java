package com.java.interviewQuestions;
import java.util.*;
public class removecharcfromFirstStringPresentInSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();
        String fin="";
        for(int i=0;i<first.length();i++) {
        	int flag=0;
        	for(int j=0;j<second.length();j++) {
        		if(first.charAt(i)==second.charAt(j)) {
        			flag=1;
        			break;
        		}
        	}
        	if(flag==0) {
        		fin+=first.charAt(i);
        	}
        }
        System.out.println(fin);
	}

}

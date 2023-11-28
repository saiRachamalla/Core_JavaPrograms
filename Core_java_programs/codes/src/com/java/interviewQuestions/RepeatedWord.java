package com.java.interviewQuestions;
import java.util.Scanner;
public class RepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		System.out.println("enter the string:");
		 String arr[] = new String[n];
		 
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.next();
	}
		  
		    int freq = 0;
		 
		  
		    String res = "";
		     int count = 0;
		    for (int i = 0; i < arr.length; i++) {
		 
		      for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i].equals(arr[j])) {
		          count++;
		        }
		      }
		 
		     
		      if (count >= freq) {
		        res = arr[i];
		        freq = count;
		      }
		    }
		 
		    System.out.println("The Repeated word: " + res);
	}

}

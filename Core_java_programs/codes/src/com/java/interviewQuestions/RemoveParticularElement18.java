package com.java.interviewQuestions;
import java.util.Scanner;
public class RemoveParticularElement18 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter the size of an array:");
    int n=sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++) {
    	arr[i] = sc.nextInt();
    }
    System.out.print("Enter the Element to Remove: ");
    int ele = sc.nextInt();
 
    for(int i=0; i<n; i++)
    {
    if(ele==arr[i])
    {
       for(int j=i; j<(n-1); j++)
          arr[j] = arr[j+1];
      
    }
 }
 
for(int i=0; i<(n-1); i++)
    System.out.print(arr[i]+ " ");
}
}
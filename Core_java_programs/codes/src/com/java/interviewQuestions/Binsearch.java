package com.programs.interview;
import java.util.Scanner;
public class Binsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k[]= {1,2,3,4,5,6,7,8,9};
		int low=0;
		int high=k.length-1;
		int num=sc.nextInt();
		int index=-1;
		for(int i=0;i<k.length;i++) {
			int mid=(low+high)/2;
			if(k[mid]==num) {
				index=mid;
			}
			else if(num<k[mid]) {
				high=mid-1;
				
			}
			else if(num>k[mid]) {
				low=mid+1;
			}
			else {
				index=-1;
			}
			
		}
		if(index==-1) {
			System.out.println("number not found");
		}
		else {
			System.out.println("number found at "+index);
		}
		

	}

}

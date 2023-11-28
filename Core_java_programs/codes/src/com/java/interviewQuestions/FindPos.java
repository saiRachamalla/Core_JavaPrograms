package com.java.interviewQuestions;
import java.util.Scanner;
import java.util.*;
public class FindPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int nums1[]=new int[nums.length+1];
		System.out.println("enter target value");
		int target=sc.nextInt();
		
		for(int i=0;i<nums.length+1;i++) {
			if(i==nums.length) {
				nums1[i]=target;
			}
			else {
				nums1[i]=nums[i];
			}
		}
		Arrays.sort(nums1);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i]);
		}System.out.println();
		int index =0;
		for(int i=0;i<nums1.length;i++) {
			if(nums1[i]==target) {
				index=i;
				
			}
		}
		System.out.println(index);
	}

}

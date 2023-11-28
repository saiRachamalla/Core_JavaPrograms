package com.java.basic;

import java.util.Arrays;

public class majorityelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,2,1,1,1,2,2};
		Arrays.sort(nums);
		int len[]=new int[nums.length];
		int k=0;
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
				else{
					len[i]=count;
					break;
				}

			}
			i=count-1;
		}
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
			
		}


	}

}

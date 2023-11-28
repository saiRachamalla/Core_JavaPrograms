package com.collections.leetcode;

import java.util.HashSet;
import java.util.Set;

public class commonelemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1= {1,2,2,1};
		int []nums2= {2,2};
		int[] output=intersection(nums1,nums2);
		 for(int n:output) {
			 System.out.println(n);
		 }
		

	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		for(int n1:nums1) {
			s1.add(n1);
		}
		for(int n1:nums2) {
			s2.add(n1);
		}
		s1.retainAll(s2);
		int res[]=new int[s1.size()];
		int index=0;
		for(int n:s1) {
			res[index++]=n;
		}
		
		return res;
	}

}

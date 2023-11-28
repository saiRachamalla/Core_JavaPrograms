package com.programs.interview;

import java.util.Scanner;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] array = new int[n]; 
        int k = 0;
        for(int m : array) {
            array[k] = s.nextInt();
            ++k;
        }
        for (int b : array) {
           System.out.println(b);
         }
        	
	}

}

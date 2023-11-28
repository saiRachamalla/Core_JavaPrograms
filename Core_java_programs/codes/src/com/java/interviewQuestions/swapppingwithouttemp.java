package com.programs.interview;

public class swapppingwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=20;
		/*b=b-a;
		a=a+b;
		b=a-b;
	    System.out.println("a is "+a);
	    System.out.println(b);*/
		b=a*b;
		a=b/a;
		b=b/a;
		System.out.println(a);
		System.out.println(b);
		

	}

}

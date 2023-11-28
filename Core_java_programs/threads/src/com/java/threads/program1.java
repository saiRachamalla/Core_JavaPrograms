package com.java.threads;

public class program1 {
public static void main(String[] args) {
	Thread t1=new Thread();
	System.out.println(t1);
	
	//defaullt thread
	Thread t2=Thread.currentThread();
	System.out.println(t2);
	t2.setName("asi");
	t2.setPriority(8);
	System.out.println(t2);
}
}

package com.java.threads;

import java.util.Scanner;



class addition extends Thread{
	public void run() {
	Scanner sc=new Scanner(System.in);
	System.out.println("current thread is "+Thread.currentThread().getName());
	System.out.println("addtion op initiated");
	System.out.println("enter num1");
	int n1=sc.nextInt();
	System.out.println("enter num2");
	int n2=sc.nextInt();
	int res=n1+n2;
	System.out.println("res"+res);
	System.out.println("additio op cmpled");
	System.out.println("current thread is "+Thread.currentThread().getName());
}
}

class printing extends Thread{
	
	 public void run() {
		 System.out.println("print op initiated");
		 for(int i=0;i<5;i++) {
				
			 try {
			 		System.out.println("global quest technilogied");
			 		Thread.sleep(3000);
			 	}
			 catch(Exception e) {
			 	e.printStackTrace();
			 }
			 }
			 System.out.println("print opp cmplted");
	}
}
class login extends Thread{
	public void run() {
	System.out.println("login opp initiated");
	System.out.println("current thread is "+Thread.currentThread().getName());
     Scanner sc=new Scanner(System.in);
	String username="123gqt";
	String password="123gqt";
	System.out.println("enter usernme");
	String uname=sc.next();
	System.out.println("enter passsword");
	String pwd=sc.next();
	if(username.equals(uname)) {
		if(password.equals(pwd)) {
			System.out.println("login success");
		}
		else {
			System.out.println("enter your password");
		}
	}
	else {
		System.out.println("check username");
	}
	System.out.println("login opp complted");
	System.out.println("current thread is "+Thread.currentThread().getName());
	}

}
public class multithreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(started");
		addition ad=new addition();
		printing p=new printing();
		login l=new login();
		ad.setName("add");
		p.setName("print");
		l.setName("login");
		ad.start();
		p.start();
		l.start();
		System.out.println("main ended");
	}

}

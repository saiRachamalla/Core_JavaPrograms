package com.java.threads;

import java.util.Scanner;

public class singlethread {
public static void main(String[] args) {
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
	System.out.println("print opp initiiates");
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
System.out.println("login opp initiated");

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



	
	

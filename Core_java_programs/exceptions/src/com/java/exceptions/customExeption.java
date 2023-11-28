package com.java.exceptions;
import java.lang.Exception;
import java.util.Scanner;
class UnderAgeException extends Exception{
	public String getmessage() {
		return "your age is less than 18";
	}
}
class OverAgeException extends Exception{
	public String getmessage() {
		return "your age is greater than 65";
	}
}
class Candidate{
	int age;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
	}
	void verify()throws OverAgeException,UnderAgeException{
		if(age<18) {
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getmessage());
			throw uae;
		}
		if(age>65) {
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getmessage());
			throw oae;
		}
		else {
			System.out.println("elegible for license");
		}
	}
}
public class customExeption {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c=new Candidate();
		try {
			c.getdata();
			c.verify();
		}
		catch(UnderAgeException ue){
			System.out.println("uae handled in main");
		
		}
		catch(OverAgeException oe){
			System.out.println("oae handled in main");
		
		}

	}

}

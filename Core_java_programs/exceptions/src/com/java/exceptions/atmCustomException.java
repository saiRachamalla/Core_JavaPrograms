package com.java.exceptions;

import java.util.Scanner;

class invalidCustomerException extends Exception{
	public String getmessage() {
		return "invalid credential try again";
	}
}

class customer{
	int org_acc=12345;
	int org_pin=5432;
	int acc;
	int pin;
	void collectdata() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter acc");
	int acc=sc.nextInt();
	System.out.println("enter pin");
	int pin=sc.nextInt();
	}
	
	void verify()throws invalidCustomerException{
		if(org_acc==acc) {
			if(org_pin==pin){
					System.out.println("granted");
			}
			else {
				invalidCustomerException ie=new invalidCustomerException();
				System.out.println(ie.getmessage());
				throw ie;
			}
		}
		else {
			invalidCustomerException ie=new invalidCustomerException();
			System.out.println(ie.getmessage());
			throw ie;
		}
	}
	
} 

class atm{
	void permit(customer c) {
		try {
			c.collectdata();
			c.verify();
		}
		catch(invalidCustomerException e1) {
			try {
				c.collectdata();
				c.verify();
			}
			catch(invalidCustomerException e2) {
				try {
					c.collectdata();
					c.verify();
				}
				catch(invalidCustomerException e3) {
					System.out.println("card blocked");
					System.exit(0);
				}
			}
		}
	}
}
public class atmCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c1=new customer();
		atm a1=new atm();
		a1.permit(c1);

	}

}

package com.java.exceptions;

import java.util.Scanner;

class invalidAccException extends Exception{
	public String getmessage() {
		return "invalid account number try again";
	}
}
class invalidPinException extends Exception{
	public String getmessage() {
		return "invalid pin number try again";
	}
}
class customer{
	int org_acc=12234;
	int org_pin=2324;
	int acc;
	int pin;
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter acc");
		acc=sc.nextInt();
		System.out.println("enter pin");
		pin=sc.nextInt();
		
	}
	
	void verify() throws invalidAccException,invalidPinException{
		if(org_acc==acc) {
			if(org_pin==pin) {
				System.out.println("access granted");
			}
			else {
				invalidPinException ipe=new invalidPinException();
				System.out.println(ipe.getmessage());
				throw ipe;
			}
		}
		else {
			invalidAccException iae=new invalidAccException();
			System.out.println(iae.getmessage());
		}
	}
}
class atm{
	void permit(customer c) throws invalidAccException, invalidPinException {
		try {
			c.collectdata();
			c.verify();
		}
		catch(invalidAccException e1) {
			try {
				c.collectdata();
				c.verify();
			}
			catch(invalidAccException e11) {
				try {
					c.collectdata();
					c.verify();
				}
				catch(invalidAccException e3) {
					c.collectdata();
					c.verify();
				}
				catch(invalidPinException e4) {
					c.collectdata();
					c.verify();
				}
			}
			catch(invalidPinException e11) {
				try {
					c.collectdata();
					c.verify();
				}
				catch(invalidAccException e12) {
					c.collectdata();
					c.verify();
				}
				catch(invalidPinException e13) {
					c.collectdata();
					c.verify();
				}
			}
		}
		catch(invalidPinException e2) {
			try {
				c.collectdata();
				c.verify();
			}
			catch(invalidAccException ie) {
				try {
					c.collectdata();
					c.verify();
				}
				catch(invalidAccException ie1) {
					c.collectdata();
					c.verify();
				}
				catch(invalidPinException ie2) {
					c.collectdata();
					c.verify();
				}
			}
			catch(invalidPinException ie2) {
				try {
					c.collectdata();
					c.verify();
				}
				catch(invalidAccException ie21) {
					c.collectdata();
					c.verify();
				}
				catch(invalidPinException ie22) {
					c.collectdata();
					c.verify();
				}
			}
		}
	}
}
public class atmCustomException2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		customer c1=new customer();
		atm a1=new atm();
		a1.permit(c1);}
		catch(invalidAccException iq) {
			System.out.println("handled in main iq");
		} catch (invalidPinException e) {
			System.out.println("handle in main iw");
		}

	}

}

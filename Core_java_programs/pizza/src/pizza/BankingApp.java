package pizza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.oopProject.Bank;

public class BankingApp {
	public static void main(String[] args) {
		
		Account acc1=new Account(1,0d,"saiPooornima","sai123","sp123");
		Account acc2=new Account(2,1000,"yamuna","yammu913","y123");
		Account acc3=new Account(3,2000,"harsha Vardhan","harsha2005","h123");
		Bank bank = new Bank();
		bank.addAccount(acc1);
		bank.printlist();
		
//		System.out.println("welcome to online Banking Application");
//		System.out.println("enter username");
//		Scanner sc=new Scanner(System.in);
//		String enteredUsername=sc.next();
//		System.out.println("enter password");
//	    String enteredPassword=sc.next();
//		boolean validation=validateCredentials(enteredUsername,enteredPassword);
//		if(validation==true) {
//			System.out.println("Login success.please choose your option");
//		}
//		else {
//			System.out.println("Login failed.enter correct credentials");
//		}
//		
//	}
//
//	private static boolean validateCredentials(String enteredUsername, String enteredPassword) {
//		// TODO Auto-generated method stub
//		return false;
	}
  
}


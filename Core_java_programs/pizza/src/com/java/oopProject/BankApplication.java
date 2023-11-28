package com.java.oopProject;
import java.util.Scanner;
public class BankApplication {

		public static void main(String[] args) {
			
			Account acc1=new Account(1,0d,"saiPooornima","sai123","sp123");
			Account acc2=new Account(2,1000,"yamuna","yammu913","y123");
			Account acc3=new Account(3,2000,"harsha Vardhan","harsha2005","h123");
			Bank bank = new Bank();
			bank.addAccount(acc1);
			bank.addAccount(acc2);
			bank.addAccount(acc3);
			bank.printlist();
			System.out.println("welcome to online Banking Application");
			System.out.println("enter username");
			Scanner sc=new Scanner(System.in);
			String enteredUsername=sc.next();	
			System.out.println("enter password");
		    String enteredPassword=sc.next();
		    
		    boolean valid=bank.validate(enteredUsername,enteredPassword);
		    
			if(valid==true) {
				System.out.println("Login success.please choose your option");
				 int choice;
		            do {
		                System.out.println("Choose an option:");
		                System.out.println("1. Balance Inquiry");
		                System.out.println("2. Deposit");
		                System.out.println("3. Withdraw");
		                System.out.println("4. Transfer");
		                System.out.println("5. Logout");
		                System.out.print("Enter your choice: ");
		                choice = sc.nextInt();
		                
		                switch (choice) {
		                    case 1:
		                        System.out.println("Balance :"+account.getBalance());
		                    default:
		                        System.out.println("Invalid choice. Please try again.");
		                        break;
		                }
		            } while (choice != 5);
		        } else {
		            System.out.println("Login failed. Invalid username or password.");
		            System.out.println("do you want to create new account?\n1.Yes\n2.No");
		            
		        }
			}
}

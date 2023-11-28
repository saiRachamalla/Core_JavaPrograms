package com.java.oopProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank{
	// TODO Auto-generated method stub
	private List<Account> accounts=new ArrayList<>();
	public void addAccount(Account account) {
		accounts.add(account);
	
	}
    public void printlist() {
    	for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Username: " + account.getUsername());
            System.out.println("Password: " + account.getPassword());
            System.out.println();
    	}
    }
	public boolean validate(String enteredUsername, String enteredPassword) {
		// TODO Auto-generated method stub
		Iterator itr=accounts.iterator();
		boolean valid=false;
		while(itr.hasNext()) {
			Account a=(Account) itr.next();
			if(a.getUsername().equals(enteredUsername) && a.getPassword().equals(enteredPassword)) {
				valid=true;
			}
			else {
				valid=false;
			}
		}
		return valid;
	}
}

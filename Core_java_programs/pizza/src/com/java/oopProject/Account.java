package com.java.oopProject;
public class Account {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private String username;
    private String password; 

	public Account(int accountNumber,double balance,String accountHolderName,String username,String password) {
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    	this.accountHolderName=accountHolderName;
    	this.username=username;
    	this.password=password;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}


package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class userlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("1.FirstTime User");
		System.out.println("2.Existing user");

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			firstTimeUser();
			break;
		case 2:
			ExistingUser();
			break;
		default:
			System.out.println("invalid input");
			System.out.println("enter valid input");
			break;
		}

	}

	public static void ExistingUser() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.login");
		System.out.println("2.forgot password");
		System.out.println("3.change password");
		System.out.println("enter choice");
		
		int choice=sc.nextInt();
	
		switch(choice) {
		case 1:
			login();
			
			
			break;
		case 2:
			forgot();
			break;
		case 3:
			change();
			break;
		default:
			System.out.println("invalid input");
			System.out.println("enter valid input");
			break;
		}
		
	}

	private static void change() {
		// TODO Auto-generated method stub
		
	}

	private static void forgot() {
		// TODO Auto-generated method stub
		
	}

	private static void login() {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmnt=null;
		ResultSet res1=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded succesfully");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt", "root", "root");
			System.out.println("connection is successfull");
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter username and password");
			System.out.println("enter username");
			String uname=sc.nextLine();
			System.out.println("enter password");
			String password=sc.nextLine();

			String s="select * from user where usename=?";
			PreparedStatement stmt = con.prepareStatement(s);
			stmt.setString(1, uname);
			res1 = stmt.executeQuery();
			
			if(res1.next()) {
				String temppass=res1.getString(2);
				String enpass=encryptPassword(password);
					if(temppass.equals(enpass)) {
					    System.out.println("login success");
					}
					else {
						System.out.println("invalid password");
						login();
					}
			}
			else {
			System.out.println("invalid username");
			}

		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	public static void firstTimeUser() {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmnt=null;
		ResultSet res=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded succesfully");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt", "root", "root");
			System.out.println("connection is successfull");
			
			Scanner sc=new Scanner(System.in);
			// TODO Auto-generated method stub
			System.out.println("enter username");
			String uname=sc.nextLine();
			System.out.println("enter password");
			String password=sc.nextLine();
			System.out.println("enter phone number");
			long number=sc.nextLong();
			
			String k=encryptPassword(password);
			boolean numk=checknumlen(number);
//			while(numk==false) {
//				System.out.println("enter a valid number");
//				System.out.println("enter phone number");
//			    number=sc.nextLong();
//			    
//				
//			}
			//or
			if(numk==false) {
				System.out.println("enter valid phone number");
				firstTimeUser();
				
			}
			else {
				String s="insert into user values(?,?,?)";
				PreparedStatement ps = con.prepareStatement(s);
				ps.setString(1, uname);
				ps.setString(2, k);
				ps.setLong(3, number);
				int rows=ps.executeUpdate();
				if(rows==0) {
					System.out.println("insertion cant be done");
				}
				else {
				System.out.println("rows add succesfully "+rows);
				System.out.println("your registration is sucessfull");
				}
				
			
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

    public static boolean checknumlen(long number) {
		// TODO Auto-generated method stub
    	String s=Long.toString(number);
    	int length=s.length();
    	if(length==10) {
    		return true;
    	}
    	else {
		return false;}
	}

	public static String encryptPassword(String password) {
		// TODO Auto-generated method stub
		char pw[]=password.toCharArray();
		String k="";
		for(int i=0;i<pw.length;i++) {
			int x=pw[i];
			x+=10;
			k+=(char)x;
		}
		return k;
		//or 
//		char pw1[]=password.toCharArray();
//		char enpw[]=new char[pw1.length];
//		String k1="";
//		for(int i=0;i<pw1.length;i++) {
//			int x=pw1[i];
//			x+=10;
//			enpw[i]=(char)x;
//		}
//		   String k11=new String(enpw);
//		return k11;
		
	}

}

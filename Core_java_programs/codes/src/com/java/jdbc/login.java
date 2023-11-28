package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmnt=null;
		ResultSet res=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Driver loaded succesfully");

		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt", "root", "root");
		System.out.println("connection is successfull");


		int choice=0;
		do {
			System.out.println("1.FirstTime User");
			System.out.println("2.Existing user");

			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				firstTimeUser(con);
				break;
			case 2:
				ExistingUser(con);
				break;
			default:
				System.out.println("invalid input");
				System.out.println("enter valid input");
				break;
			}


		}while(choice!=0);

	}

	private static void ExistingUser(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter username and password");
		System.out.println("enter username");
		String uname=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();

		String s="select * from user";
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(s);
		while(res.next()) {
			if(res.getString(1).equals(uname) && res.getString(2).equals(password)) {
				System.out.println("login success");
			}
			else {
				System.out.println("login failed invalid username and password");
				System.out.println("enter your option");
				System.out.println("1.forgot password");
				System.out.println("2.change password");
				int option=sc.nextInt();
				switch(option) {
				case 1:
					forgot();
					break;
				case 2:
					change();
					break;
				default:
					System.out.println("invalid input");
					System.out.println("enter valid input");
					break;
				}


			}
		}



	}

	private static void change() {
		// TODO Auto-generated method stub

	}

	private static void forgot() {
		// TODO Auto-generated method stub


	}

	private static void firstTimeUser(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter username");
		String uname=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("enter phone number");
		long number=sc.nextLong();
		String s="insert into user values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(s);
		ps.setString(1, uname);
		ps.setString(2, password);
		ps.setLong(3, number);
		int rows=ps.executeUpdate();
		System.out.println("rows add succesfully "+rows);
		System.out.println("your registration is sucessfull");
	}

}

package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc2 {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Connection con=null;
			Statement stmnt=null;
			ResultSet res=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded succesfully");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt", "root", "root");
			System.out.println("connection is established");
			//create 
			String s="update student1 set name=? where id=?";
			PreparedStatement psmt=con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter id");
			int tempId=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name");
			String tempName=sc.nextLine();
			psmt.setString(1, tempName);
			psmt.setInt(2, tempId);
			int rows=psmt.executeUpdate();
			System.out.println("rows updated "+rows);
			
			//delete rows from table
			String s1="delete from student1 where name=?";
			PreparedStatement psmt1=con.prepareStatement(s1);
			System.out.println("enter name");
			String tempName1=sc.nextLine();
			psmt1.setString(1, tempName1);
			int rows1=psmt1.executeUpdate();
			System.out.println("rows deleted "+rows1);

			
			
            
            


			//				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

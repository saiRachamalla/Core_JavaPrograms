package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class withoutTransaction {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt", "root","root");
			
			String s="update student1 set name=? where id=?";
			java.sql.PreparedStatement psmt=con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter employeeid");
			int tempId=sc.nextInt();
			sc.nextLine();
			System.out.println("enter new employeename");
			String tempName=sc.nextLine();
			psmt.setString(1, tempName);
			psmt.setInt(2, tempId);
			int rows=psmt.executeUpdate();
			System.out.println("rows updated "+rows);
			
			System.out.println("enter employeeid");
			int tempId1=sc.nextInt();
			sc.nextLine();
			System.out.println("enter new employeename");
			String tempName1=sc.nextLine();
			psmt.setString(1, tempName1);
			psmt.setInt(2, tempId1);
			int rows1=psmt.executeUpdate();
			System.out.println("rows updated "+rows1);
			
			System.out.println("enter employeeid");
			int tempId2=sc.nextInt();
			sc.nextLine();
			System.out.println("enter new employeename");
			String tempName2=sc.nextLine();
			psmt.setString(1, tempName2);
			psmt.setInt(2, tempId2);
			int rows2=psmt.executeUpdate();
			System.out.println("rows updated "+rows2);
			
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}}
package com.java.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class jdbc1 {
public static void main(String[] args) throws ClassNotFoundException {
    try {
    	Connection con=null;
    	Statement stmnt=null;
    	ResultSet res=null;
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		System.out.println("Driver loaded succesfully");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt", "root", "root");
		System.out.println("connection is established");
		//create statement
		
//		String s="select * from student1";
//		stmnt=con.createStatement();
//		res=stmnt.executeQuery(s);
		
//		while(res.next()) {
//		int id=res.getInt(1);
//		String name=res.getString(2);
//		int marks1=res.getInt(3);
//		int marks2=res.getInt(4);
//		int marks3=res.getInt(5);
//		System.out.println(id+"     "+name+"     "+marks1+"     "+marks2+"     "+marks3);
//	    }
	
		
		//get table metadata
//	    ResultSetMetaData rsmd = res.getMetaData();
//	    for(int i=1;i<=rsmd.getColumnCount();i++) {
//	    	System.out.println(rsmd.getColumnName(i));
//	    	System.out.println(rsmd.getColumnTypeName(i));
//	    }
		
		
		//print details based on id
//		String s1="select * from student1 where id=?";
//		PreparedStatement psmt = con.prepareStatement(s1);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter id");
//		int tempId=sc.nextInt();
//		psmt.setInt(1, tempId);
//		res=psmt.executeQuery();
//		
//	    //print table data
//		
//		if(res.next()) {
//			int id=res.getInt(1);
//			String name=res.getString(2);
//			int marks1=res.getInt(3);
//			int marks2=res.getInt(4);
//			int marks3=res.getInt(5);
//			System.out.println(id+"     "+name+"     "+marks1+"     "+marks2+"     "+marks3);
//		}
		
		//update the table
		
		String s="insert into student1 values(?,?,?,?,?)";
		PreparedStatement psmt=con.prepareStatement(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int tempId=sc.nextInt();
		System.out.println("enter name");
		String tempName=sc.next();
		System.out.println("enter marks1");
		int tempm1=sc.nextInt();
		System.out.println("enter marks2");
		int tempm2=sc.nextInt();
		System.out.println("enter marks3");
		int tempm3=sc.nextInt();
		psmt.setInt(1, tempId);
		psmt.setString(2, tempName);
		psmt.setInt(3, tempm1);
		psmt.setInt(4, tempm2);
		psmt.setInt(5, tempm3);
		int rows=psmt.executeUpdate();
		System.out.println("no of rows inserted id"+rows);
		
		
		//update existing data
		
		
		
//		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
}
}

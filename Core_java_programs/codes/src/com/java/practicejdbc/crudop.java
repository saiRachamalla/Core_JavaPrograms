package com.java.practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class crudop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection con=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("driver loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt","root","root");
			System.out.println("connection succes");
			
			 String s="select * from student1";
				Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);
				ResultSet res = stm.executeQuery(s);
				System.out.println("student details");
				while(res.next()) {
					int id=res.getInt(1);
					String name=res.getString(2);
					int m1=res.getInt(3);
					int m2=res.getInt(4);
					int m3=res.getInt(5);
					System.out.println(id+" "+name+" "+m1+" "+m2+" "+m3);
				}
				
			
////			String s="select * from student1";
////			Statement stm=con.createStatement();
////			ResultSet res = stm.executeQuery(s);
////			System.out.println("student details");
////			while(res.next()) {
////				int id=res.getInt(1);
////				String name=res.getString(2);
////				int m1=res.getInt(3);
////				int m2=res.getInt(4);
////				int m3=res.getInt(5);
////				System.out.println(id+" "+name+" "+m1+" "+m2+" "+m3);
////			}
////			
			System.out.println("stduent metadata");
			ResultSetMetaData md = res.getMetaData();
			for(int i=1;i<md.getColumnCount();i++) {
				System.out.println(md.getColumnName(i));
				System.out.println(md.getColumnTypeName(i));
			}
//			
			System.out.println("select particular student data ");
			
			String s2="select * from student1 where id=?";
			PreparedStatement ps = con.prepareStatement(s2);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter user id you want to get details");
			int tempid=sc.nextInt();
			ps.setInt(1, tempid);
			ResultSet res1 = ps.executeQuery();
			//System.out.println(res1);
			while(res1.next()) {
				int id=res1.getInt(1);
				String name=res1.getString(2);
				int m1=res1.getInt(3);
				int m2=res1.getInt(4);
				int m3=res1.getInt(5);
				System.out.println(id+" "+name+" "+m1+" "+m2+" "+m3);
				}
				
//			System.out.println("insert update student data");
//			String s3="insert into student values (?,?,?,?,?)";
//			PreparedStatement ps1 = con.prepareStatement(s3);
//			System.out.println("enter user id you want to add details");
//			int tempid1=sc.nextInt();
//			System.out.println("enter name");
//			String tname=sc.next();
//			System.out.println("enter m1 marks");
//			int tempm1=sc.nextInt();
//			System.out.println("enter m2 marks");
//			int tempm2=sc.nextInt();	
//			System.out.println("enter m3 marks");
//			int tempm3=sc.nextInt();
//			ps1.setInt(1, tempid1);
//			ps1.setString(2,tname);
//			ps1.setInt(3, tempm1);
//			ps1.setInt(4, tempm2);
//			ps1.setInt(5, tempm3);
//			int res2 = ps1.executeUpdate();
//			
//            System.out.println("row add succesfully");
            
			
			String s1="insert into student1 values(?,?,?,?,?)";
			PreparedStatement psmt=con.prepareStatement(s1);
			//Scanner sc=new Scanner(System.in);
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
			
			res.absolute(2);
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3)+" "+res.getInt(4)+" "+res.getInt(5));
//			res.first();
//			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3)+" "+res.getInt(4)+" "+res.getInt(5));
			while(res.next()) {
				int id=res.getInt(1);
				String name=res.getString(2);
				int m1=res.getInt(3);
				int m2=res.getInt(4);
				int m3=res.getInt(5);
				System.out.println(id+" "+name+" "+m1+" "+m2+" "+m3);
			}
			
			
			
			
			
			
			
//			String s1="select * from student1 where id=?";
//			PreparedStatement psmt = con.prepareStatement(s1);
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter id");
//			int tempId=sc.nextInt();
//			psmt.setInt(1, tempId);
//			res=psmt.executeQuery();
//			
//		    //print table data
//			
//			while(res.next()) {
//				int id=res.getInt(1);
//				String name=res.getString(2);
//				int marks1=res.getInt(3);
//				int marks2=res.getInt(4);
//				int marks3=res.getInt(5);
//				System.out.println(id+"     "+name+"     "+marks1+"     "+marks2+"     "+marks3);
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

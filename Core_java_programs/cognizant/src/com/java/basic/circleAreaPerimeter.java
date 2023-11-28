package com.java.basic;
import java.util.Scanner;
public class circleAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float radius=s.nextFloat();
		double perimeter=2*Math.PI*radius;
		double area=Math.PI*radius*radius;
		System.out.println("perimeter "+perimeter);
		System.out.println("area "+area);

	}

}

package com.interviewQuestions.sainadh20set;

class shape1{
	void calculateArea() {
		
	}
	void calculatePerimeter() {
		
	}
}
class circle3 extends shape1{
	private double pi=3.147;
	private double r=4;
	@Override
 void calculateArea() {
		double area=pi*r*r;
		System.out.println("the arear of Circle is"+area);
	}
	@Override
	void calculatePerimeter() {
		double perimeter=2 * Math.PI * r;
		System.out.println("the perimeter of circle is"+perimeter);
	}
}
class Rectangle extends shape1{
	private double l=4;
	private double w=4;
	@Override
 void calculateArea() {
		double area=l*w;
		System.out.println("area of rectangle is"+area);
	}
	@Override
	void calculatePerimeter() {
		double perimeter=2*(l+w);
		System.out.println("the perimeter of rectangle"+perimeter);
		
	}
}
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        circle3 c=new circle3();
       Rectangle r=new Rectangle();
       shape1 ref;
       ref=c;
       System.out.println("circle:");
       ref.calculateArea();
       ref.calculatePerimeter();
       ref=r;
       System.out.println("circle:");
       ref.calculateArea();
       ref.calculatePerimeter();
	}

}
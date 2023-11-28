package com.interviewQuestions.sainadh20set;

class Circle2{
	private double radius;
	Circle2(){
		radius=5.5;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	double getRadius() {
		return radius;
	}
	public  void area() {
		double pi=3.147;
		double area=pi*radius*radius;
		System.out.println(area);
	}
}
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Circle2 c=new Circle2();
   c.setRadius(4.6);
   c.getRadius();
   System.out.println("area of circle is:");
   c.area();
	}

}

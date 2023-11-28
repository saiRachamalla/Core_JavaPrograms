package com.interviewQuestions.sainadh20set;
class Person{
	private String name;
	private int age;
	private String gender;
	 Person(){
		 name="sai";
		 age=22;
		 gender="female";
	 }
	 void getData() {
		 System.out.println("The name of the Person is:"+name);
		 System.out.println("The of "+ name + " is:"+age);
		 System.out.println("The gender "+ name + " is:"+gender);
	 }
	 public void Check() {
		 if(age>=18) {
			 System.out.println("The Person Elgible to vote");
		 }
		 else {
			 System.out.println("The person is not Elgible to vote");
		 }
	 }
}
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person();
p.getData();
p.Check();
	}

}


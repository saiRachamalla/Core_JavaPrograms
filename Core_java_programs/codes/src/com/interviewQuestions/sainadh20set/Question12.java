package com.interviewQuestions.sainadh20set;

class Person1{
    private String name;
	private String address;
	public Person1(String name, String address){
		 this.name = name;
	        this.address = address;
	 }
	 public String getName() {
	        return name;
	    }

	    public String getAddress() {
	        return address;
	    }
}
class student extends Person1{
	private String ID;
	private double GPA;
	student(String name, String address,String ID,double GPA) {
		super(name,address);
		// TODO Auto-generated constructor stub
		this.ID =ID;
        this.GPA = GPA;
	}
	 public String getStudentID() {
	        return ID;
	    }

	    public double getGPA() {
	        return GPA;
	    }
}
class Teacher extends Person1{
	private String employeeID;
    private String subjectTaught;
	Teacher(String name, String address,String employeeID, String subjectTaught) {
		super(name,address);
		// TODO Auto-generated constructor stub
		this.employeeID=employeeID;
		this.subjectTaught=subjectTaught;
	}
	public String getEmployeeID() {
        return employeeID;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }
	}

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student("John Smith", "123 Main St", "S12345", 3.75);
		
		System.out.println("Student Information:");
        System.out.println("Name: " + s.getName());
        System.out.println("Address: " + s.getAddress());
        System.out.println("Student ID: " + s.getStudentID());
        System.out.println("GPA: " + s.getGPA());
        Teacher t = new Teacher("Alice Johnson", "456 Elm St", "T9876", "Mathematics");
        System.out.println("\nTeacher Information:");
        System.out.println("Name: " + t.getName());
        System.out.println("Address: " + t.getAddress());
        System.out.println("Employee ID: " +t.getEmployeeID());
        System.out.println("Subject Taught: " + t.getSubjectTaught());
	}
}
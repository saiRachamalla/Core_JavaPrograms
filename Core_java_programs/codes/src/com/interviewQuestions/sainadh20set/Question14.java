package com.interviewQuestions.sainadh20set;
class Employee{
	private String name;
	private double salary;
	private int EmployeeID;
	 Employee(String name,double salary,int EmployeeID){
		 this.name=name;
		 this.salary=salary;
		 this.EmployeeID=EmployeeID;
	 }
	 void getData() {
			System.out.println(name);
			System.out.println(salary);
			System.out.println(EmployeeID);
		}
	 public void giveYearlyBonus(double bonusAmount) {
	        salary += bonusAmount;
	        System.out.println("salary after Bonus:"+salary);
	    }
}
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("John Doe", 50000.0, 101);
        System.out.println("Employee Details:");
        employee1.getData();
        employee1.giveYearlyBonus(5000);

	}

}


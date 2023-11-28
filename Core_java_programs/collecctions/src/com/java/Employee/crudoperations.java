package com.java.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
class Employee{
	int employeeId;
	String employeeName;
	int employeeSalary;
	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return employeeSalary;
	}
	public void setSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
public class crudoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		
			ArrayList<Employee> employee = new ArrayList<Employee>();
			Scanner scan=new Scanner(System.in);
			Scanner scan1=new Scanner(System.in);
			do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
	        System.out.println("4.Update");
	        System.out.println("5.Delete");
	        System.out.println("6.Exit");
	        System.out.println("enter your choice");
	        choice=scan.nextInt();
	        
	        switch(choice) {
	        case 1: System.out.println("enter EmployeeId");
	                int employeeId=scan.nextInt();
	                System.out.println("enter EmployeeName");
	                //String employeeName=scan.nextLine();
	                String employeeName=scan1.nextLine();
	                System.out.println("enter EmployeeSalary");
	                int employeeSalary=scan.nextInt();
	                
	                Employee e = new Employee(employeeId, employeeName, employeeSalary);
	                employee.add(e);
	                System.out.println("Employee data added succesfully");
	                break;
	                //main(args);
	        case 2:
//	        	   for(Employee data:employee){
//	        		   System.out.println(data.employeeId);
//	        		   System.out.println(data.employeeName);
//	        		   System.out.println(data.employeeSalary);  
//	        	   }
//	        	   System.out.println("Above is the employee details");
	        	
	        	   Iterator<Employee> itr=employee.iterator();
	        	   while(itr.hasNext()) {
	        		   System.out.println(itr.next());
	        	   }
	        	   break;
	        case 3:
	        	boolean status=false;
	        	System.out.println("enter the employee id");
	        	int employeeId2=scan.nextInt();
	        	 Iterator<Employee> itr1=employee.iterator();
	        	   while(itr1.hasNext()) {
	        		   Employee e1=itr1.next();
	        		   if( e1.getEmployeeId()==employeeId2) {
	        			   System.out.println(e1);
	        			   status=true;
	        		   }
	        	   }
	        	   if(status==false) {
	        		   System.out.println("employee details not found");
	        	   }
	        	   break;
	        case 4:
//	        	System.out.println("enter the name you want to update");
//	        	String updateName=scan1.nextLine();
//	        	 Iterator<Employee> itr2=employee.iterator();
//	        	   while(itr2.hasNext()) {
//	        		   Employee e1=itr2.next();
//	        		   if( e1.getEmployeeId()==updateid) {
//	        			   e1.setEmployeeName(updateName);
// 
//	        		   }
//	        	   }
//	        	   System.out.println("name updated succesfully");
//	        	   break;
	        	boolean status1=false;
	        	System.out.println("enter employee id you want to update");
	        	int updateid=scan.nextInt();
//	        	
	        	ListIterator<Employee> litr=employee. listIterator();
	        	while(litr.hasNext()) {
	        		Employee e1=litr.next();
	        		if(e1.employeeId==updateid) {
	        			System.out.println("enter the new name");
	        			String newName=scan1.nextLine();
	        			System.out.println("enter the new salary");
						int newSalary=scan.nextInt();
						Employee e2=new Employee(updateid,newName,newSalary);
	        			litr.set(e2);
	        			status1=true;
	        		}
	        	}
	        	if(status1==false) {
	        		System.out.println("emp not found");
	        	}
	        	else {
	        		System.out.println("emp details updated succesfully");
	        	}
                break;
	        	
	        case 5:
//	        	System.out.println("enter the employeeid you want to delete");
//	        	int delid=scan.nextInt();
//	        	 Iterator<Employee> itr3=employee.iterator();
//	        	   while(itr3.hasNext()) {
//	        		   Employee e1=itr3.next();
//	        		   if( e1.getEmployeeId()==delid) {
//	        			  itr3.remove();
//
//	        		   }
//	        	   }
//	        	   System.out.println("employee details deleted succesfully");
//	        	   break;
	        	boolean status2=false;
	        	System.out.println("enter employee id you want to delete");
	        	int updateid1=scan.nextInt();
	        	ListIterator<Employee> litr1=employee. listIterator();
	        	while(litr1.hasNext()) {
	        		Employee e1=litr1.next();
	        		if(e1.employeeId==updateid1) {
	        			litr1.remove();
	        			status2=true;
	        		}
	        	}
	        	if(status2==false) {
	        		System.out.println("emp not found");
	        	}
	        	else {
	        		System.out.println("emp details deleted succesfully");
	        	}
	        	break;
	        	
	        	
	        case 6:
	        	System.out.println("you are exiting from the program");
	        	System.exit(0);
	        	
	        }
	           
		}while(choice!=0);
	}

}

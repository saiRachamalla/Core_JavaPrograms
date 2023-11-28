package com.java.exceptions;
import java.util.*;
class p1{
	void operation1()throws Exception {
		System.out.println("entered into op1");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
        int num2=sc.nextInt();
        int res=num1/num2;
        System.out.println(res);
        System.out.println("left from op1");
        
		
	}
}
class p2{
	void operation2()throws Exception{
		System.out.println("enterd option2");
		p1 pp2=new p1();
		pp2.operation1();
		System.out.println("left from op2");
	}
}

class p3{
	void operation3(){
		try{System.out.println("enterd option3");
		p2 pp3=new p2();
		pp3.operation2();
		System.out.println("left from op3");}
		catch(Exception e) {
			System.out.println("handled by class3");
		}
	}

}



public class throwsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enteres main");
		p3 pp4=new p3();
		pp4.operation3();
		System.out.println("left from main");
	}

}

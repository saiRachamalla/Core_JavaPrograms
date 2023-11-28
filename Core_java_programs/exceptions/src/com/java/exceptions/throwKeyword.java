package com.java.exceptions;

import java.util.Scanner;

class program1{
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
class program2{
	void operation2()throws Exception{
		System.out.println("enterd option2");
		program1 pp2=new program1();
		pp2.operation1();
		System.out.println("left from op2");
	}
}

class program3{
	void operation3() throws Exception{
		System.out.println("enterd option3");
		program2 pp3=new program2();
		pp3.operation2();
		System.out.println("left from op3");
		
	}

}
class program4{
	void operation4() throws Exception {
		try {
			System.out.println("entered oiption4");
			program3 pp4=new program3() ;
			pp4.operation3();
			
		}
		catch(Exception e) {
			System.out.println("handled in op4");
			throw e;
		}
		System.out.println("left from op4");
	}
}



public class throwKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{System.out.println("enteres main");
		program4 pp5=new program4();
		pp5.operation4();
		}
		catch(Exception e){
			System.out.println("handled by main");
		}
		System.out.println("left from main");


	}

}

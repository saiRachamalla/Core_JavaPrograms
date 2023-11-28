package com.java.interviewQuestions;
import java.util.Scanner;
public class AverageMarks {
    float average(int sem1,int sem2,int sem3,int sem4,int sem5,int sem6,int sem7,int sem8) {
    	return((sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 8 sems marks");
		AverageMarks am=new AverageMarks();
		float result=am.average(sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt());
		System.out.println("average marks "+result);
	}

}

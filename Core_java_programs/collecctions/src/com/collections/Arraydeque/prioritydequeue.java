package com.collections.Arraydeque;

import java.util.PriorityQueue;

public class prioritydequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);
		
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(50);
		pq1.add(75);
		pq1.add(125);
		pq1.add(100);
		pq1.add(175);
		pq1.add(150);
		pq1.add(275);
		pq1.add(200);
		pq1.add(20);
		pq1.add(225);
		pq1.add(25);
		System.out.println(pq1);
        
        
	}

}

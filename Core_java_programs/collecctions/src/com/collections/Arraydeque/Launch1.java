package com.collections.Arraydeque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
	int cric_id;
	String name;
	int runs;
	int matches;
	int catches;
	int centuries;
	int fifties;
	int mom;
	public Cricketer(int cric_id, String name, int runs, int matches, int catches, int centuries, 
			int fifties,
			int mom) {
		super();
		this.cric_id = cric_id;
		this.name = name;
		this.runs = runs;
		this.matches = matches;
		this.catches = catches;
		this.centuries = centuries;
		this.fifties = fifties;
		this.mom = mom;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cric_id+"--"+name+"--"+runs+"--"+matches
				+"--"+catches+"--"+centuries+"--"+fifties+"--"+mom;
	}

//	@Override
//	public int compareTo(Object y) {
//		if(this.runs>((Cricketer)y).runs) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
	
}

class Beta implements Comparator{
	public int compare(Object x, Object y) {
		if(((Cricketer)x).runs > ((Cricketer)y).runs){
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class Launch1 {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer(1, "rohith", 10000, 200, 250, 30, 60, 20);
		Cricketer c2 = new Cricketer(2, "virat", 14000, 240, 300, 47, 67, 30);
		Cricketer c3 = new Cricketer(3, "smith", 8000, 170, 120, 25, 54, 12);
		ArrayList<Cricketer> al = new ArrayList<Cricketer>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Beta b = new Beta();
		Collections.sort(al,b);
		System.out.println(al);
		
		
	}
}

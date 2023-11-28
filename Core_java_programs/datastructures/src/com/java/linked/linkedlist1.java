package com.java.linked;

class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data=data;
		this.next=null;
	}
}
class linkedlistprint{
	static Node1 head;

	public static void printlist() {
		Node1 curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlistprint ll=new linkedlistprint();
		Node1 p1=new Node1(10);
		Node1 p2=new Node1(20);
		Node1 p3=new Node1(30);
		p1.next=p2;
		p2.next=p3;
		ll.head=p1;
		ll.printlist();

	}
}

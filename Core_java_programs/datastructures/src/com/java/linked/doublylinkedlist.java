package com.java.linked;
class node{
	int data;
	node prev;
	node next;
	node(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
class doublelist{
	node head;
	node tail;
    void print(){
		node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
}
public class doublylinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublelist dl=new doublelist();
		node n=new node(10);
		node n1=new node(20);
		node n2=new node(30);
		node n3=new node(40);
		n.next=n1;
		n1.next=n2;
		n2.next=n3;
		
		n3.prev=n2;
		n2.prev=n1;
		n1.prev=n;
		
		dl.head=n;
		dl.tail=n3;
		dl.print();
		
	}

}

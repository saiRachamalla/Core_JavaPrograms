package com.java.datastructures;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class linkedlistprint1{
	Node head;

	void printlist() {
		Node curr=head;
		System.out.println(head);
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	void add(int e)
	{
		Node temp=new Node(e);
		if(head==null) {
			head=temp;
		}
		else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
}
public class addelementstolinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlistprint1 lsp=new linkedlistprint1();
		lsp.add(10);
		lsp.add(30);
		lsp.add(40);
		lsp.add(60);
		lsp.printlist();

	}

}

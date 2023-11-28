package com.java.addelementstolinkedlist;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class Linked{
	
	Node head;
	
	public void addfirst(int k) {
		Node n=new Node(k);
		if(head!=null) {
		   n.next=head;
		   head=n;
		}
		else {
			head=n;
		}
	}
   
	public void add(int e) {
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
		// TODO Auto-generated method stub
		 }
	}

	public void printlist() {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
		
	}

	public void addatindex(int i, int e) {
		// TODO Auto-generated method stub
		Node n=new Node(e);
		int count=0;
		Node curr=head;
		while(count<i-1) {
			curr=curr.next;
			count++;
		}
		n.next=curr.next;
		curr.next=n;	
	}

	public void removefirst() {
		// TODO Auto-generated method stub
		Node curr=head;
		head=curr.next;
		curr.next=null;
		
		
	}

	public void removelast() {
		// TODO Auto-generated method stub
		Node curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
		
		
	}

	public void size() {
		// TODO Auto-generated method stub
		Node curr=head;
		int count=0;
		while(curr!=null) {
			curr=curr.next;
			count++;
			
		}
		System.out.println(count);
		
	}

//	public void index(int i) {
//		// TODO Auto-generated method stub
//		Node curr=head;
//		int count=0;
//		while(curr!=null) {
//			if(curr.data==i) {
//				System.out.println(count);
//			}
//			else {
//			curr=curr.next;
//			count++;}
//			
//		}
//		System.out.println();
//		
//	}
//		
//	
	
}
public class addelementstolinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Linked l=new Linked();
        l.add(10);
        l.add(30);
        l.add(40);
        l.addfirst(2);
        l.addfirst(1);
//        l.printlist();
        l.addatindex(2,20);
//        l.printlist();
        l.removefirst();
//        l.printlist();
        l.removefirst();
//        l.printlist();
        l.removelast();
        l.printlist();
        l.size();
        
        
	}

}

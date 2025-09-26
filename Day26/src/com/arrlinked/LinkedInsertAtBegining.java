package com.arrlinked;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class SinglyN{
	Node head;
	
	public void insertBeg(int data) {
		Node nn=new Node(data);
		
		nn.next=head;
		
		head=nn;
		
	}
	
	public void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
		System.out.print("Null");
		
	}
	
}


public class LinkedInsertAtBegining {
	public static void main(String[] args) {
		
		SinglyN s=new SinglyN();
		s.insertBeg(10);
		s.insertBeg(20);
		s.display();
		
		
		
	}

}

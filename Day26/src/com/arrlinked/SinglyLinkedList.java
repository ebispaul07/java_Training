package com.arrlinked;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class Singly{
	Node head;
	
	public void add(int data) {
		
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			
			while(temp.next!=null) {
				
				temp=temp.next;
				
			}
			
			temp.next=newNode;
			
		}
		
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


public class SinglyLinkedList {
	public static void main(String[] args) {
		
		Singly s=new Singly();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.display();
		
	}

}

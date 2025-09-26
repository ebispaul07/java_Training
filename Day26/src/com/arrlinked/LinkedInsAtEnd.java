package com.arrlinked;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class SinglyInse{
	Node head;
	
	public void insAtEnd(int data) {
		Node nn=new Node(data);
		
		if(head==null) {
			head=nn;
		}else {
			Node temp=head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			temp.next=nn;
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

public class LinkedInsAtEnd {
	public static void main(String[] args) {
		SinglyInse s=new SinglyInse();
		s.insAtEnd(10);
		s.insAtEnd(20);
		s.insAtEnd(30);
		s.display();
	}
	
	

}

package com.poly;

class Book{
	private int id;
	private String title;
	private String auther;
	private int availableCopies;
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTItle() {
		return title;
	}
	
	
	public void setAuther(String auther) {
		this.auther=auther;
	}
	
	public String getAuther() {
		return auther;
	}
	
	public void setAvailablecopies(int availableCopies) {
		this.availableCopies=availableCopies;
	}
	
	public int getAvailablecopies() {
		return availableCopies;
	}
	
	
	
	Book(int id,String title,String auther,int availableCopies){
		
		this.id=id;
		this.title=title;
		this.auther=auther;
		this.availableCopies=availableCopies;
		
	}
	
	Book(int id,String title,String auther){
		
		this.id=id;
		this.title=title;
		this.auther=auther;

	}
	
	public void addBook() {
		
	}
	
	public void issueBook() {
		
	}
	
	public void returnBook() {
		
	}
	
}


public class LibraryManagementSystem {
	
	public static void main(String[] args) {
		
		
		
	}
	

}

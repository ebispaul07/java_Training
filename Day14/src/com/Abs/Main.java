package com.Abs;

class Book{
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	
	public void setBookid(int bookId){
		this.bookId=bookId;
	}
	
	public int getBookid() {
		return bookId;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author){
		this.author=author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setIsavailable(boolean isAvailable){
		this.isAvailable=isAvailable;
	}
	
	public boolean getIsavailable() {
		return isAvailable;
	}
	
	
	}

public class Main {
	public static void main(String[] args) {
		
	}

}

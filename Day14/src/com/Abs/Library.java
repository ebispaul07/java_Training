package com.Abs;

abstract class LibraryItem{
	private String title;
	private String author;
	private int itemId;
	
	LibraryItem(String title,String author,int itemId){
		this.title=title;
		this.author=author;
		this.itemId=itemId;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public abstract void displayInfo();
	
}


class Book extends  LibraryItem{
	private int pageCount;
	

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	 Book(String title,String author,int itemId,int pageCount){
		super(title,author,itemId);
		this.pageCount=pageCount;
	}
	
	public void displayInfo() {
		System.out.println("Title:"+getTitle());
		System.out.println("Author:"+getAuthor());
		System.out.println("ItemId:"+getItemId());
		System.out.println("Page Count:"+getPageCount());
	}
}

public class Library {
	public static void main(String[] args) {
		Book b= new Book("Hero","Ebi",7,10);
		b.displayInfo();
	}

}

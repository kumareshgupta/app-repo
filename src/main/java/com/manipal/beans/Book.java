package com.manipal.beans;

public class Book {
	private int bookId;
	private String title;
	private double price;
	private String author;
	private String publication;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	@Override
	public String toString() {
		return "Book Details-> Book Id : " + bookId + ", title=" + title + ", price=" + price + ", author=" + author;
	}
	
	
}

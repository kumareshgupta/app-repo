package com.manipal.mains;

import com.manipal.beans.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GREAT");
		
		Book book = new Book();
		book.setBookId(1001);
		book.setTitle("Learn Microservice in 24 Hours");
		book.setAuthor("Roza");
		book.setPrice(399.00);
		
		
		
		System.out.println("Book Details : " + book);
		
		
		book = new Book();
		book.setBookId(1002);
		book.setTitle("India's Biggest Cover up");
		book.setAuthor("Anuj Dhar");
		book.setPrice(500.00);
		
		System.out.println("Book Details : " + book);
		
	}

}

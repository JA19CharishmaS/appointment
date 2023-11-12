package com.hexaware.librarymanagementsystem.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.librarymanagementsystem.entities.Book;
import com.hexaware.librarymanagementsystem.entities.Borrowing;

class BookServiceTest {
	BookService bservice = new BookService();

	@Test
	void testCreateBook() {
		Book book = new Book();
		int actual = bservice.createBook(book);
	    assertEquals(1,actual);
	}

	@Test
	void testUpdateBook() {
		Book book = new Book();
		int actual = bservice.updateBook(book);
	    assertEquals(2,actual);
	}
		

	@Test
	void testDeleteBook() {
		
		int actual = bservice.deleteBook(5);
	    assertEquals(5,actual);
	}

	@Test
	void testGetBookById() {
		Book expected = new Book(10,2, 0,"THE", "gill", "life", "hj234", "newspaper", "10-march-2022");
		Book actual = bservice.getBookById(10);
		assertEquals(expected,actual);
	
	}

	@Test
	void testGetAllAdmin() {
		List<Book> expected = new ArrayList<Book>();
		expected.add(new Book(10,2, 0,"THE", "gill", "life", "hj234", "newspaper", "10-march-2022"));
		expected.add(new Book(20,2, 0,"THE", "gill", "life", "hj234", "newspaper", "10-march-2022"));
		List<Book> actual = bservice.getAllAdmin();
		assertEquals(expected,actual);
	}
	
}

package com.hexaware.librarymanagementsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.librarymanagementsystem.entities.Book;
import com.hexaware.librarymanagementsystem.entities.Borrowing;

@Service
public class BookService implements IBook {

	@Override
	public int createBook(Book book) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int deleteBook(int bookid) {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Book getBookById(int bookid) {
		// TODO Auto-generated method stub
		Book book = new Book(10,2, 0,"THE", "gill", "life", "hj234", "newspaper", "10-march-2022");
		return book;
	}

	@Override
	public List<Book> getAllAdmin() {
		List<Book> book = new ArrayList<Book>();
		book.add(new Book(10,2, 0,"THE", "gill", "life", "hj234", "newspaper", "10-march-2022"));
		book.add(new Book(20,2, 0,"THE", "gill", "life", "hj234", "newspaper", "10-march-2022"));
		
		return book;
	}

}

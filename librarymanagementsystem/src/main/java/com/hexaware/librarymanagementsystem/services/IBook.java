package com.hexaware.librarymanagementsystem.services;

import java.util.List;

import com.hexaware.librarymanagementsystem.entities.Book;

public interface IBook {
	
	public int createBook(Book book);
	public int updateBook(Book book);
	public int deleteBook(int bookid);
	public Book getBookById(int bookid);
	public List<Book>getAllAdmin();
	
}

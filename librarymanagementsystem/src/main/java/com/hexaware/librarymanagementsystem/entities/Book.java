package com.hexaware.librarymanagementsystem.entities;

import java.util.Objects;

public class Book {
	
	private int bookid;
	private int quantity;
	private int availablequantity;
	private String booktitle;
	private String bookauthor;
	private String subject;
	private String isbn;
	private String publisher;
	private String publicationdate;
	

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, int quantity, int availablequantity, String booktitle, String bookauthor, String subject,
			String isbn, String publisher, String publicationdate) {
		super();
		this.bookid = bookid;
		this.quantity = quantity;
		this.availablequantity = availablequantity;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.subject = subject;
		this.isbn = isbn;
		this.publisher = publisher;
		this.publicationdate = publicationdate;
	}
	
	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getAvailablequantity() {
		return availablequantity;
	}


	public void setAvailablequantity(int availablequantity) {
		this.availablequantity = availablequantity;
	}


	public String getBooktitle() {
		return booktitle;
	}


	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}


	public String getBookauthor() {
		return bookauthor;
	}


	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getPublicationdate() {
		return publicationdate;
	}


	public void setPublicationdate(String publicationdate) {
		this.publicationdate = publicationdate;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", quantity=" + quantity + ", availablequantity=" + availablequantity
				+ ", booktitle=" + booktitle + ", bookauthor=" + bookauthor + ", subject=" + subject + ", isbn=" + isbn
				+ ", publisher=" + publisher + ", publicationdate=" + publicationdate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(availablequantity, bookauthor, bookid, booktitle, isbn, publicationdate, publisher,
				quantity, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return availablequantity == other.availablequantity && Objects.equals(bookauthor, other.bookauthor)
				&& bookid == other.bookid && Objects.equals(booktitle, other.booktitle)
				&& Objects.equals(isbn, other.isbn) && Objects.equals(publicationdate, other.publicationdate)
				&& Objects.equals(publisher, other.publisher) && quantity == other.quantity
				&& Objects.equals(subject, other.subject);
	}


	
}

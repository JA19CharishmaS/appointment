package com.hexaware.librarymanagementsystem.services;

import java.util.List;

import com.hexaware.librarymanagementsystem.entities.Borrowing;


public interface IBorrowing {
	
	public int createBorrowing(Borrowing borrowing);
	public int updateBorrowing(Borrowing borrowing);
	public int deleteBorrowing(int borrowingid);
	public Borrowing getBorrowingById(int borrowingid);
	public List<Borrowing>getAllBorrowing();

}

package com.hexaware.librarymanagementsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.librarymanagementsystem.entities.Borrowing;

@Service
public class BorrowingService implements IBorrowing {

	@Override
	public int createBorrowing(Borrowing borrowing) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateBorrowing(Borrowing borrowing) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int deleteBorrowing(int borrowingid) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Borrowing getBorrowingById(int borrowingid) {
		Borrowing borrowing= new Borrowing(10,101,203,"10-02=2023","24-02-2023","pending");
		return borrowing;
	}

	@Override
	public List<Borrowing> getAllBorrowing() {
		List<Borrowing> borrowing = new ArrayList<Borrowing>();
		borrowing.add(new Borrowing(1,101,203,"10-02=2023","22-02-2023","pending"));
		borrowing.add(new Borrowing(2,102,205,"12-02=2023","24-02-2023","pending"));
		
		return borrowing;
	}

}

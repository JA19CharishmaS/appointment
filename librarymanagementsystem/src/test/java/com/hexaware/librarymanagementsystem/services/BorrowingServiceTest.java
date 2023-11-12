package com.hexaware.librarymanagementsystem.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.librarymanagementsystem.entities.Book;
import com.hexaware.librarymanagementsystem.entities.Borrowing;

class BorrowingServiceTest {
	BorrowingService service = new BorrowingService();
	
	@Test
	void testCreateBorrowing() {
		Borrowing borrowing = new Borrowing();
		int actual = service.createBorrowing(borrowing);
	    assertEquals(1,actual);
	}

	@Test
	void testUpdateBorrowing() {
		Borrowing borrowing = new Borrowing();
		int actual = service.updateBorrowing(borrowing);
	    assertEquals(2,actual);
	}

	@Test
	void testDeleteBorrowing() {
		Borrowing borrowing = new Borrowing();
		int actual = service.updateBorrowing(borrowing);
	    assertEquals(2,actual);
		
	}

	@Test
	void testGetBorrowingById() {
		Borrowing expected = new Borrowing(10,101,203,"10-02=2023","24-02-2023","pending");
		Borrowing actual = service.getBorrowingById(10);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllBorrowing() {
		List<Borrowing> expected = new ArrayList<Borrowing>();
		expected.add(new Borrowing(1,101,203,"10-02=2023","22-02-2023","pending"));
		expected.add(new Borrowing(2,102,205,"12-02=2023","24-02-2023","pending"));
		List<Borrowing> actual = service.getAllBorrowing();
		assertEquals(expected,actual);
	}

}

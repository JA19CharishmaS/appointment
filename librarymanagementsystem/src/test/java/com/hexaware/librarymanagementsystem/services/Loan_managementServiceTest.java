package com.hexaware.librarymanagementsystem.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Loan_management;

class Loan_managementServiceTest {
	
	Loan_managementService service = new Loan_managementService();

	@Test
	void testCreateLoan() {
		Loan_management loan = new Loan_management();
		int actual = service.createLoan(loan);
	    assertEquals(1,actual);
	}

	@Test
	void testUpdateLoan() {
		Loan_management loan = new Loan_management();
		int actual = service.updateLoan(loan);
	    assertEquals(1,actual);
	}

	@Test
	void testDeleteLoan() {
		Loan_management loan = new Loan_management();
		int actual = service.deleteLoan(5);
	    assertEquals(5,actual);
	}

	@Test
	void testGetLoanById() {
		Loan_management expected = new Loan_management(501,101,12,"10-02=2023",200);
		Loan_management actual = service.getLoanById(10);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllAdmin() {
		List<Loan_management> expected = new ArrayList<Loan_management>();
		expected.add(new Loan_management(501,101,12,"10-02=2023",200));
		expected.add(new Loan_management(511,121,42,"20-02=2023",100));
		List<Loan_management> actual = service.getAllAdmin();
		assertEquals(expected,actual);
	}

}

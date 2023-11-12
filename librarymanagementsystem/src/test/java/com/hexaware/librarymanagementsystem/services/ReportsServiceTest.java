package com.hexaware.librarymanagementsystem.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Reports;

class ReportsServiceTest {
	ReportsService service = new ReportsService();

	@Test
	void testCreateReports() {
		Reports reports = new Reports();
		int actual = service.createReports(reports);
	    assertEquals(1,actual);
	}

	@Test
	void testUpdateReports() {
		Reports reports = new Reports();
		int actual = service.updateReports(reports);
	    assertEquals(1,actual);
	}

	@Test
	void testDeleteReports() {
		Reports reports = new Reports();
		int actual = service.deleteReports(1);
	    assertEquals(1,actual);
	}

	@Test
	void testGetReportsById() {
		Reports expected = new Reports(10,200,"active","pending");
		Reports actual = service.getReportsById(10);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllAdmin() {
		List<Reports> expected = new ArrayList<Reports>();
		expected.add(new Reports(110,200,"active","pending"));
		expected.add(new Reports(102,100,"active","pending"));
		List<Reports> actual = service.getAllAdmin();
		assertEquals(expected,actual);
	}

}

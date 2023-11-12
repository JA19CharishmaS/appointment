package com.hexaware.librarymanagementsystem.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Reservation;

class ReservationServiceTest {
	ReservationService service = new ReservationService();

	@Test
	void testCreateReservation() {
		Reservation reservation = new Reservation();
		int actual = service.createReservation(reservation);
	    assertEquals(1,actual);
	}

	@Test
	void testUpdateReservation() {
		Reservation reservation = new Reservation();
		int actual = service.updateReservation(reservation);
	    assertEquals(1,actual);
	}

	@Test
	void testDeleteReservation() {
		Reservation reservation = new Reservation();
		int actual = service.deleteReservation(1);
	    assertEquals(1,actual);
	}

	@Test
	void testGetReservationById() {
		Reservation expected = new Reservation(111,205,120,"12-8-2021");
		Reservation actual = service.getReservationById(101);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllAdmin() {
		List<Reservation> expected = new ArrayList<Reservation>();
		expected.add(new Reservation(111,205,120,"12-8-2021"));
		expected.add(new Reservation(171,305,130,"14-8-2021"));
		List<Reservation> actual = service.getAllAdmin();
		assertEquals(expected,actual);
	}

}

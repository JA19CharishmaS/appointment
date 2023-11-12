package com.hexaware.librarymanagementsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Reservation;

@Service
public class ReservationService implements IReservation {

	@Override
	public int createReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteReservation(int Reservation_Id) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Reservation getReservationById(int Reservation_Id) {
		Reservation reservation= new Reservation(111,205,120,"12-8-2021");
		return reservation;
	}

	@Override
	public List<Reservation> getAllAdmin() {
		List<Reservation> reservation = new ArrayList<Reservation>();
		reservation.add(new Reservation(111,205,120,"12-8-2021"));
		reservation.add(new Reservation(171,305,130,"14-8-2021"));
		
		return reservation;
	}

}

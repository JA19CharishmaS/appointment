package com.hexaware.librarymanagementsystem.services;

import java.util.List;

import com.hexaware.librarymanagementsystem.entities.Reservation;



public interface IReservation {
	
	public int createReservation(Reservation reservation);
	public int updateReservation(Reservation reservation);
	public int deleteReservation(int Reservation_Id);
	public Reservation getReservationById(int Reservation_Id);
	public List<Reservation>getAllAdmin();

}

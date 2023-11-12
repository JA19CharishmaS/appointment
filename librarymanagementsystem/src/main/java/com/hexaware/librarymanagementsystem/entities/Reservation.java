package com.hexaware.librarymanagementsystem.entities;

import java.util.Objects;

public class Reservation {
	
	private int reservationid;
	private int memberid;
	private int bookid;
	private String reservationdate;

	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(int reservationid, int memberid, int bookid, String reservationdate) {
		super();
		this.reservationid = reservationid;
		this.memberid = memberid;
		this.bookid = bookid;
		this.reservationdate = reservationdate;
	}

	public int getReservationid() {
		return reservationid;
	}

	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getReservationdate() {
		return reservationdate;
	}

	public void setReservationdate(String reservationdate) {
		this.reservationdate = reservationdate;
	}

	@Override
	public String toString() {
		return "reservation [reservationid=" + reservationid + ", memberid=" + memberid + ", bookid=" + bookid
				+ ", reservationdate=" + reservationdate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookid, memberid, reservationdate, reservationid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return bookid == other.bookid && memberid == other.memberid
				&& Objects.equals(reservationdate, other.reservationdate) && reservationid == other.reservationid;
	}

	
}

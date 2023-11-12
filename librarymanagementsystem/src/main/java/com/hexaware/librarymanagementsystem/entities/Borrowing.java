package com.hexaware.librarymanagementsystem.entities;

import java.util.Objects;

public class Borrowing {

	private int borrowingid;
	private int memberid;
	private int bookid;
	private String duedate;
	private String returndate;
	private String status;
	
	
	
	public Borrowing(int borrowingid, int memberid, int bookid, String duedate, String returndate, String status) {
		super();
		this.borrowingid = borrowingid;
		this.memberid = memberid;
		this.bookid = bookid;
		this.duedate = duedate;
		this.returndate = returndate;
		this.status = status;
	}



	public Borrowing() {
		// TODO Auto-generated constructor stub
	}



	public int getBorrowingid() {
		return borrowingid;
	}



	public void setBorrowingid(int borrowingid) {
		this.borrowingid = borrowingid;
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



	public String getDuedate() {
		return duedate;
	}



	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}



	public String getReturndate() {
		return returndate;
	}



	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Borrowing [borrowingid=" + borrowingid + ", memberid=" + memberid + ", bookid=" + bookid + ", duedate="
				+ duedate + ", returndate=" + returndate + ", status=" + status + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(bookid, borrowingid, duedate, memberid, returndate, status);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Borrowing other = (Borrowing) obj;
		return bookid == other.bookid && borrowingid == other.borrowingid && Objects.equals(duedate, other.duedate)
				&& memberid == other.memberid && Objects.equals(returndate, other.returndate)
				&& Objects.equals(status, other.status);
	}
	
	

}

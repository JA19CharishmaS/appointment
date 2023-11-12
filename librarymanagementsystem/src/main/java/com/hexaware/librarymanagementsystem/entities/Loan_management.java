package com.hexaware.librarymanagementsystem.entities;

import java.util.Objects;

public class Loan_management {
	
	private int loanid;
	private int memberid;
	private int bookid;
	private String duedate;
	private double fine;
	
	

	public Loan_management() {
		super();
	}


	public Loan_management(int loanid, int memberid, int bookid, String duedate, double fine) {
		super();
		this.loanid = loanid;
		this.memberid = memberid;
		this.bookid = bookid;
		this.duedate = duedate;
		this.fine = fine;
	}


	public int getLoanid() {
		return loanid;
	}



	public void setLoanid(int loanid) {
		this.loanid = loanid;
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



	public double getFine() {
		return fine;
	}



	public void setFine(double fine) {
		this.fine = fine;
	}



	@Override
	public String toString() {
		return "loan_management [loanid=" + loanid + ", memberid=" + memberid + ", bookid=" + bookid + ", duedate="
				+ duedate + ", fine=" + fine + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(bookid, duedate, fine, loanid, memberid);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan_management other = (Loan_management) obj;
		return bookid == other.bookid && Objects.equals(duedate, other.duedate)
				&& Double.doubleToLongBits(fine) == Double.doubleToLongBits(other.fine) && loanid == other.loanid
				&& memberid == other.memberid;
	}
	
	

}

package com.hexaware.librarymanagementsystem.entities;

import java.util.Objects;

public class Reports {
	
	private int reportid;
	private int finescollected;
	private String useractivity;
	private String bookstatus;
	

	public Reports() {
		// TODO Auto-generated constructor stub
	}


	public Reports(int reportid, int finescollected, String useractivity, String bookstatus) {
		super();
		this.reportid = reportid;
		this.finescollected = finescollected;
		this.useractivity = useractivity;
		this.bookstatus = bookstatus;
	}


	public int getReportid() {
		return reportid;
	}


	public void setReportid(int reportid) {
		this.reportid = reportid;
	}


	public int getFinescollected() {
		return finescollected;
	}


	public void setFinescollected(int finescollected) {
		this.finescollected = finescollected;
	}


	public String getUseractivity() {
		return useractivity;
	}


	public void setUseractivity(String useractivity) {
		this.useractivity = useractivity;
	}


	public String getBookstatus() {
		return bookstatus;
	}


	public void setBookstatus(String bookstatus) {
		this.bookstatus = bookstatus;
	}


	@Override
	public String toString() {
		return "reports [reportid=" + reportid + ", finescollected=" + finescollected + ", useractivity=" + useractivity
				+ ", bookstatus=" + bookstatus + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(bookstatus, finescollected, reportid, useractivity);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reports other = (Reports) obj;
		return Objects.equals(bookstatus, other.bookstatus) && finescollected == other.finescollected
				&& reportid == other.reportid && Objects.equals(useractivity, other.useractivity);
	}
	
	

}

package com.hexaware.librarymanagementsystem.services;

import java.util.List;

import com.hexaware.librarymanagementsystem.entities.Reports;

public interface IReports {
	
	public int createReports(Reports reports);
	public int updateReports(Reports reports);
	public int deleteReports(int Report_Id);
	public Reports getReportsById(int Report_Id);
	public List<Reports>getAllAdmin();

}

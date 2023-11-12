package com.hexaware.librarymanagementsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Reports;

@Service
public class ReportsService implements IReports {

	@Override
	public int createReports(Reports reports) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateReports(Reports reports) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteReports(int Report_Id) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Reports getReportsById(int Report_Id) {
		// TODO Auto-generated method stub
		Reports reports = new Reports(10,200,"active","pending");
		return reports;
	}

	@Override
	public List<Reports> getAllAdmin() {
		List<Reports> reports = new ArrayList<Reports>();
		reports.add(new Reports(110,200,"active","pending"));
		reports.add(new Reports(102,100,"active","pending"));
		
		return reports;
	}

}

package com.hexaware.librarymanagementsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Loan_management;

@Service
public class Loan_managementService implements ILoan_management {

	@Override
	public int createLoan(Loan_management loan) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateLoan(Loan_management loan) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteLoan(int Loan_Id) {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Loan_management getLoanById(int Loan_Id) {
		Loan_management loan= new Loan_management(501,101,12,"10-02=2023",200);
		return loan;
	}

	@Override
	public List<Loan_management> getAllAdmin() {
		List<Loan_management> loan = new ArrayList<Loan_management>();
		loan.add(new Loan_management(501,101,12,"10-02=2023",200));
		loan.add(new Loan_management(511,121,42,"20-02=2023",100));
		
		return loan;
	}

}

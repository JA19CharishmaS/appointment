package com.hexaware.librarymanagementsystem.services;

import java.util.List;

import com.hexaware.librarymanagementsystem.entities.Loan_management;


public interface ILoan_management {

	public int createLoan(Loan_management loan);
	public int updateLoan(Loan_management loan);
	public int deleteLoan(int Loan_Id);
	public Loan_management getLoanById(int Loan_Id);
	public List<Loan_management>getAllAdmin();
}

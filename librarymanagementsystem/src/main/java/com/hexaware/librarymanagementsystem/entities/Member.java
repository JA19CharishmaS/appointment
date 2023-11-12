package com.hexaware.librarymanagementsystem.entities;

import java.util.Objects;

public class Member {
	
	private int memberid;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String accountstatus;
	
	
	public Member(int memberid, String firstname, String lastname, String email, String password,
			String accountstatus) {
		super();
		this.memberid = memberid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.accountstatus = accountstatus;
	}



	public int getMemberid() {
		return memberid;
	}



	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountstatus() {
		return accountstatus;
	}

	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}

	
	public Member() {
		super();
	}



	@Override
	public String toString() {
		return "member [memberid=" + memberid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", accountstatus=" + accountstatus + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(accountstatus, email, firstname, lastname, memberid, password);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(accountstatus, other.accountstatus) && Objects.equals(email, other.email)
				&& Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname)
				&& memberid == other.memberid && Objects.equals(password, other.password);
	}

	
}

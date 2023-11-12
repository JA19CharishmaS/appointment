package com.hexaware.librarymanagementsystem.services;



import java.util.List;

import com.hexaware.librarymanagementsystem.entities.Member;

public interface IMember {
	public int createMember(Member member);
	public int updateMember(Member member);
	public int deleteMember(int Member_Id);
	public Member getMemberById(int Member_Id);
	public List<Member>getAllAdmin();

}

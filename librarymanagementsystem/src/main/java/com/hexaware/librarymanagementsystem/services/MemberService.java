package com.hexaware.librarymanagementsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Member;

@Service
public class MemberService implements IMember {

	@Override
	public int createMember(Member member) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteMember(int Member_Id) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Member getMemberById(int Member_Id) {
		Member member= new Member(101,"chan","roy","sa@234","sad","active");
		return member;
	}

	@Override
	public List<Member> getAllAdmin() {
		List<Member> member = new ArrayList<Member>();
		member.add(new Member(101,"chan","roy","sa@234","sad","active"));
		member.add(new Member(109,"ryan","ray","gaaa@234","happad","active"));
		
		return member;
	}

}

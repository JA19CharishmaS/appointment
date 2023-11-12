package com.hexaware.librarymanagementsystem.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.librarymanagementsystem.entities.Borrowing;
import com.hexaware.librarymanagementsystem.entities.Member;

class MemberServiceTest {
	MemberService service = new MemberService();

	@Test
	void testCreateMember() {
		Member member = new Member();
		int actual = service.createMember(member);
	    assertEquals(1,actual);
	}

	@Test
	void testUpdateMember() {
		Member member = new Member();
		int actual = service.updateMember(member);
	    assertEquals(1,actual);
	}

	@Test
	void testDeleteMember() {
		Member member = new Member();
		int actual = service.deleteMember(1);
	    assertEquals(1,actual);
	}

	@Test
	void testGetMemberById() {
		Member expected = new Member(101,"chan","roy","sa@234","sad","active");
		Member actual = service.getMemberById(10);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllAdmin() {
		List<Member> expected = new ArrayList<Member>();
		expected.add(new Member(101,"chan","roy","sa@234","sad","active"));
		expected.add(new Member(109,"ryan","ray","gaaa@234","happad","active"));
		List<Member> actual = service.getAllAdmin();
		assertEquals(expected,actual);
	}

}

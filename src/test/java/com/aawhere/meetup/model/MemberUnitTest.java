package com.aawhere.meetup.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberUnitTest {

	public static final String AARON_ROLLER_MEMBER_FILENAME = "meetup-member-187678769.json";

	public static final Long AARON_ROLLER_MEMBER_ID = new Long(187678769);

	/**
	 * The file was obtained using the /self endpoint., but assumed to be the same as member/:id
	 * endpoint.
	 */
	@Test
	public void testMemberSelf() {
		Member member = JsonParserTestUtil.read(AARON_ROLLER_MEMBER_FILENAME, Member.class);
		assertNotNull(member);
		assertEquals(AARON_ROLLER_MEMBER_ID, member.getId());
		assertNotNull(member.getPhoto());
		assertNotNull(member.getName());
		assertNotNull(member.getLink());
	}
}
